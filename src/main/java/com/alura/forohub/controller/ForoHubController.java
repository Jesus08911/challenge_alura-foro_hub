package com.alura.forohub.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ForoHubController {

    @PostMapping("/topicos")
    public ResponseEntity<String> registrarTopico(){
        return ResponseEntity.ok().body("Se agrego un topico");
    }

    @GetMapping("/topicos")
    public ResponseEntity<String> listarTopicos(){
        return ResponseEntity.ok().body("Lista de topico");
    }

    @PutMapping("/topicos")
    public ResponseEntity<String> actualizarTopicos(){
        return ResponseEntity.ok().body("Actualiza topico");
    }

    @DeleteMapping("/topicos")
    public ResponseEntity<String> eliminaarTopicos(){
        return ResponseEntity.ok().body("Elimina topico");
    }

    //Autenticacion
}
