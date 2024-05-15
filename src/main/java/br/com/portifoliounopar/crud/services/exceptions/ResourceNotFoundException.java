package br.com.portifoliounopar.crud.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Object id) {
		super("Não foi encontrado o usuário com a id " + id);
	}
}
