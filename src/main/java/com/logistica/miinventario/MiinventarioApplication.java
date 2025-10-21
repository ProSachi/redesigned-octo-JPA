package com.logistica.miinventario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.logistica.miinventario.model.Categoria;
import com.logistica.miinventario.model.Producto;
import com.logistica.miinventario.repository.CategoriaRepository;
import com.logistica.miinventario.repository.ProductoRepository;

@SpringBootApplication
public class MiinventarioApplication implements CommandLineRunner {

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    public static void main(String[] args) {
        SpringApplication.run(MiinventarioApplication.class, args);
    }

    
    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n--- CRUD BÁSICO PRODUCTO---");

     System.out.println("\n--- CRUD BÁSICO CATEGORIA ---");
        // CREATE
        System.out.println("1. Creando y guardando una categoria ...");
        Categoria Categoriainicial = new Categoria("Escolar");
        categoriaRepository.save(Categoriainicial);
        System.out.println("Categoria guardada: " + Categoriainicial);
        // READ
        System.out.println("\n2. Leyendo todas las categorias...");
        categoriaRepository.findAll().forEach(c -> System.out.println("-> " + c.getNombre()));
    
    
    }

}
