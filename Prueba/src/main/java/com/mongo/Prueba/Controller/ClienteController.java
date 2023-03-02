package com.mongo.Prueba.Controller;

import com.mongo.Prueba.Models.Cliente;
import com.mongo.Prueba.Services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    ClienteService clienteService;

    @GetMapping("/listarcliente")
    public ResponseEntity<List<Cliente>> listarProductos() {
        return new ResponseEntity<>(clienteService.findByAll(),
                HttpStatus.OK);
    }

    @PostMapping("/crearcliente")
    public ResponseEntity<Cliente> crearProducto(
            @RequestBody Cliente c) {
        return new ResponseEntity<>(clienteService.save(c),
                HttpStatus.CREATED);
    }

    @PutMapping("/actualizarcliente/{id}")
    public ResponseEntity<Cliente> actualizarProducto(@PathVariable Long id, @RequestBody Cliente c) {
        Cliente clienteEncontrado = clienteService.findById(id);
        if (clienteEncontrado == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                clienteEncontrado.setNombre(c.getNombre());
                clienteEncontrado.setApellido(c.getApellido());
                clienteEncontrado.setCedula(c.getCedula());
                clienteEncontrado.setCorreo(c.getCorreo());
                return new ResponseEntity<>(clienteService.save(c), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminarcliente/{id}")
    public ResponseEntity<Cliente> eliminarProducto(@PathVariable Long id) {
        clienteService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}