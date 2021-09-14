package com.behoh.desafio.repositories;

import com.behoh.desafio.entities.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Long> {

}
