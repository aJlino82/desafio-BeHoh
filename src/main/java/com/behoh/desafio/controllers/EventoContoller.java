package com.behoh.desafio.controllers;

import com.behoh.desafio.entities.Evento;
import com.behoh.desafio.entities.Usuario;
import com.behoh.desafio.repositories.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/evento")
public class EventoContoller {

    @Autowired
    private EventoRepository repository;

    @PostMapping //Cria um novo evento.
    public Evento create(@RequestBody Evento evento){
        return repository.save(evento);
    }

    @GetMapping //Retorna todos os eventos.
    public List<Evento> findAll(){
        return repository.findAll();
    }

    @GetMapping(path = "/{id}") //Retorna os eventos pelo id.
    public ResponseEntity findById(@PathVariable Long id) {
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

}

