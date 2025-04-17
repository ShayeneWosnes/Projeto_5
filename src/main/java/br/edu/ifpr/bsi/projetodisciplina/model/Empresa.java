package br.edu.ifpr.bsi.projetodisciplina.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_empresa")

public class Empresa extends GenericModel {
    @Column
    private String nome;
    @Column
    private String cnpj;
    @Column
    private String logradouro;

}
