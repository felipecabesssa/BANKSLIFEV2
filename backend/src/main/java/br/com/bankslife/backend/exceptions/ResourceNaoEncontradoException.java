package br.com.bankslife.backend.exceptions;

public class ResourceNaoEncontradoException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ResourceNaoEncontradoException(Object id) {
		super("Recurso não encontrado com o id = " + id);
	}

}
