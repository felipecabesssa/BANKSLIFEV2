package br.com.bankslife.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bankslife.backend.entities.Produto;
import br.com.bankslife.backend.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepo;
	
	public List<Produto> acheTodos(){
		return produtoRepo.findAll();
	}
	
	public Optional<Produto> achePorId(Integer id){
		Optional<Produto> obj = produtoRepo.findById(id);
		return obj;
	}
	
	public Produto salva(Produto produto) {
		return produtoRepo.save(produto);
	}
	
	public Produto atualiza(Produto produto, Integer id) {
		produto.setId(id);
		return produtoRepo.save(produto);
	}
	
	public void deleta(Integer id) {
		produtoRepo.deleteById(id);
	}

}
