package br.edu.up.estoquews.ws;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class PublicaEstoqueWS {

	public static void main(String[] args) {

        EstoqueWS implementacaoWS = new EstoqueWS();
        String URL = "http://localhost:8080/estoquews";

        System.out.println("EstoqueWS rodando: " + URL);

        /*
         * Como não estamos usando um servidor formal 
         * é preciso publicar o serviço programaticamente. 
         * No mundo de serviços web isso é chamado de 
         * publicar o Endpoint.
         * O Endpoint é o endereço concreto do serviço
         * Ou seja, associando URL com implementacao
         */
        Endpoint.publish(URL, implementacaoWS);
    }
}
