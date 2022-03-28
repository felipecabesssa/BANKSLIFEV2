package br.com.bankslife.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bankslife.backend.entities.Categoria;
import br.com.bankslife.backend.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepo;
	
	public List<Categoria> acheTodos(){
		return categoriaRepo.findAll();
	}
	
	public Optional<Categoria> achePorId(Integer id){
		Optional<Categoria> obj = categoriaRepo.findById(id);
		return obj;
	}
	
	public Categoria salva(Categoria categoria) {
		return categoriaRepo.save(categoria);
	}
	
	public Categoria atualiza(Categoria categoria, Integer id) {
		categoria.setId(id);
		return categoriaRepo.save(categoria);
	}
	
	public void deleta(Integer id) {
		categoriaRepo.deleteById(id);
	}

}
