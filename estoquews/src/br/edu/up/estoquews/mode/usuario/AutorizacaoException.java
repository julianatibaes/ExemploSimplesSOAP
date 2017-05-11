package br.edu.up.estoquews.mode.usuario;

import javax.xml.ws.WebFault;

/*
 * 2. No mundo SOAP n�o existem exce��es e sim Faults. 
 * Uma exce��o no mundo Java � traduzido para um Fault.
 */
@WebFault(name="AutorizacaoFault")
public class AutorizacaoException extends Exception {

	/**
	 * n�o importa muito nesse contexto , mas � necess�ria pela estrura
	 */
	private static final long serialVersionUID = 1L;
	
	public AutorizacaoException(String msg) {
	    super(msg);
	  }
	
	/*
	 * 2. personalizando a mensagem de retorno no soap
	 */
	public String getFaultInfo(){
		return "Token inv�lido";
	}
}
