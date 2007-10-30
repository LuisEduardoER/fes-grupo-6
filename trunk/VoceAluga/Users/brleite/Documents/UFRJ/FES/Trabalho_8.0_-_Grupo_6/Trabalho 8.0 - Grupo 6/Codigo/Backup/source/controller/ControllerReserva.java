/*
 * CÓDIGO GERADO PELO RAPDIS
 * www.geti.dcc.ufrj.br
 * Data da geração 23/10/2007
 * Hora da geração 09:20 PM
 * 
 * Nome Voce Aluga
 * E-mail Seu Email
 * Autor Grupo 6
 * Versão 1.0
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.ModelReserva;
import view.ViewReserva;

public class ControllerReserva implements ActionListener{

    public ControllerReserva(){
    
    }

	private int currentState;
    private ViewReserva viewReserva;

    private ModelReserva modelReserva;



	/**
	 * Implementação dos diagrama de sequência associado ao controle
	 */
	public void beginCase(){
        // Seqüência referente ao diagrama: DS Reserva
        modelReserva = new ModelReserva();
        viewReserva = new ViewReserva();


        //Associa a classe ControllerReserva a esse controle
        viewReserva.setListener(this);

        viewReserva.setVisible(true);
	}

	/**
	 *  Responsável pelo tratamentos dos eventos vindos
	 *  da interface,implementa a lógica do caso de uso.
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
