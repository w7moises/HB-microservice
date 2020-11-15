package pe.edu.upc.cliente.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.cliente.entities.Cliente;
import pe.edu.upc.cliente.entities.Reseña;
import pe.edu.upc.cliente.services.ReseñaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reseñas")
public class ReseñaController {

    @Autowired
    private ReseñaService reseñaService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Reseña>> fetchAll() {
        try {
            List<Reseña> reseñas = reseñaService.findAll();
            return new ResponseEntity<List<Reseña>>(reseñas, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(path = "/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Reseña> fetchById(@PathVariable("id") Long id) {
        try {
            Optional<Reseña> optionalReseña = reseñaService.findById(id);
            if(optionalReseña.isPresent()) {
                return new ResponseEntity<Reseña>(optionalReseña.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch( Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
