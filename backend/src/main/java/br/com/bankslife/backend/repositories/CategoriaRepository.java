package br.com.bankslife.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bankslife.backend.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
