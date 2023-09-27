package com.senai.Daniel.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cliente")
public class Cliente {
	
	//atributos da classe
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcCliente;
	
	@Column(name = "nCliente")
	private String nCliente;
	
	@Column(name = "fone")
	private String fone;
	
	//métodos da classe
	public Long getId() {
		return idcCliente;
	}
	public String getName() {
	 return nCliente;
 }
	public String getPrice() {
		return fone;
	}
	public void setId(Long idcCliente) {
		this.idcCliente = idcCliente;
	}
	public void setName(String nCliente) {
		this.nCliente = nCliente;
	}
	public void setPrice(String price) {
		this.fone = fone;
	}
	
}