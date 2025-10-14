package com.logistica.miinventario.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity // Para decir que representa una tabla en la base de datos
@Data // Para hacer getter, setter, toString, constructor inicial
@NoArgsConstructor // Crea el constructor vacio
@AllArgsConstructor // Crea el constructor con argumentos
@Table(name = "miscategorias") // para personalizar el nombre de la tabla
public class Categoria {
    
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Id
private Long id;

@Column(name = "nombre_categoria", length = 50, unique = true)
private String nombre;

public Categoria(String nombre) {
    this.nombre = nombre;
}

}
