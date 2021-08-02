package com.BauDeDiversoes.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table (name = "tb_Produto")
public class Produto
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	
	@NotBlank
	private String nome;
	
	
	@NotBlank
	private double preco;
	
	
	// @ManyToOne
	   // @JsonIgnoreProperties("tb_produtos")
	    //private Categoria categoria;
	
	
	
	
}
