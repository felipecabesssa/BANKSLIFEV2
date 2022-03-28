package br.com.bankslife.backend.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.bankslife.backend.entities.Categoria;
import br.com.bankslife.backend.services.CategoriaService;

@RestController
@RequestMapping({"/categorias"})
public class CategoriaController {
	
	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> acheTodos(){
		List<Categoria> list = categoriaService.acheTodos();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(path = {"/{id}"})
	public ResponseEntity<?> achePorId(@PathVariable Integer id){
		Categoria list = categoriaService.achePorId(id);
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping
	public ResponseEntity<Categoria> cria(@RequestBody Categoria categoria){
		categoria = categoriaService.salva(categoria);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(categoria.getId()).toUri();
		return ResponseEntity.created(uri).body(categoria);
	}
	
	@RequestMapping(value = {"/{id}"}, method = RequestMethod.PUT)
	public ResponseEntity<Categoria> atualiza(@RequestBody Categoria categoria, @PathVariable Integer id){
		categoria = categoriaService.atualiza(categoria, id);
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping(path = {"/{id}"})
	public ResponseEntity<?> deleta(@PathVariable Integer id){
		categoriaService.deleta(id);
		return ResponseEntity.noContent().build();
	}

}
