/*
 * C�DIGO GERADO PELO RAPDIS
 * www.geti.dcc.ufrj.br
 * Data da gera��o 24/10/2007
 * Hora da gera��o 09:11 AM
 * 
 * Nome Voce Aluga
 * E-mail Seu Email
 * Autor Grupo 6
 * Vers�o 1.0
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Grupo implements ActionListener{

    public Grupo(){
    
    }

	private int currentState;


	/**
	 * Implementa��o dos diagrama de sequ�ncia associado ao controle
	 */
	public void beginCase(){
	}

	/**
	 *  Respons�vel pelo tratamentos dos eventos vindos
	 *  da interface,implementa a l�gica do caso de uso.
	 * @param Msg
	 */
	private void eventHandler(int msg){
	}

	/**
	 * Recebe os eventos da interface e repassa para
	 * o EventHandler para serem tratados
	 * @param evt
	 */
	public void actionPerformed(ActionEvent evt) {
		eventHandler(Integer.parseInt(evt.getActionCommand()));
	}

}
