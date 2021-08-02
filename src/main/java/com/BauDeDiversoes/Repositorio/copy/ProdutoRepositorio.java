package com.BauDeDiversoes.Repositorio.copy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BauDeDiversoes.Model.Produto;

public interface ProdutoRepositorio extends JpaRepository< Produto, Long> {

public List<Produto>findAllByNomeContainingIgnoreCase( String nome);
}
