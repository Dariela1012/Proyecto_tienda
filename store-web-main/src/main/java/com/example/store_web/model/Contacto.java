package com.example.store_web.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name ="contacto")
public class Contacto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contacto")
    private Integer idContacto;
    
}
