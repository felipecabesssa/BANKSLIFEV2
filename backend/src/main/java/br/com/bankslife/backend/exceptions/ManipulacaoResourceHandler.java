package br.com.bankslife.backend.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ManipulacaoResourceHandler {
	
	@ExceptionHandler(ResourceNaoEncontradoException.class)
	public ResponseEntity<ErroPadraoStandar> RecursoNaoEncontrado(ResourceNaoEncontradoException e, HttpServletRequest request) {
		String error = "Não achamos a exceção";
		HttpStatus status = HttpStatus.NOT_FOUND;
		String message = e.getMessage();
		ErroPadraoStandar err = new ErroPadraoStandar(Instant.now(), status.value(), error, message, request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}

}
