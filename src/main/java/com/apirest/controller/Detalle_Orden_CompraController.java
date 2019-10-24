/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.controller;

import com.apirest.dao.Detalle_Orden_CompraDao;
import com.apirest.dao.DominioDao;
import com.apirest.model.Detalle_Orden_Compra;
import com.apirest.model.Dominio;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jhon.carrasco
 */
@RestController
@RequestMapping("/siglo21")
public class Detalle_Orden_CompraController {

    private static final Logger log = LoggerFactory.getLogger(Detalle_Orden_CompraController.class);
    
   
    @Autowired
    Detalle_Orden_CompraDao dao;

    @PutMapping("/detalle_orden_compra")
    public boolean agregarDominio(@RequestBody @Valid Detalle_Orden_Compra obj) {
        Optional id = dao.crear(obj); 
        return id.isPresent();
    }

    @PostMapping("/detalle_orden_compra")
    public boolean actualizarDominio(@RequestBody @Valid Detalle_Orden_Compra obj) {
        Optional estado = dao.actualizar(obj); 
        return estado.isPresent();
    }

    @DeleteMapping("/detalle_orden_compra/{id}")
    public boolean borrarDominio(@PathVariable("id") long id) {
        Optional estado = dao.borrar(id); 
        return estado.isPresent();
    }

    @GetMapping("/detalle_orden_compra/{id}")
    public List<Detalle_Orden_Compra> ObtenerDetalle_Orden_CompraPorID(@PathVariable("id") long id) {               
        return dao.obtener(id);
    }
    
}
