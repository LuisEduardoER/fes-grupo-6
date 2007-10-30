/*
 * CÓDIGO GERADO PELO RAPDIS
 * www.geti.dcc.ufrj.br
 * Data da geração 24/10/2007
 * Hora da geração 09:11 AM
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


    // Estados referentes ao diagrama: DE Reserva Controlador
    interface GcStates{
        public static final int stDatasRecebidas = 0;

        public static final int stGrupoRecebido = 1;

        public static final int stGruposDiponivies = 2;

        public static final int stGruposEnviados = 3;

        public static final int stModelCriada = 4;

        public static final int stModeloRecebido = 5;

        public static final int stModelosDisponiveis = 6;

        public static final int stModelosEnviados = 7;

        public static final int stReservaEfetuada = 8;

        public static final int stViewCriada = 9;

    }

    // Eventos referentes ao diagrama: DE Reserva Controlador
    interface GcEvents{
        public static final int evapagardados = 0;

        public static final int evcriarview = 1;

        public static final int evefetuarreserva = 2;

        public static final int evenviamodelospvisao = 3;

        public static final int evenviargrupospvisao = 4;

        public static final int evfim = 5;

        public static final int evrecebegrupodavisao = 6;

        public static final int evrecebemodelodavisao = 7;

        public static final int evrecebemodelos = 8;

        public static final int evreceberdatasdavisao = 9;

        public static final int evverificargrupos = 10;

    }

	/**
	 * Implementação dos diagrama de sequência associado ao controle
	 */
	public void beginCase(){
        // Seqüência referente ao diagrama: DS Reserva
        modelReserva = new ModelReserva();
        viewReserva = new ViewReserva();
        viewReserva.getDataDeRetirada();
        viewReserva.getDataDeDevolucao();
        modelReserva.getGruposDisponiveis();
        viewReserva.setGrupo();
        viewReserva.getGrupo();
        modelReserva.getModelosDisponiveis();
        viewReserva.setModelo();
        viewReserva.getModelo();
        modelReserva.efetuarReserva();

        // Configura o estado inicial
        currentState = GcStates.stModelCriada;

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
        // Estados referentes ao diagrama: DE Reserva Controlador
        switch(currentState){
        case GcStates.stModelCriada:
            switch(msg){
            case GcEvents.evcriarview:
                viewReserva.changeState(GcStates.stViewCriada);
                currentState = GcStates.stViewCriada;
                break;
            }
            break;
        case GcStates.stViewCriada:
            switch(msg){
            case GcEvents.evreceberdatasdavisao:
                viewReserva.changeState(GcStates.stDatasRecebidas);
                currentState = GcStates.stDatasRecebidas;
                break;
            }
            break;
        case GcStates.stDatasRecebidas:
            switch(msg){
            case GcEvents.evverificargrupos:
                viewReserva.changeState(GcStates.stGruposDiponivies);
                currentState = GcStates.stGruposDiponivies;
                break;
            case GcEvents.evefetuarreserva:
                viewReserva.changeState(GcStates.stReservaEfetuada);
                currentState = GcStates.stReservaEfetuada;
                break;
            }
            break;
        case GcStates.stGruposDiponivies:
            switch(msg){
            case GcEvents.evenviargrupospvisao:
                viewReserva.changeState(GcStates.stGruposEnviados);
                currentState = GcStates.stGruposEnviados;
                break;
            }
            break;
        case GcStates.stGruposEnviados:
            switch(msg){
            case GcEvents.evrecebegrupodavisao:
                viewReserva.changeState(GcStates.stGrupoRecebido);
                currentState = GcStates.stGrupoRecebido;
                break;
            }
            break;
        case GcStates.stGrupoRecebido:
            switch(msg){
            case GcEvents.evrecebemodelos:
                viewReserva.changeState(GcStates.stModelosDisponiveis);
                currentState = GcStates.stModelosDisponiveis;
                break;
            case GcEvents.evefetuarreserva:
                viewReserva.changeState(GcStates.stReservaEfetuada);
                currentState = GcStates.stReservaEfetuada;
                break;
            }
            break;
        case GcStates.stModelosDisponiveis:
            switch(msg){
            case GcEvents.evenviamodelospvisao:
                viewReserva.changeState(GcStates.stModelosEnviados);
                currentState = GcStates.stModelosEnviados;
                break;
            }
            break;
        case GcStates.stModelosEnviados:
            switch(msg){
            case GcEvents.evrecebemodelodavisao:
                viewReserva.changeState(GcStates.stModeloRecebido);
                currentState = GcStates.stModeloRecebido;
                break;
            case GcEvents.evapagardados:
                viewReserva.changeState(GcStates.stViewCriada);
                currentState = GcStates.stViewCriada;
                break;
            }
            break;
        case GcStates.stModeloRecebido:
            switch(msg){
            case GcEvents.evefetuarreserva:
                viewReserva.changeState(GcStates.stReservaEfetuada);
                currentState = GcStates.stReservaEfetuada;
                break;
            }
            break;
        case GcStates.stReservaEfetuada:
            switch(msg){
            case GcEvents.evfim:
                break;
            }
            break;
        }
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
