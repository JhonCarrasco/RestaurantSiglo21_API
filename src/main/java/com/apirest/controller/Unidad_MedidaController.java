/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.controller;

import com.apirest.dao.LoginDao;
import com.apirest.dao.ProveedorDao;
import com.apirest.dao.RolDao;
import com.apirest.dao.Unidad_MedidaDao;
import com.apirest.dao.UsuarioDao;
import com.apirest.model.Login;
import com.apirest.model.Proveedor;
import com.apirest.model.Rol;
import com.apirest.model.Unidad_Medida;
import com.apirest.model.Usuario;
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
public class Unidad_MedidaController {

    private static final Logger log = LoggerFactory.getLogger(Unidad_MedidaController.class);
    
   
    @Autowired
    Unidad_MedidaDao dao;

    @PutMapping("/unidad_medida")
    public boolean agregarUsuario(@RequestBody @Valid Unidad_Medida obj) {
        Optional id = dao.crear(obj); 
        return id.isPresent();
    }

    @PostMapping("/unidad_medida")
    public boolean actualizarUsuario(@RequestBody @Valid Unidad_Medida obj) {
        Integer estado = dao.actualizar(obj); 
        boolean success = Optional.of(estado).equals(Optional.of(1));
        return success;
    }

    @DeleteMapping("/unidad_medida/{id}")
    public boolean borrarUsuario(@PathVariable("id") long id) {
        Integer estado = dao.borrar(id); 
        boolean success = Optional.of(estado).equals(Optional.of(1));
        return success;
    }

    @GetMapping("/unidad_medida/{id}")
    public List<Unidad_Medida> ObtenerUnidadMedidaPorID(@PathVariable("id") long id) {               
        return dao.obtener(id);
    }
    
}
