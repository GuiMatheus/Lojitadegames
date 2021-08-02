package com.BauDeDiversoes.Repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BauDeDiversoes.Model.Categoria;


@Repository
public interface CategoriaRepositorio extends JpaRepository<Categoria, Long>{

    public List<Categoria>findAllByDescricaoContainingIgnoreCase( String descricao);
}
