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

public class Filial extends DomainDB {

    /**
     * Construtor dessa classe
     */
    public Filial(){
    }

    public umFilial find( String nome_filial ) {
		List<umFilial> l = findAll(new umFilial());
		l.remove(0);
		for( umFilial f : l ) {
			if( f.getFilialNome().equals(nome_filial) ) {
				return f;
			}
	  	}
		return null;
	}

}