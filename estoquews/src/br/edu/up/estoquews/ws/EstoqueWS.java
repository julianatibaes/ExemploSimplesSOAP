package br.edu.up.estoquews.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.edu.up.estoquews.mode.usuario.AutorizacaoException;
import br.edu.up.estoquews.model.item.Item;
import br.edu.up.estoquews.model.item.ItemDao;
import br.edu.up.estoquews.model.item.ListaItens;
import br.edu.up.estoquews.model.usuario.TokenDao;
import br.edu.up.estoquews.model.usuario.TokenUsuario;

@WebService
public class EstoqueWS {

	private ItemDao dao = new ItemDao();

	//1. Elemento com o nome da operação
	@WebMethod(operationName="todosOsItens")
	//2. Personalizando o retorno 
	//@WebResult(name="item")
	/*public List<Item> getItens() {

		System.out.println("Chamando getItens()");
		return dao.todosItens();
	}
	*/
	//3. personaliza a lista de retorno depois de alterado a classe ListaItens
	@WebResult(name="itens")
	public ListaItens getItens(){
		System.out.println("Chamando getItens()");
		//criando uma ListaItens
		return new ListaItens(dao.todosItens());
	}
	
	//4. Criar a funcionalidade de cadastrar um item
	/*@WebMethod(operationName="cadastrarItem")
	@WebResult(name="item")
	public Item cadastrarItem(@WebParam(name="item")Item item) {
		  System.out.println("Cadastrando " + item);
		  this.dao.cadastrar(item);
		  return item;
		}
	*/
	//5. Adicionar o usuário no item cadastrado
	/*	@WebMethod(operationName="cadastrarItem")
		@WebResult(name="item")
		public Item cadastrarItem(@WebParam(name="tokenUsuario", header=true)TokenUsuario token, 
				@WebParam(name="item")Item item) {
			
			  System.out.println("Cadastrando " + item +", "+ token);
			  		  
			  this.dao.cadastrar(item);
			  return item;
			}
		*/
	//6. Validação do token, contendo a nova classe de autorizacao
	@WebMethod(operationName="cadastrarItem")
	@WebResult(name="item")
	public Item cadastrarItem(@WebParam(name="tokenUsuario", header=true)TokenUsuario token, 
			@WebParam(name="item")Item item) throws AutorizacaoException{
		
		  System.out.println("Cadastrando " + item +", "+ token);
		  
		  boolean valido =	new TokenDao().ehValido(token);
		  if(!valido){
			  throw new AutorizacaoException("Token invalido");
		  }
		  
		  this.dao.cadastrar(item);
		  return item;
		}
		
}
