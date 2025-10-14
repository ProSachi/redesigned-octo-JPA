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

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "misproductos")
public class Producto {

@GeneratedValue(strategy = GenerationType.IDENTITY)
@Id
private Long id;

@Column(name = "nombre_producto", length = 50, unique = true)
private String nombre;

@Column(name = "precio_producto", nullable = false) 
private int precio;

public Producto(String nombre, int precio) {
    this.nombre = nombre;
    this.precio = precio;
}


}
