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
    
}
