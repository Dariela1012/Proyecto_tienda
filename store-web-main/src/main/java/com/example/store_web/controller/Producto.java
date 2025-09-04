package com.example.store_web.model;

import jakarta.persistence.*;

@Entity
@Table(name = "productp")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_producto")
    private Integer idProducto;

    @Column(name ="nombre", nullable = false. length = 100)
    private String nombre;
}
