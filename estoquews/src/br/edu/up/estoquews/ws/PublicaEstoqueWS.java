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
         * Como n�o estamos usando um servidor formal 
         * � preciso publicar o servi�o programaticamente. 
         * No mundo de servi�os web isso � chamado de 
         * publicar o Endpoint.
         * O Endpoint � o endere�o concreto do servi�o
         * Ou seja, associando URL com implementacao
         */
        Endpoint.publish(URL, implementacaoWS);
    }
}
