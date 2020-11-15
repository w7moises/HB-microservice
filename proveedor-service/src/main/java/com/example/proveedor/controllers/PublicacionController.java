package com.example.proveedor.controllers;

import com.example.proveedor.entities.Proveedor;
import com.example.proveedor.entities.Publicacion;
import com.example.proveedor.services.PublicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/publicaciones")
public class PublicacionController {

    @Autowired
    private PublicacionService publicacionService;


    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Publicacion>> fetchAll() {
        try {
            List<Publicacion> publicaciones = publicacionService.findAll();
            return new ResponseEntity<List<Publicacion>>(publicaciones, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(path = "/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Publicacion> fetchById(@PathVariable("id") Long id) {
        try {
            Optional<Publicacion> optionalPublicacion = publicacionService.findById(id);
            if(optionalPublicacion.isPresent()) {
                return new ResponseEntity<Publicacion>(optionalPublicacion.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch( Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
