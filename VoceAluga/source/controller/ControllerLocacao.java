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
import java.util.StringTokenizer;

import javax.swing.JOptionPane;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import model.Cliente;
import model.Filial;
import model.Grupo;
import model.ListaNegra;
import model.ModelLocacao;
import model.umCarro;
import model.umCliente;
import model.umFilial;
import model.umGrupo;
import model.umListaNegra;
import view.ViewLocacao;

public class ControllerLocacao implements ActionListener, CaretListener, FocusListener{

    public ControllerLocacao(){
    
    }

	private int currentState;
    private ViewLocacao viewLocacao;

    private ModelLocacao modelLocacao;


    // Estados referentes ao diagrama: DE ControllerLocacao
    interface GcStates{
        public static final int stDadosEnviadosParaModelLocacao = 0;

        public static final int stDadosObtidosDaModelLocacao = 1;

        public static final int stDadosObtidosDaViewLocacao = 2;

        public static final int stLocacaoEfetuada = 3;

        public static final int stModelLocacaoCriada = 4;

        public static final int stViewLocacaoCriada = 5;

    }

    // Eventos referentes ao diagrama: DE ControllerLocacao
    interface GcEvents{
        public static final int evcriarviewlocacao = 0;

        public static final int evefetuarlocacao = 1;

        public static final int evenviardadosparaviewlocacao = 2;

        public static final int evfim = 3;

        public static final int evgetdadosdaviewlocacao = 4;

        public static final int evmandardadosparamodellocal = 5;

        public static final int evpegardadosdamodellocacao = 6;

    }

	/**
	 * Implementação dos diagrama de sequência associado ao controle
	 */
	public void beginCase(){
        // Seqüência referente ao diagrama: DS Locação
        modelLocacao = new ModelLocacao();
        viewLocacao = new ViewLocacao();
        
/*        
        viewLocacao.getDataDeDevolucao();
        modelLocacao.getGruposDisponiveis();
        viewLocacao.setGrupo();
        viewLocacao.getGrupo();
        modelLocacao.getModelosDisponiveis();
        viewLocacao.setModelo();
        viewLocacao.getModelo();
        modelLocacao.registrarLocacao();

        // Configura o estado inicial
        currentState = GcStates.stModelLocacaoCriada;
*/
        
        currentState = GcStates.stViewLocacaoCriada;
        
        //Associa a classe ControllerLocacao a esse controle
      //  viewLocacao.setListener(this);
        viewLocacao.setActionListener(this);
        viewLocacao.setCaretListener(this);
        viewLocacao.setFocusListener(this);

        viewLocacao.setVisible(true);
        
		Date agora = Calendar.getInstance().getTime();
		Date amanha = Calendar.getInstance().getTime();
		amanha.setTime(agora.getTime() + 1000 * 60 * 60 * 24);
		
		// TODO: Pegar a filial do usuário logado. O sistema atual não implementa login
		viewLocacao.getCampoFilialRetirada().setText("EU Rent Matriz");
		viewLocacao.getCampoDataRetirada().setText(DateFormat.getDateTimeInstance().format(agora));
		viewLocacao.getCampoDataDevolucao().setText(DateFormat.getDateInstance().format(amanha));
		
        // TODO: Pegar a filial do usuário logado. O sistema atual não implementa login
		for (umGrupo g : modelLocacao.getListaGruposDisponíveis(1))
		{
			viewLocacao.getCampoGrupo().addItem(g.getGrupoNome());
		}
		
		viewLocacao.getCampoValorAluguel().setText(calculaValorAluguel(viewLocacao.getCampoDataRetirada().getText(), viewLocacao.getCampoDataDevolucao().getText(), verificaValorDiariaGrupo((String)viewLocacao.getCampoGrupo().getSelectedItem())));
		
		for (umFilial f : modelLocacao.getListaFiliais())
		{
			viewLocacao.getCampoFilialDevolucao().addItem(f.getFilialNome());
		}
		
		// TODO: Pegar a filial do usuário logado. O sistema atual não implementa login
		viewLocacao.getCampoFilialDevolucao().setSelectedItem("EU Rent Matriz");

		viewLocacao.getCampoCarro().removeAllItems();
		for (umCarro c : modelLocacao.getListaCarrosDisponiveis("EU Rent Matriz", (String)viewLocacao.getCampoGrupo().getSelectedItem()))
		{
			viewLocacao.getCampoCarro().addItem(c.getCarroId() + " : " + c.getCarroModelo() + " : " + c.getCarroPlaca());
		}
        
	}

	/**
	 *  Responsável pelo tratamentos dos eventos vindos
	 *  da interface,implementa a lógica do caso de uso.
	 * @param Msg
	 */
	private void eventHandler(int msg){
        // Estados referentes ao diagrama: DE ControllerLocacao
        switch(currentState){
        case GcStates.stModelLocacaoCriada:
            switch(msg){
            case GcEvents.evcriarviewlocacao:
                viewLocacao.changeState(GcStates.stViewLocacaoCriada);
                currentState = GcStates.stViewLocacaoCriada;
                break;
            }
            break;
        case GcStates.stViewLocacaoCriada:
            switch(msg){
            case GcEvents.evgetdadosdaviewlocacao:
                viewLocacao.changeState(GcStates.stDadosObtidosDaViewLocacao);
                currentState = GcStates.stDadosObtidosDaViewLocacao;
                break;
            }
            break;
        case GcStates.stDadosObtidosDaViewLocacao:
            switch(msg){
            case GcEvents.evmandardadosparamodellocal:
                viewLocacao.changeState(GcStates.stDadosEnviadosParaModelLocacao);
                currentState = GcStates.stDadosEnviadosParaModelLocacao;
                break;
            case GcEvents.evefetuarlocacao:
                viewLocacao.changeState(GcStates.stLocacaoEfetuada);
                currentState = GcStates.stLocacaoEfetuada;
                break;
            }
            break;
        case GcStates.stLocacaoEfetuada:
            switch(msg){
            case GcEvents.evfim:
                break;
            }
            break;
        case GcStates.stDadosEnviadosParaModelLocacao:
            switch(msg){
            case GcEvents.evpegardadosdamodellocacao:
                viewLocacao.changeState(GcStates.stDadosObtidosDaModelLocacao);
                currentState = GcStates.stDadosObtidosDaModelLocacao;
                break;
            }
            break;
        case GcStates.stDadosObtidosDaModelLocacao:
            switch(msg){
            case GcEvents.evenviardadosparaviewlocacao:
                viewLocacao.changeState(GcStates.stDadosObtidosDaViewLocacao);
                currentState = GcStates.stDadosObtidosDaViewLocacao;
                break;
            }
            break;
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
	public String calculaValorAluguel(String dataRetirada, String dataDevolucao, double diariaCarro)
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
	
	
	/**
	 * Recebe os eventos da interface e repassa para
	 * o EventHandler para serem tratados
	 * @param evt
	 */
	public void actionPerformed(ActionEvent evt) {
		
		if (evt.getSource() == viewLocacao.getBotaoCancelar())
		{
			viewLocacao.dispose();
		}
		else if (evt.getSource() == viewLocacao.getBotaoConfirmar())
		{
			Cliente clienteDao = new Cliente();
			umCliente uC = clienteDao.find((String)viewLocacao.getCampoCPF().getText());
			
			ListaNegra listaNegraDao = new ListaNegra();
			umListaNegra uLN = listaNegraDao.find(uC.getClienteId());
			
			if( uLN != null ) {
				JOptionPane.showMessageDialog(null, "Cliente na Lista Negra\n\nMotivo: " + uLN.getListaNegraMotivo(), "Confirmação",1);
				return;
			}
			
			StringTokenizer token = new StringTokenizer((String)viewLocacao.getCampoCarro().getSelectedItem(), " : "); //use a comma as a string delimiter
			String currentToken=token.nextToken();
			
			int idCarro = Integer.parseInt(currentToken);		
			
			Filial filialDao = new Filial();
			umFilial uF = filialDao.find((String)viewLocacao.getCampoFilialDevolucao().getSelectedItem());
						
			modelLocacao.registrarLocacao(viewLocacao.getCampoCPF().getText(), 
					idCarro, 
					viewLocacao.getCampoDataRetirada().getText(), 
					viewLocacao.getCampoDataDevolucao().getText(), 
					Double.parseDouble(viewLocacao.getCampoValorAluguel().getText()), 
					1, // TODO: id da filiam é sempre 1. Qd sistema de login for implementado
					   // permitir outras filiais
					uF.getFilialId());
			viewLocacao.dispose();
		}
		else if (evt.getSource() == viewLocacao.getCampoGrupo()) {
			viewLocacao.getCampoCaracteristica().setText(verificaDescricaoGrupo((String)viewLocacao.getCampoGrupo().getSelectedItem()));
			viewLocacao.getCampoValorDiaria().setText("R$" + Double.toString(verificaValorDiariaGrupo((String)viewLocacao.getCampoGrupo().getSelectedItem())));
			viewLocacao.getCampoCarro().removeAllItems();
			// TODO: Só aceita a filial EU Rent Matriz. Mudar qd for implementado o sistema de login
			for (umCarro c : modelLocacao.getListaCarrosDisponiveis("EU Rent Matriz", (String)viewLocacao.getCampoGrupo().getSelectedItem()))
			{
				viewLocacao.getCampoCarro().addItem(c.getCarroId() + " : " + c.getCarroModelo() + " : " + c.getCarroPlaca());
			}
			viewLocacao.getCampoValorAluguel().setText(calculaValorAluguel(viewLocacao.getCampoDataRetirada().getText(), viewLocacao.getCampoDataDevolucao().getText(), verificaValorDiariaGrupo((String)viewLocacao.getCampoGrupo().getSelectedItem())));
		}
		
		//eventHandler(Integer.parseInt(evt.getActionCommand()));
	}

	
	public void focusGained(FocusEvent e)
	{
	}

	public void focusLost(FocusEvent e)
	{
		if (e.getSource() == viewLocacao.getCampoDataDevolucao())
		{
			viewLocacao.getCampoValorAluguel().setText(calculaValorAluguel(viewLocacao.getCampoDataRetirada().getText(), viewLocacao.getCampoDataDevolucao().getText(), verificaValorDiariaGrupo((String)viewLocacao.getCampoGrupo().getSelectedItem())));
		}
	}

	public void caretUpdate(CaretEvent e)
	{
		if (e.getSource() == viewLocacao.getCampoCPF()) {
			if (viewLocacao.getCampoCPF().getText().length() == 11) {
				viewLocacao.getCampoNome().setText(clienteNomeSelecionado(viewLocacao.getCampoCPF().getText()));
			} else {
				viewLocacao.getCampoNome().setText("");
			}
		}
	}
		
	
	public ViewLocacao getViewLocacao()
	{
		return viewLocacao;
	}
	
}
