package br.edu.up.estoquews.model.item;

import java.util.List;

public class ItemValidadorException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ItemValidadorException(List<String> erros) {
		super(erros.toString());
	}
	
}
