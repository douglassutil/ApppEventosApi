package com.br.appEventoEsportivos.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@Entity
@Table(name = "USUARIO")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_USUARIO")
	private Long idUsuario;

	@Column(name = "NOME")
	private String nome;

	@Column(name = "DTA_NASCIMENTO")
	private String dtaNascimento;

	@Column(name = "SEXO")
	private String sexo;
	
	@Column(name = "CELULAR")
	private String celular;

	@Column(name = "TELEFONE")
	private String telefone;

	@Column(name = "CPF")
	private String cpf;

	@Column(name = "EMAIL")
	private String email;

	//@Column(name = "ID_ENDERECO")
	//private String idEndereco;

	@OneToOne(mappedBy="Usuario",cascade = CascadeType.ALL)
	//@JoinColumn(name = "ID_ENDERECO", referencedColumnName = "ID_ENDERECO")
	private Endereco Endereco;

}
