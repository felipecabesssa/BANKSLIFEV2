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

import br.com.bankslife.backend.entities.Produto;
import br.com.bankslife.backend.services.ProdutoService;

@RestController
@RequestMapping({"/produtos"})
public class ProdutoController {
	
	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping
	public ResponseEntity<List<Produto>> acheTodos(){
		List<Produto> list = produtoService.acheTodos();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(path = {"/{id}"})
	public ResponseEntity<?> achePorId(@PathVariable Integer id){
		Produto list = produtoService.achePorId(id);
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping
	public ResponseEntity<Produto> cria(@RequestBody Produto produto){
		produto = produtoService.salva(produto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(produto.getId()).toUri();
		return ResponseEntity.created(uri).body(produto);
	}
	
	@RequestMapping(value = {"/{id}"}, method = RequestMethod.PUT)
	public ResponseEntity<Produto> atualiza(@RequestBody Produto produto, @PathVariable Integer id){
		produto = produtoService.atualiza(produto, id);
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping(path = {"/{id}"})
	public ResponseEntity<?> deleta(@PathVariable Integer id){
		produtoService.deleta(id);
		return ResponseEntity.noContent().build();
	}

}
