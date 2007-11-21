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
package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.CaretListener;

import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;

public class ViewReserva extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

   	// Guarda a instância do controle associado a esta interface
	private ActionListener actionListener = null;
	private CaretListener caretListener = null;
	private FocusListener focusListener = null; 
	

    private JLabel lbDataDeRetirada;

    private JTextField txtDataDeRetirada;

    private JLabel lbDataDeDevolucao;

    private JTextField txtDataDeDevolucao;

    private JLabel lbGrupo;

    private JTextField txtGrupo;

    private JLabel lbModelo;

    private JTextField txtModelo;

    private JLabel lbPreco;

    private JTextField txtPreco;

    private JLabel lbCPF;

    private JTextField txtCPF;

    private String dataDeRetirada;

    private String dataDeDevolucao;

    private String grupo;

    private String modelo;

    private float preco;

    private String cPF;


    private int currentState;
    // Estados referentes ao diagrama: DE ViewReserva
    interface GcStates{
        public static final int stFormularioComDatasPreenchidas = 0;

        public static final int stFormularioEmBranco = 1;

        public static final int stFormularioPreenchido = 2;

        public static final int stGruposDisponiveisExibidos = 3;

        public static final int stModelosDisponiveisExibidos = 4;

        public static final int stReservaEfetuada = 5;

    }

    // Eventos referentes ao diagrama: DE ViewReserva
    interface GcEvents{
        public static final int evapagardados = 0;

        public static final int evefetuarreserva = 1;

        public static final int evfim = 2;

        public static final int evpreencherdatas = 3;

        public static final int evselecionargrupo = 4;

        public static final int evselecionarmodelo = 5;

        public static final int evsolicitardisponibilidade = 6;

    }
    
    
 // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - bruno mayerle
	private JPanel dialogPane;
	private JPanel this2;
	private JLabel label1;
	private JTextField campoCPF;
	private JLabel label2;
	private JTextField campoNome;
	private JLabel label9;
	private JScrollPane scrollCaracteristica;
	private JEditorPane campoCaracteristica;
	private JLabel label3;
	private JComboBox campoGrupo;
	private JLabel label4;
	private JTextField campoValorDiaria;
	private JLabel label5;
	private JTextField campoDataRetirada;
	private JLabel label6;
	private JTextField campoDataDevolucao;
	private JLabel label7;
	private JTextField campoFilialRetirada;
	private JLabel label8;
	private JTextField campoValorReserva;
	private JButton okButton;
	private JButton cancelButton;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
    
    
    
	/**
	 * Este é um construtor padrão
	 */
    public ViewReserva() {
	  super();
	  initialize();
	}

    /**
     * Este método inicializa o txtDataDeRetirada
     *
     * @return javax.swing.JTextField
     */
    private JTextField getTxtDataDeRetirada() {
        if (txtDataDeRetirada == null) {
            txtDataDeRetirada = new JTextField();
            txtDataDeRetirada.setPreferredSize(new Dimension(100, 20));
        }
        return txtDataDeRetirada;
    }
    /**
     * Este método inicializa o txtDataDeDevolucao
     *
     * @return javax.swing.JTextField
     */
    private JTextField getTxtDataDeDevolucao() {
        if (txtDataDeDevolucao == null) {
            txtDataDeDevolucao = new JTextField();
            txtDataDeDevolucao.setPreferredSize(new Dimension(100, 20));
        }
        return txtDataDeDevolucao;
    }
    /**
     * Este método inicializa o txtGrupo
     *
     * @return javax.swing.JTextField
     */
    private JTextField getTxtGrupo() {
        if (txtGrupo == null) {
            txtGrupo = new JTextField();
            txtGrupo.setPreferredSize(new Dimension(100, 20));
        }
        return txtGrupo;
    }
    /**
     * Este método inicializa o txtModelo
     *
     * @return javax.swing.JTextField
     */
    private JTextField getTxtModelo() {
        if (txtModelo == null) {
            txtModelo = new JTextField();
            txtModelo.setPreferredSize(new Dimension(100, 20));
        }
        return txtModelo;
    }
    /**
     * Este método inicializa o txtPreco
     *
     * @return javax.swing.JTextField
     */
    private JTextField getTxtPreco() {
        if (txtPreco == null) {
            txtPreco = new JTextField();
            txtPreco.setPreferredSize(new Dimension(100, 20));
        }
        return txtPreco;
    }
    /**
     * Este método inicializa o txtCPF
     *
     * @return javax.swing.JTextField
     */
    private JTextField getTxtCPF() {
        if (txtCPF == null) {
            txtCPF = new JTextField();
            txtCPF.setPreferredSize(new Dimension(100, 20));
        }
        return txtCPF;
    }


	/**
	 * Este método inicializa a classe
	 *
	 * @return void
	 */
	private void initialize() {
	  this.setContentPane(getJContentPane());
	  this.setSize(650,450);
      this.setTitle("ViewReserva");
      
  	}

	/**
	 * Este método inicializa o jContentPane
	 *
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			initComponents();
	  }
	  return jContentPane;
	}
	
	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - bruno mayerle
		dialogPane = new JPanel();
		this2 = new JPanel();
		label1 = new JLabel();
		campoCPF = new JTextField();
		label2 = new JLabel();
		campoNome = new JTextField();
		campoNome.setEditable(false);
		label9 = new JLabel();
		scrollCaracteristica = new JScrollPane();
		campoCaracteristica = new JEditorPane();
		campoCaracteristica.setEditable(false);
		label3 = new JLabel();
		campoGrupo = new JComboBox();
		
		label4 = new JLabel();
		campoValorDiaria = new JTextField();
		campoValorDiaria.setEditable(false);
		label5 = new JLabel();
		campoDataRetirada = new JTextField();
		label6 = new JLabel();
		campoDataDevolucao = new JTextField();

		label7 = new JLabel();
		campoFilialRetirada = new JTextField();
		campoFilialRetirada.setEditable(false);
		label8 = new JLabel();
		campoValorReserva = new JTextField();
		campoValorReserva.setEditable(false);
		okButton = new JButton();

		cancelButton = new JButton();
		
		CellConstraints cc = new CellConstraints();

		//======== this ========
//		setTitle("Reservar Carro");
//		Container contentPane = getContentPane();
		JPanel contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());

		//======== dialogPane ========
		{
			dialogPane.setBorder(Borders.DIALOG_BORDER);

			// JFormDesigner evaluation mark
			dialogPane.setBorder(new javax.swing.border.CompoundBorder(
				new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
					"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
					javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
					java.awt.Color.red), dialogPane.getBorder())); dialogPane.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

			dialogPane.setLayout(new BorderLayout());

			//======== this2 ========
			{
				this2.setLayout(new FormLayout(
					new ColumnSpec[] {
						FormFactory.DEFAULT_COLSPEC,
						FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
						new ColumnSpec(Sizes.dluX(26)),
						FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
						new ColumnSpec(Sizes.dluX(16)),
						FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
						new ColumnSpec(Sizes.dluX(32)),
						FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
						new ColumnSpec(Sizes.dluX(27)),
						FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
						FormFactory.DEFAULT_COLSPEC,
						FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
						FormFactory.DEFAULT_COLSPEC,
						FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
						FormFactory.DEFAULT_COLSPEC,
						FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
						FormFactory.DEFAULT_COLSPEC,
						FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
						new ColumnSpec(Sizes.dluX(24)),
						FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
						FormFactory.DEFAULT_COLSPEC,
						FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
						new ColumnSpec(Sizes.dluX(19)),
						FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
						FormFactory.DEFAULT_COLSPEC,
						FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
						FormFactory.DEFAULT_COLSPEC,
						FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
						FormFactory.DEFAULT_COLSPEC
					},
					new RowSpec[] {
						new RowSpec(Sizes.DLUY4),
						FormFactory.LINE_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.LINE_GAP_ROWSPEC,
						new RowSpec(Sizes.DLUY6),
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.LINE_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.LINE_GAP_ROWSPEC,
						new RowSpec(Sizes.DLUY6),
						FormFactory.LINE_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.LINE_GAP_ROWSPEC,
						new RowSpec(Sizes.DLUY7),
						FormFactory.LINE_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.LINE_GAP_ROWSPEC,
						new RowSpec(Sizes.DLUY6),
						FormFactory.LINE_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.LINE_GAP_ROWSPEC,
						new RowSpec(Sizes.DLUY6),
						FormFactory.LINE_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.LINE_GAP_ROWSPEC,
						new RowSpec(Sizes.DLUY5),
						FormFactory.LINE_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.LINE_GAP_ROWSPEC,
						new RowSpec(Sizes.DLUY5),
						FormFactory.LINE_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.LINE_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.LINE_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC
					}));

				//---- label1 ----
				label1.setText("Cpf:");
				this2.add(label1, cc.xy(1, 3));
				this2.add(campoCPF, cc.xywh(3, 3, 13, 1));

				//---- label2 ----
				label2.setText("Nome:");
				this2.add(label2, cc.xy(1, 6));
				this2.add(campoNome, cc.xywh(3, 6, 13, 1));

				//---- label9 ----
				label9.setText("Caracteristica do grupo");
				this2.add(label9, cc.xy(21, 8));

				//======== scrollCaracteristica ========
				{
					scrollCaracteristica.setViewportView(campoCaracteristica);
				}
				this2.add(scrollCaracteristica, cc.xywh(19, 10, 5, 19));

				//---- label3 ----
				label3.setText("Grupo");
				this2.add(label3, cc.xy(1, 12));
				this2.add(campoGrupo, cc.xywh(3, 12, 6, 1));

				//---- label4 ----
				label4.setText("Valor do Grupo:");
				this2.add(label4, cc.xy(1, 16));
				this2.add(campoValorDiaria, cc.xywh(3, 16, 7, 1));

				//---- label5 ----
				label5.setText("Data Retirada:");
				this2.add(label5, cc.xy(1, 20));
				this2.add(campoDataRetirada, cc.xywh(3, 20, 9, 1));

				//---- label6 ----
				label6.setText("Data Devolucao:");
				this2.add(label6, cc.xy(1, 24));
				this2.add(campoDataDevolucao, cc.xywh(3, 24, 9, 1));

				//---- label7 ----
				label7.setText("Filial:");
				this2.add(label7, cc.xy(1, 28));
				this2.add(campoFilialRetirada, cc.xywh(3, 28, 9, 1));

				//---- label8 ----
				label8.setText("Valor Total:");
				this2.add(label8, cc.xy(1, 32));
				this2.add(campoValorReserva, cc.xywh(3, 32, 7, 1));

				//---- okButton ----
				okButton.setText("Salvar");
				this2.add(okButton, cc.xywh(3, 36, 3, 1));

				//---- cancelButton ----
				cancelButton.setText("Cancelar");
				this2.add(cancelButton, cc.xywh(7, 36, 4, 1));
			}
			dialogPane.add(this2, BorderLayout.CENTER);
		}
		contentPane.add(dialogPane, BorderLayout.CENTER);
		pack();
		setLocationRelativeTo(getOwner());
		jContentPane = contentPane;
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	

	/**
	 * Retorna o Listener dessa interface
	 * @return Listener
	 */
	public ActionListener getActionListener() {
		return actionListener;
	}
	public CaretListener getCaretListener() {
		return caretListener;
	}
	public FocusListener getFocusListener() {
		return focusListener;
	}

	public void setActionListener(ActionListener listener) {
		this.actionListener = listener;
		associaActionListeners();
	}
	public void setCaretListener(CaretListener listener) {
		this.caretListener = listener;
		associaCaretListeners();
	}
	public void setFocusListener(FocusListener listener) {
		this.focusListener = listener;
		associaFocusListeners();
	}

	private void associaActionListeners() {
		okButton.addActionListener(actionListener);
		campoGrupo.addActionListener(actionListener);
		cancelButton.addActionListener(actionListener);
	}
	private void associaCaretListeners() {
		campoCPF.addCaretListener(caretListener);
		
	}
	private void associaFocusListeners() {
		campoDataDevolucao.addFocusListener(focusListener);
	}
		
	/**
	 * @param msg
	 */
/*	private void sendEvent(ActionEvent e){
		int msg = Integer.parseInt(e.getActionCommand());
    switch(msg) {
        case GcEvents.evpreencherdatas:
            actionListener.actionPerformed(e);
            break;
    }
	}
*/
	/**
	 * @param msg
	 */
	public void changeState(int msg){
    // Estados referentes ao diagrama: DE ViewReserva
        switch(msg) {
        case GcStates.stFormularioEmBranco :
            lbDataDeRetirada.setEnabled(true);
            txtDataDeRetirada.setEnabled(true);
            lbDataDeDevolucao.setEnabled(true);
            txtDataDeDevolucao.setEnabled(true);
            lbGrupo.setEnabled(true);
            txtGrupo.setEnabled(true);
            lbModelo.setEnabled(true);
            txtModelo.setEnabled(true);
            lbPreco.setEnabled(true);
            txtPreco.setEnabled(true);
            lbCPF.setEnabled(true);
            txtCPF.setEnabled(true);
            break;
        
        case GcStates.stFormularioComDatasPreenchidas :
            lbDataDeRetirada.setEnabled(true);
            txtDataDeRetirada.setEnabled(true);
            lbDataDeDevolucao.setEnabled(true);
            txtDataDeDevolucao.setEnabled(true);
            lbGrupo.setEnabled(true);
            txtGrupo.setEnabled(true);
            lbModelo.setEnabled(true);
            txtModelo.setEnabled(true);
            lbPreco.setEnabled(true);
            txtPreco.setEnabled(true);
            lbCPF.setEnabled(true);
            txtCPF.setEnabled(true);
            break;
        
        case GcStates.stGruposDisponiveisExibidos :
            lbDataDeRetirada.setEnabled(true);
            txtDataDeRetirada.setEnabled(true);
            lbDataDeDevolucao.setEnabled(true);
            txtDataDeDevolucao.setEnabled(true);
            lbGrupo.setEnabled(true);
            txtGrupo.setEnabled(true);
            lbModelo.setEnabled(true);
            txtModelo.setEnabled(true);
            lbPreco.setEnabled(true);
            txtPreco.setEnabled(true);
            lbCPF.setEnabled(true);
            txtCPF.setEnabled(true);
            break;
        
        case GcStates.stModelosDisponiveisExibidos :
            lbDataDeRetirada.setEnabled(true);
            txtDataDeRetirada.setEnabled(true);
            lbDataDeDevolucao.setEnabled(true);
            txtDataDeDevolucao.setEnabled(true);
            lbGrupo.setEnabled(true);
            txtGrupo.setEnabled(true);
            lbModelo.setEnabled(true);
            txtModelo.setEnabled(true);
            lbPreco.setEnabled(true);
            txtPreco.setEnabled(true);
            lbCPF.setEnabled(true);
            txtCPF.setEnabled(true);
            break;
        
        case GcStates.stFormularioPreenchido :
            lbDataDeRetirada.setEnabled(true);
            txtDataDeRetirada.setEnabled(true);
            lbDataDeDevolucao.setEnabled(true);
            txtDataDeDevolucao.setEnabled(true);
            lbGrupo.setEnabled(true);
            txtGrupo.setEnabled(true);
            lbModelo.setEnabled(true);
            txtModelo.setEnabled(true);
            lbPreco.setEnabled(true);
            txtPreco.setEnabled(true);
            lbCPF.setEnabled(true);
            txtCPF.setEnabled(true);
            break;
        
        case GcStates.stReservaEfetuada :
            lbDataDeRetirada.setEnabled(true);
            txtDataDeRetirada.setEnabled(true);
            lbDataDeDevolucao.setEnabled(true);
            txtDataDeDevolucao.setEnabled(true);
            lbGrupo.setEnabled(true);
            txtGrupo.setEnabled(true);
            lbModelo.setEnabled(true);
            txtModelo.setEnabled(true);
            lbPreco.setEnabled(true);
            txtPreco.setEnabled(true);
            lbCPF.setEnabled(true);
            txtCPF.setEnabled(true);
            break;
        
        }
	}


    public void construtor() {
        currentState = GcStates.stFormularioEmBranco;
    }


    public void getDataDeRetirada() {
    }

    public void getDataDeDevolucao() {
    }

    public void getGrupo() {
    }

    public void getModelo() {
    }

    public void setGrupo() {
    }

    public void setModelo() {
    }

    /**
     * @return DataDeRetirada
     */
    public String getdataDeRetirada(){
        dataDeRetirada = txtDataDeRetirada.getText();
        return dataDeRetirada;
    }

    /**
     * @param umDataDeRetirada
     */
    public void setDataDeRetirada(String umDataDeRetirada){
        dataDeRetirada = umDataDeRetirada;
        txtDataDeRetirada.setText(umDataDeRetirada);
    }

    /**
     * @return DataDeDevolucao
     */
    public String getdataDeDevolucao(){
        dataDeDevolucao = txtDataDeDevolucao.getText();
        return dataDeDevolucao;
    }

    /**
     * @param umDataDeDevolucao
     */
    public void setDataDeDevolucao(String umDataDeDevolucao){
        dataDeDevolucao = umDataDeDevolucao;
        txtDataDeDevolucao.setText(umDataDeDevolucao);
    }

    /**
     * @return Grupo
     */
    public String getgrupo(){
        grupo = txtGrupo.getText();
        return grupo;
    }

    /**
     * @param umGrupo
     */
    public void setGrupo(String umGrupo){
        grupo = umGrupo;
        txtGrupo.setText(umGrupo);
    }

    /**
     * @return Modelo
     */
    public String getmodelo(){
        modelo = txtModelo.getText();
        return modelo;
    }

    /**
     * @param umModelo
     */
    public void setModelo(String umModelo){
        modelo = umModelo;
        txtModelo.setText(umModelo);
    }

    /**
     * @return Preco
     */
    public float getpreco(){
        preco = Float.parseFloat(txtPreco.getText());
        return preco;
    }

    /**
     * @param umPreco
     */
    public void setPreco(float umPreco){
        preco = umPreco;
        txtPreco.setText(Float.toString(umPreco));
    }

    /**
     * @return CPF
     */
    public String getcPF(){
        cPF = txtCPF.getText();
        return cPF;
    }

    /**
     * @param umCPF
     */
    public void setCPF(String umCPF){
        cPF = umCPF;
        txtCPF.setText(umCPF);
    }

    
    public JEditorPane getCampoCaracteristica() {
		return campoCaracteristica;
	}

	public void setCampoCaracteristica(JEditorPane campoCaracteristica) {
		this.campoCaracteristica = campoCaracteristica;
	}

	public JTextField getCampoCPF() {
		return campoCPF;
	}

	public void setCampoCPF(JTextField campoCPF) {
		this.campoCPF = campoCPF;
	}

	public JTextField getCampoDataDevolucao() {
		return campoDataDevolucao;
	}

	public void setCampoDataDevolucao(JTextField campoDataDevolucao) {
		this.campoDataDevolucao = campoDataDevolucao;
	}

	public JTextField getCampoDataRetirada() {
		return campoDataRetirada;
	}

	public void setCampoDataRetirada(JTextField campoDataRetirada) {
		this.campoDataRetirada = campoDataRetirada;
	}

	public JTextField getCampoFilialRetirada() {
		return campoFilialRetirada;
	}

	public void setCampoFilialRetirada(JTextField campoFilialRetirada) {
		this.campoFilialRetirada = campoFilialRetirada;
	}

	public JComboBox getCampoGrupo() {
		return campoGrupo;
	}

	public void setCampoGrupo(JComboBox campoGrupo) {
		this.campoGrupo = campoGrupo;
	}

	public JTextField getCampoNome() {
		return campoNome;
	}

	public void setCampoNome(JTextField campoNome) {
		this.campoNome = campoNome;
	}

	public JTextField getCampoValorDiaria() {
		return campoValorDiaria;
	}

	public void setCampoValorDiaria(JTextField campoValorDiaria) {
		this.campoValorDiaria = campoValorDiaria;
	}

	public JTextField getCampoValorReserva() {
		return campoValorReserva;
	}

	public void setCampoValorReserva(JTextField campoValorReserva) {
		this.campoValorReserva = campoValorReserva;
	}

	public JButton getCancelButton() {
		return cancelButton;
	}

	public void setCancelButton(JButton cancelButton) {
		this.cancelButton = cancelButton;
	}

	public JButton getOkButton() {
		return okButton;
	}

	public void setOkButton(JButton okButton) {
		this.okButton = okButton;
	}
}
