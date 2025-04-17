package br.edu.ifpr.bsi.projetodisciplina.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cidade")

public class Cidade extends GenericModel{

    @Column
    private String nome;
    @Column
    private String estado;
    @Column
    private String cep;


}
