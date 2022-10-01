package me.dio.sacola.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Produto {
    @Id
    @GenereatedValue(strategy = GenerationType.AUTO)
    private Lond id;
    private String nome;
    private Double valorUnitario;
    @Builder.Default
    private Boolean disponivel = true;
    @ManyToOne
    @JsonIgnore
    private Restaurante restaurante;

}
