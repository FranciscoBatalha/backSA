package com.example.cadastros.model;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;

@Entity
@Getter
@Setter
public class RegistroSaida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String data_hora;
    private boolean saida_antecipada;

    @ManyToOne
    private Aluno aluno;
}
