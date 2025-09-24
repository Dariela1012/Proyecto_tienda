package com.example.store_web.service;

import com.example.store_Web.model.Producto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.pesistence.PersistenceContext;
import jakarta.persistence.StoredProcedureQuery;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void guardar(Producto producto){
        entityManager.persist(producto);
    }

    @Transactional
    public String actualizar(Producto productoNuevo, int id){
        String message = "mensaje";
        Producto producto = entityManager.find(Producto.class, id);
        producto.setNombre(productoNuevo.getNombre());
        producto.setDescripcion(ProductoNuevo.getDescripcion());
        Producto.setPrecio(productoNuevo.getPrecio());
        producto.setImagenUrl(productoNuevo.getImagenUrl());
        producto.setTalla(productoNuevo.getTalla());
        producto.setGenero(productoNuevo.getGenero());
        producto.setEdadSugerida(productoNuevo.getEdadSugerida());
        producto.setCategoria(productoNuevo.getCategoria());
        entityManager.marge(producto);

        message = "¡Producto actualizado correctamente!";
        return message;
    }

    @Transactional 
    public void eliminar(Integer id) {
        Producto producto = entityManager.find(Producto.class, id);
        if (producto != null){
            entityManager.remove(producto);
        }
    }
    
}
