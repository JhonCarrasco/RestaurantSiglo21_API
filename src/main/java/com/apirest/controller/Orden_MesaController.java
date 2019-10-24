/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.controller;

import com.apirest.dao.DominioDao;
import com.apirest.dao.Orden_MesaDao;
import com.apirest.dao.RecetaDao;
import com.apirest.model.Dominio;
import com.apirest.model.Orden_Mesa;
import com.apirest.model.Receta;
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
public class Orden_MesaController {

    private static final Logger log = LoggerFactory.getLogger(Orden_MesaController.class);
    
   
    @Autowired
    Orden_MesaDao dao;

    @PutMapping("/orden_mesa")
    public boolean agregarOrden_Mesa(@RequestBody @Valid Orden_Mesa obj) {
        Optional id = dao.crear(obj); 
        return id.isPresent();
    }

    @PostMapping("/orden_mesa")
    public boolean actualizarOrden_Mesa(@RequestBody @Valid Orden_Mesa obj) {
        Optional estado = dao.actualizar(obj); 
        return estado.isPresent();
    }

    @DeleteMapping("/orden_mesa/{id}")
    public boolean borrarOrden_Mesa(@PathVariable("id") long id) {
        Optional estado = dao.borrar(id); 
        return estado.isPresent();
    }

    @GetMapping("/orden_mesa/{id}")
    public List<Orden_Mesa> ObtenerOrden_MesaPorID(@PathVariable("id") long id) {               
        return dao.obtener(id);
    }
    
}
