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

public class ListaNegra extends DomainDB {

    /**
     * Construtor dessa classe
     */
    public ListaNegra(){
    }

	public umListaNegra find( int id_cliente ) {
		List<umListaNegra> l = findAll(new umListaNegra());
		l.remove(0);
		for( umListaNegra ln : l ) {
			if( ln.getClienteId() == id_cliente ) {
				return ln;
			}
	  	}
		return null;
	}

}