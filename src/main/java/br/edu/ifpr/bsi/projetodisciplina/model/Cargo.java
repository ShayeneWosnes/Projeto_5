package br.edu.ifpr.bsi.projetodisciplina.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cargo")
public class Cargo extends GenericModel{

    @Column
    private String codigo;
    @Column
    private String descricao;
    @Column
    private String nome;

}
