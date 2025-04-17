package br.edu.ifpr.bsi.projetodisciplina.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_setor")

public class Setor extends GenericModel{
    @Column
    private String nome;
    @Column
    private String descricao;
    @Column
    private String telefone;
    @Column
    private String email;
}
