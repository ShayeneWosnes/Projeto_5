package br.edu.ifpr.bsi.projetodisciplina.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_funcionario")
public class Funcionario extends GenericModel {

	/* Definir 5 Atributos do Funcionário*/
	@Column(nullable = false, name = "nome_funcionario", length = 50)
	private String nome;
	@Column
	private String cpf;
	@Column
	private String rg;
	@Column
	private String telefone;
	@Column
	private String email;
	@Column
	private String celular;


}