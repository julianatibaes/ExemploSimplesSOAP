package br.edu.up.estoquews.model.item;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/*
 * Representa o elemento principal, ou a tag principal do XML
 */
@XmlRootElement

/*
 * Define onde as anotações JAXB devem ser interpretadas, nos métodos ou atributos
 * Nesse exemplo para não criar um getter e setter,
 * vamos definir o acesso pelo atributo pela anotação 
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ListaItens {

	/*
	 * Definimos que cada elemento na lista é um item
	 */
	@XmlElement(name="item")
	private List<Item> itens;

	public ListaItens(List<Item> itens) {
		this.itens = itens;
	}

	ListaItens() {
	}
	
	public List<Item> getItens() {
		return itens;
	}
	
}
