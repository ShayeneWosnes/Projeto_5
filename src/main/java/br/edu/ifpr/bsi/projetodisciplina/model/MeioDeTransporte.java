package br.edu.ifpr.bsi.projetodisciplina.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_meioTransposte")

public class MeioDeTransporte extends GenericModel{

    @Column
    private String nome;
    @Column
    private String placa;
    @Column
    private String descricao;
    @Column
    private String observacao;

}
