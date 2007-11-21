/*
 * CÓDIGO GERADO PELO RAPDIS
 * www.geti.dcc.ufrj.br
 * Data da geração 20/11/2007
 * Hora da geração 12:56 PM
 * 
 * Nome Voce Aluga
 * E-mail Seu Email
 * Autor Grupo 6
 * Versão 1.0
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import model.Cliente;
import model.Grupo;
import model.ListaNegra;
import model.ModelReserva;
import model.umCarro;
import model.umCliente;
import model.umGrupo;
import model.umListaNegra;
import view.ViewReserva;

public class ControllerReserva implements ActionListener, CaretListener, FocusListener{

    public ControllerReserva(){
    
    }

	private int currentState;
    public ViewReserva viewReserva;

    public ModelReserva modelReserva;


    // Estados referentes ao diagrama: DE ControllerReserva
    interface GcStates{
        public static final int stDatasRecebidas = 0;

        public static final int stGrupoRecebido = 1;

        public static final int stGruposDisponiveisExibidos = 2;

        public static final int stGruposEnviadosParaViewReserva = 3;

        public static final int stModeloRecebido = 4;

        public static final int stModelosDisponiveisExibidos = 5;

        public static final int stModelosEnviadosParaViewReserva = 6;

        public static final int stModelReservaCriada = 7;

        public static final int stReservaEfetuada = 8;

        public static final int stViewReservaCriada = 9;

    }

    // Eventos referentes ao diagrama: DE ControllerReserva
    interface GcEvents{
        public static final int evapagardados = 0;

        public static final int evcriarviewreserva = 1;

        public static final int evefetuarreserva = 2;

        public static final int evenviargruposparavisao = 3;

        public static final int evenviarmodelosparavisao = 4;

        public static final int evfim = 5;

        public static final int evreceberdatasdavisao = 6;

        public static final int evrecebergrupodavisao = 7;

        public static final int evrecebermodelodavisao = 8;

        public static final int evverificargrupos = 9;

        public static final int evverificarmodelos = 10;

    }

	/**
	 * Implementação dos diagrama de sequência associado ao controle
	 */
	public void beginCase(){
        // Seqüência referente ao diagrama: DS Reserva
        modelReserva = new ModelReserva();
        viewReserva = new ViewReserva();
  
/*        viewReserva.getDataDeRetirada();
        viewReserva.getDataDeDevolucao();
        modelReserva.getGruposDisponiveis();
        viewReserva.setGrupo();
        viewReserva.getGrupo();
        modelReserva.getModelosDisponiveis();
        viewReserva.setModelo();
        viewReserva.getModelo();
        modelReserva.registrarReserva();
*/
        // Configura o estado inicial
 //       currentState = GcStates.stModelReservaCriada;
        currentState = GcStates.stViewReservaCriada;

        //Associa a classe ControllerReserva a esse controle
    //    viewReserva.setListener(this);
        viewReserva.setActionListener(this);
        viewReserva.setCaretListener(this);
        viewReserva.setFocusListener(this);

        viewReserva.setVisible(true);
        
		Date agora = Calendar.getInstance().getTime();
		Date amanha = Calendar.getInstance().getTime();
		amanha.setTime(agora.getTime() + 1000 * 60 * 60 * 24);
		
        // TODO: Pegar a filial do usuário logado. O sistema atual não implementa login
		for (umGrupo g : modelReserva.getListaGruposDisponíveis(1, viewReserva.getCampoDataRetirada().getText(), viewReserva.getCampoDataDevolucao().getText() ))
		{
			viewReserva.getCampoGrupo().addItem(g.getGrupoNome());
		}
        
		// TODO: Pegar a filial do usuário logado. O sistema atual não implementa login
		viewReserva.getCampoFilialRetirada().setText("EU Rent Matriz");
		
        viewReserva.getCampoDataRetirada().setText(DateFormat.getDateTimeInstance().format(agora));
		viewReserva.getCampoDataDevolucao().setText(DateFormat.getDateInstance().format(amanha));

		viewReserva.getCampoValorReserva().setText(calculaValorReserva(viewReserva.getCampoDataRetirada().getText(), viewReserva.getCampoDataDevolucao().getText(), verificaValorDiariaGrupo((String)viewReserva.getCampoGrupo().getSelectedItem())));
	}

	/**
	 *  Responsável pelo tratamentos dos eventos vindos
	 *  da interface,implementa a lógica do caso de uso.
	 * @param Msg
	 */
	private void eventHandler(int msg){
        // Estados referentes ao diagrama: DE ControllerReserva
        switch(currentState){
        case GcStates.stModelReservaCriada:
            switch(msg){
            case GcEvents.evcriarviewreserva:
                viewReserva.changeState(GcStates.stViewReservaCriada);
                currentState = GcStates.stViewReservaCriada;
                break;
            }
            break;
        case GcStates.stViewReservaCriada:
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
                viewReserva.changeState(GcStates.stGruposDisponiveisExibidos);
                currentState = GcStates.stGruposDisponiveisExibidos;
                break;
            case GcEvents.evefetuarreserva:
                viewReserva.changeState(GcStates.stReservaEfetuada);
                currentState = GcStates.stReservaEfetuada;
                break;
            }
            break;
        case GcStates.stGruposDisponiveisExibidos:
            switch(msg){
            case GcEvents.evenviargruposparavisao:
                viewReserva.changeState(GcStates.stGruposEnviadosParaViewReserva);
                currentState = GcStates.stGruposEnviadosParaViewReserva;
                break;
            }
            break;
        case GcStates.stGruposEnviadosParaViewReserva:
            switch(msg){
            case GcEvents.evrecebergrupodavisao:
                viewReserva.changeState(GcStates.stGrupoRecebido);
                currentState = GcStates.stGrupoRecebido;
                break;
            }
            break;
        case GcStates.stGrupoRecebido:
            switch(msg){
            case GcEvents.evverificarmodelos:
                viewReserva.changeState(GcStates.stModelosDisponiveisExibidos);
                currentState = GcStates.stModelosDisponiveisExibidos;
                break;
            case GcEvents.evefetuarreserva:
                viewReserva.changeState(GcStates.stReservaEfetuada);
                currentState = GcStates.stReservaEfetuada;
                break;
            }
            break;
        case GcStates.stModelosDisponiveisExibidos:
            switch(msg){
            case GcEvents.evenviarmodelosparavisao:
                viewReserva.changeState(GcStates.stModelosEnviadosParaViewReserva);
                currentState = GcStates.stModelosEnviadosParaViewReserva;
                break;
            }
            break;
        case GcStates.stModelosEnviadosParaViewReserva:
            switch(msg){
            case GcEvents.evrecebermodelodavisao:
                viewReserva.changeState(GcStates.stModeloRecebido);
                currentState = GcStates.stModeloRecebido;
                break;
            case GcEvents.evapagardados:
                viewReserva.changeState(GcStates.stViewReservaCriada);
                currentState = GcStates.stViewReservaCriada;
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
	
		if (evt.getSource() == viewReserva.getCancelButton())
		{
			viewReserva.dispose();
		}
		else if (evt.getSource() == viewReserva.getOkButton())
		{   
			Cliente clienteDao = new Cliente();
			umCliente uC = clienteDao.find((String)viewReserva.getCampoCPF().getText());
			
			ListaNegra listaNegraDao = new ListaNegra();
			umListaNegra uLN = listaNegraDao.find(uC.getClienteId());
			
			if( uLN != null ) {
				JOptionPane.showMessageDialog(null, "Cliente na Lista Negra\n\nMotivo: " + uLN.getListaNegraMotivo(), "Confirmação",1);
				return;
			}
			
			/*
			 * Colocar aqui código para escolher um carro do grupo escolhido para ser reservado
			 */
			List<umCarro> l = modelReserva.getListaCarrosDisponiveis("EU Rent Matriz", (String)viewReserva.getCampoGrupo().getSelectedItem(), viewReserva.getCampoDataRetirada().getText(), viewReserva.getCampoDataDevolucao().getText() );
			
			modelReserva.registrarReserva(viewReserva.getCampoCPF().getText(),
					l.get(0),				 
					viewReserva.getCampoDataRetirada().getText(), 
					viewReserva.getCampoDataDevolucao().getText(), 
					Double.parseDouble(viewReserva.getCampoValorReserva().getText()), 
					1 // TODO: id da filiam é sempre 1. Qd sistema de login for implementado
					  // permitir outras filiais
					);

			//getViewPrincipal().setVisible(true);
			viewReserva.dispose();
		}
		else if (evt.getSource() == getViewReserva().getCampoGrupo())
		{
			viewReserva.getCampoCaracteristica().setText(verificaDescricaoGrupo((String)viewReserva.getCampoGrupo().getSelectedItem()));
			viewReserva.getCampoValorDiaria().setText("R$" + Double.toString(verificaValorDiariaGrupo((String)viewReserva.getCampoGrupo().getSelectedItem())));
// TODO: caso queiramos listar os carros
//			getViewReserva().getCampoCarro().removeAllItems();
//			for (Carro c : listaDeCarrosDisponiveis(ctrlGeral.getFuncLogado().getFilial(), (String)getViewReserva().getCampoGrupo().getSelectedItem()))
//			{
//				getViewReserva().getCampoCarro().addItem(c.getCarroModelo() + " : " + c.getCarroPlaca());
//			}
			viewReserva.getCampoValorReserva().setText(calculaValorReserva(getViewReserva().getCampoDataRetirada().getText(), getViewReserva().getCampoDataDevolucao().getText(), verificaValorDiariaGrupo((String)getViewReserva().getCampoGrupo().getSelectedItem())));
		}		
		
		//eventHandler(Integer.parseInt(evt.getActionCommand()));
	}
	
	/**
	 * Recebe os eventos da interface
	 */
	public void focusGained(FocusEvent e)
	{
	}

	public void focusLost(FocusEvent e)
	{
		if (e.getSource() == viewReserva.getCampoDataDevolucao())
		{
			viewReserva.getCampoValorReserva().setText(calculaValorReserva(viewReserva.getCampoDataRetirada().getText(), viewReserva.getCampoDataDevolucao().getText(), verificaValorDiariaGrupo((String)viewReserva.getCampoGrupo().getSelectedItem())));
		}
	}

	public void caretUpdate(CaretEvent e)
	{
		if (e.getSource() == viewReserva.getCampoCPF()) {
			if (viewReserva.getCampoCPF().getText().length() == 11) {
				viewReserva.getCampoNome().setText(clienteNomeSelecionado(viewReserva.getCampoCPF().getText()));
			} else {
				viewReserva.getCampoNome().setText("");
			}
		}
	}
	
	//pesquisa o nome do cliente pelo cpf
	public String clienteNomeSelecionado(String cpf)
	{	

		Cliente clienteDao = new Cliente();
		umCliente uC = clienteDao.find(cpf);
		
		if( uC != null ) {
			return uC.getClienteNome();
		}
		else {
			return "";
		}
		
	}
	//verifica automaticamente o valor da diaria de um determinado grupo selecionado
	public Float verificaValorDiariaGrupo(String g)
	{

		Grupo grupoDao = new Grupo();
		umGrupo umgrupo = grupoDao.find(g);
		if( umgrupo!=null ) {
			return umgrupo.getGrupoValorDiaria();
		}
		else {
			return 0.0F;
		}
	}
	//calcula o valor do aluguel de acordo com as dias do aluguel e o valor da diaria do grupo 
	public String calculaValorReserva(String dataRetirada, String dataDevolucao, double diariaCarro)
	{
	
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		int diasAluguel = 0;
		try
		{
			Date dataRetirada1 = formatter.parse(dataRetirada);
			Date dataDevolucao1 = formatter.parse(dataDevolucao);
			long tempoRetirada = dataRetirada1.getTime();
			long tempoDevolucao = dataDevolucao1.getTime();
			long x = tempoDevolucao - tempoRetirada;
			diasAluguel = (int) ((((x / 1000) / 60) / 60) / 24);
		}
		catch (ParseException e)
		{
			// e.printStackTrace(System.err);
		}
		return Double.toString(diasAluguel * diariaCarro);
	}
	//descreve na tela o grupo selecionado
	public String verificaDescricaoGrupo(String g)
	{
		Grupo grupoDao = new Grupo();
		umGrupo grupo = grupoDao.find(g);
		
		String str = "CD Player = ";
		if (grupo.isGrupoCd()) str = str + "S\n";
		else str = str + "N\n";
		str = str + "Ar Condicionado = ";
		if (grupo.isGrupoAr()) str = str + "S\n";
		else str = str + "N\n";
		str = str + "Vidro Eletrico = ";
		if (grupo.isGrupoVidro()) str = str + "S\n";
		else str = str + "N\n";
		str = str + "Direção Hidraulica = ";
		if (grupo.isGrupoDirecao()) str = str + "S\n";
		else str = str + "N\n";
		str = str + "Trava Automática = ";
		if (grupo.isGrupoTrava()) str = str + "S\n";
		else str = str + "N\n";
		str = str + "Portas = " + grupo.getGrupoPortas() + "\n";
		str = str + "Motor = " + grupo.getGrupoMotor() + "\n";
		return str;
	}
	
	
	public ViewReserva getViewReserva()
	{
		return viewReserva;
	}
}
