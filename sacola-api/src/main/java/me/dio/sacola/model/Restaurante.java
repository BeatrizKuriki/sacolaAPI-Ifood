package me.dio.sacola.model;

import javax.persistence.*;

public class Restaurante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToMany(cascade = CascadeType.ALL)
    private List <Produto> cardapio;
    @Embedded
    private Endereco endereco;


}
