package com.BauDeDiversoes.Model;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table (name = "tb_Categoria")
public class Categoria
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@NotBlank
	private String Descrição;
	
	//@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
    //@JsonIgnoreProperties("categoria")
    ///private List<Produto> produto;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getDescrição()
	{
		return Descrição;
	}

	public void setDescrição(String descrição)
	{
		Descrição = descrição;
	}

	
	

	
	
	
	
	
	
	
	
}
