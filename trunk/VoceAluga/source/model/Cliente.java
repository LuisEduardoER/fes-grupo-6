/*
 * CÓDIGO GERADO PELO RAPDIS
 * www.geti.dcc.ufrj.br
 * Data da geração 20/11/2007
 * Hora da geração 05:16 PM
 * 
 * Nome Voce Aluga
 * E-mail Seu Email
 * Autor Grupo 6
 * Versão 1.0
 */
package model;

import java.util.List;

public class Cliente extends DomainDB {

    /**
     * Construtor dessa classe
     */
    public Cliente(){
    }
    
    // TODO: Fazer um sql para isso depois
    public umCliente find(String clienteCpf) {
    	List<umCliente> l = findAll(new umCliente());
    	l.remove(0);
    	for( umCliente c : l ) {
    		if( c.getClienteCpf().equals(clienteCpf) ) {
    			return c;
    		}
      	}
    	return null;
    }

}