package com.br.appEventoEsportivos.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@Entity
@Table(name = "EVENTO")
public class Evento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_EVENTO")
	private Long idEvento;

	@Column(name = "DTA_INICIO")
	private String dtaInicio;

	@Column(name = "MAX_PARTICIPANTE")
	private Long maxParticipante;

	@Column(name = "MIN_PARTICIPANTE")
	private Long minParticipante;

	@Column(name = "VALOR_INSCRICAO")
	private Double valorIncrição;

	@Column(name = "FORMA_PAGAMENTO")
	private String formaPagamento;

	@Column(name = "SEXO")
	private String sexo;
	
	@Column(name = "DESCRICAO")
	private String descricao;

	@Column(name = "TITULO_EVENTO")
	private String tituloEvento;

	
	@Column(name = "IMG_EVENTO")
	private String imgEvento;
	
	@Column(name = "ID_ENDERECO")
	private String idEndereco;

//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "ID_ENDERECO")
//	private Endereco end;

}
