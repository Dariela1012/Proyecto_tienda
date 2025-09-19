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

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "apellido", nullable = false, length = 100)
    private String apellido;

    @Column(name = "numero", nullable = false, length = 20)
    private String numero;
    
    @Column(name = "correo", nullable = false, length = 100)
    private String correo;

    @Column(name = "mensaje", nullable = false, columnDefinition = "TEXT")
    private String mensaje;

    @Column(name = "fecha_envio", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime fechaEnvio;

    public Integer getIdContacti(){
        return idContacto;
    }

    public void setIdeContacto(Integer idContacto){
        this.idContacto = idContacto;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
