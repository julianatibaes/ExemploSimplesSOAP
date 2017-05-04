package br.edu.up.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebResult;
import javax.jws.WebService; 
import javax.xml.ws.Endpoint;

import br.edu.up.model.produto.Produto;

@WebService
public class CadastroWS {

	public static void main(String[] args) {
		CadastroWS ws = new CadastroWS(); 
		Endpoint.publish("http://localhost:8080/ws", ws); 
		System.out.println("Servidor rodando...");
	}
	
	@WebResult(name="produto")
	public List<Produto> listar(){
		Produto p1 = new Produto(); 
		p1.setId(1L); 
		p1.setNome("Pneu"); 
		p1.setPreco(300.25); 
		
		Produto p2 = new Produto(); 
		p2.setId(2L);
		p2.setNome("Roda"); 
		p2.setPreco(200.89);
		
		List<Produto> lista = new ArrayList<Produto>(); 
		lista.add(p1); 
		lista.add(p2); 
		
		return lista;
	}  
}
