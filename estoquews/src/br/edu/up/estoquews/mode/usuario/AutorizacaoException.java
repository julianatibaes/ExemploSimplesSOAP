package br.edu.up.estoquews.mode.usuario;

import javax.xml.ws.WebFault;

/*
 * 2. No mundo SOAP não existem exceções e sim Faults. 
 * Uma exceção no mundo Java é traduzido para um Fault.
 */
@WebFault(name="AutorizacaoFault")
public class AutorizacaoException extends Exception {

	/**
	 * não importa muito nesse contexto , mas é necessária pela estrura
	 */
	private static final long serialVersionUID = 1L;
	
	public AutorizacaoException(String msg) {
	    super(msg);
	  }
	
	/*
	 * 2. personalizando a mensagem de retorno no soap
	 */
	public String getFaultInfo(){
		return "Token inválido";
	}
}
