package br.com.bankslife.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bankslife.backend.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
