package br.edu.up.model.produto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Produto implements Serializable {

	/*
	 * Serial gerado pelo Eclipse. No caso de controle de 
	 * versÃ£o manual poderia ser utilizado a opçãoo 1L, 2L...
	 */
	private static final long serialVersionUID = -5822784281410681092L;
	
	private Long id;
	private String nome;
	private Double preco;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return getNome() +" - "+ getPreco();
	}
	
}
