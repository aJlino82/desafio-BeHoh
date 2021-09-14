package com.behoh.desafio.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_users")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;


    @ManyToOne
    @JoinColumn(name="evento_fk")
    private Evento evento;


    public Usuario() {
    }

    public Usuario(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //getters & setters da tabela de relacionamento.

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
}
