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
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
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

import com.jgoodies.forms.factories.Borders;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.Sizes;

public class ViewLocacao extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

   	// Guarda a instância do controle associado a esta interface
	private ActionListener listener = null;
	
	private ActionListener actionListener = null;
	private CaretListener caretListener = null;
	private FocusListener focusListener = null;

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

    private String dataDeDevolucao;

    private String grupo;

    private String modelo;

    private float preco;

    private String cPF;


    private int currentState;
    // Estados referentes ao diagrama: DE ViewLocacao
    interface GcStates{
        public static final int stDataPreenchida = 0;

        public static final int stFormularioEmBranco = 1;

        public static final int stFormularioPreenchido = 2;

        public static final int stGruposDisponiveisExibidos = 3;

        public static final int stLocacaoEfetuada = 4;

        public static final int stModelosDisponiveisExibidos = 5;

    }

    // Eventos referentes ao diagrama: DE ViewLocacao
    interface GcEvents{
        public static final int evapagardados = 0;

        public static final int evefetuarlocacao = 1;

        public static final int evfim = 2;

        public static final int evpreencherdata = 3;

        public static final int evselecionargrupo = 4;

        public static final int evselecionarmodelo = 5;

        public static final int evsolicitardisponibilidade = 6;

    }
    
    
	// JFormDesigner - Variables declaration - DO NOT MODIFY
	// //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - bruno mayerle
	private JPanel dialogPane;

	private JPanel contentPanel;

	private JLabel labelCPF;

	private JTextField campoCPF;

	private JLabel labelNome;

	private JTextField campoNome;

	private JLabel labelCaracteristica;

	private JLabel labelGrupo;

	private JComboBox campoGrupo;

	private JScrollPane scrollCaracteristica;

	private JEditorPane campoCaracteristica;

	private JLabel labelCarro;

	private JComboBox campoCarro;

	private JLabel labelValorDiaria;

	private JTextField campoValorDiaria;

	private JLabel labelDataRetirada;

	private JTextField campoDataRetirada;

	private JLabel labelDataDevolucao;

	private JTextField campoDataDevolucao;

	private JLabel labelValorAluguel;

	private JTextField campoValorAluguel;

	private JLabel labelFilialRetirada;

	private JTextField campoFilialRetirada;

	private JLabel labelFilialDevolucao;

	private JComboBox campoFilialDevolucao;

	private JButton botaoConfirmar;

	private JButton botaoCancelar;

	private JPanel buttonBar;

	// JFormDesigner - End of variables declaration //GEN-END:variables
    
    
	/**
	 * Este é um construtor padrão
	 */
    public ViewLocacao() {
	  super();
	  initialize();
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
	  this.setSize(650, 450);
      this.setTitle("ViewLocacao");
	}

	/**
	 * Este método inicializa o jContentPane
	 *
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
/*
            GridBagConstraints gridBagConstraintsTxt0 = new GridBagConstraints();
            gridBagConstraintsTxt0.fill = GridBagConstraints.VERTICAL;
            gridBagConstraintsTxt0.gridy = 0;
            gridBagConstraintsTxt0.weightx = 1.0;
            gridBagConstraintsTxt0.anchor = GridBagConstraints.WEST;
            gridBagConstraintsTxt0.insets = new Insets(4, 10, 4, 4);
            gridBagConstraintsTxt0.gridx = 1;

            GridBagConstraints gridBagConstraintsTxt1 = new GridBagConstraints();
            gridBagConstraintsTxt1.fill = GridBagConstraints.VERTICAL;
            gridBagConstraintsTxt1.gridy = 1;
            gridBagConstraintsTxt1.weightx = 1.0;
            gridBagConstraintsTxt1.anchor = GridBagConstraints.WEST;
            gridBagConstraintsTxt1.insets = new Insets(4, 10, 4, 4);
            gridBagConstraintsTxt1.gridx = 1;

            GridBagConstraints gridBagConstraintsTxt2 = new GridBagConstraints();
            gridBagConstraintsTxt2.fill = GridBagConstraints.VERTICAL;
            gridBagConstraintsTxt2.gridy = 2;
            gridBagConstraintsTxt2.weightx = 1.0;
            gridBagConstraintsTxt2.anchor = GridBagConstraints.WEST;
            gridBagConstraintsTxt2.insets = new Insets(4, 10, 4, 4);
            gridBagConstraintsTxt2.gridx = 1;

            GridBagConstraints gridBagConstraintsTxt3 = new GridBagConstraints();
            gridBagConstraintsTxt3.fill = GridBagConstraints.VERTICAL;
            gridBagConstraintsTxt3.gridy = 3;
            gridBagConstraintsTxt3.weightx = 1.0;
            gridBagConstraintsTxt3.anchor = GridBagConstraints.WEST;
            gridBagConstraintsTxt3.insets = new Insets(4, 10, 4, 4);
            gridBagConstraintsTxt3.gridx = 1;

            GridBagConstraints gridBagConstraintsTxt4 = new GridBagConstraints();
            gridBagConstraintsTxt4.fill = GridBagConstraints.VERTICAL;
            gridBagConstraintsTxt4.gridy = 4;
            gridBagConstraintsTxt4.weightx = 1.0;
            gridBagConstraintsTxt4.anchor = GridBagConstraints.WEST;
            gridBagConstraintsTxt4.insets = new Insets(4, 10, 4, 4);
            gridBagConstraintsTxt4.gridx = 1;


            GridBagConstraints gridBagConstraintsLabel0 = new GridBagConstraints();
            gridBagConstraintsLabel0.gridy = 0;
            gridBagConstraintsLabel0.insets = new Insets(4, 10, 4, 4);
            gridBagConstraintsLabel0.gridx = 0;

            GridBagConstraints gridBagConstraintsLabel1 = new GridBagConstraints();
            gridBagConstraintsLabel1.gridy = 1;
            gridBagConstraintsLabel1.insets = new Insets(4, 10, 4, 4);
            gridBagConstraintsLabel1.gridx = 0;

            GridBagConstraints gridBagConstraintsLabel2 = new GridBagConstraints();
            gridBagConstraintsLabel2.gridy = 2;
            gridBagConstraintsLabel2.insets = new Insets(4, 10, 4, 4);
            gridBagConstraintsLabel2.gridx = 0;

            GridBagConstraints gridBagConstraintsLabel3 = new GridBagConstraints();
            gridBagConstraintsLabel3.gridy = 3;
            gridBagConstraintsLabel3.insets = new Insets(4, 10, 4, 4);
            gridBagConstraintsLabel3.gridx = 0;

            GridBagConstraints gridBagConstraintsLabel4 = new GridBagConstraints();
            gridBagConstraintsLabel4.gridy = 4;
            gridBagConstraintsLabel4.insets = new Insets(4, 10, 4, 4);
            gridBagConstraintsLabel4.gridx = 0;


            lbDataDeDevolucao= new JLabel();
            lbDataDeDevolucao.setText("DataDeDevolucao");

            lbGrupo= new JLabel();
            lbGrupo.setText("Grupo");

            lbModelo= new JLabel();
            lbModelo.setText("Modelo");

            lbPreco= new JLabel();
            lbPreco.setText("Preco");

            lbCPF= new JLabel();
            lbCPF.setText("CPF");


			jContentPane = new JPanel();
			jContentPane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
			jContentPane.setLayout(new GridBagLayout());

            jContentPane.add(lbDataDeDevolucao, gridBagConstraintsLabel0);
            jContentPane.add(getTxtDataDeDevolucao(), gridBagConstraintsTxt0);
            jContentPane.add(lbGrupo, gridBagConstraintsLabel1);
            jContentPane.add(getTxtGrupo(), gridBagConstraintsTxt1);
            jContentPane.add(lbModelo, gridBagConstraintsLabel2);
            jContentPane.add(getTxtModelo(), gridBagConstraintsTxt2);
            jContentPane.add(lbPreco, gridBagConstraintsLabel3);
            jContentPane.add(getTxtPreco(), gridBagConstraintsTxt3);
            jContentPane.add(lbCPF, gridBagConstraintsLabel4);
            jContentPane.add(getTxtCPF(), gridBagConstraintsTxt4);
*/

			initComponents();
	  }
	  return jContentPane;
	}

	/**
	 * Retorna o Listener dessa interface
	 * @return Listener
	 */
	public ActionListener getListener() {
		return listener;
	}

	/**
	 * Associa um Listener para essa interface
	 * @param listener
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
		botaoConfirmar.addActionListener(actionListener);
		campoGrupo.addActionListener(actionListener);
		botaoCancelar.addActionListener(actionListener);
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
	private void sendEvent(ActionEvent e){
		int msg = Integer.parseInt(e.getActionCommand());
    switch(msg) {
        case GcEvents.evpreencherdata:
            listener.actionPerformed(e);
            break;
    }
	}

	/**
	 * @param msg
	 */
	public void changeState(int msg){
    // Estados referentes ao diagrama: DE ViewLocacao
        switch(msg) {
        case GcStates.stFormularioEmBranco :
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
        
        case GcStates.stDataPreenchida :
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
        
        case GcStates.stLocacaoEfetuada :
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

    
    
	private void initComponents()
	{
		// JFormDesigner - Component initialization - DO NOT MODIFY
		// //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - bruno mayerle
		dialogPane = new JPanel();
		contentPanel = new JPanel();
		labelCPF = new JLabel();
		campoCPF = new JTextField();

		labelNome = new JLabel();
		campoNome = new JTextField();
		campoNome.setEditable(false);
		labelGrupo = new JLabel();
		campoGrupo = new JComboBox();

		labelCaracteristica = new JLabel();
		scrollCaracteristica = new JScrollPane();
		campoCaracteristica = new JEditorPane();
		campoCaracteristica.setEditable(false);
		labelCarro = new JLabel();
		campoCarro = new JComboBox();
		labelValorDiaria = new JLabel();
		campoValorDiaria = new JTextField();
		campoValorDiaria.setEditable(false);
		labelDataRetirada = new JLabel();
		campoDataRetirada = new JTextField();
		campoDataRetirada.setEditable(false);
		labelDataDevolucao = new JLabel();
		campoDataDevolucao = new JTextField();

		labelValorAluguel = new JLabel();
		campoValorAluguel = new JTextField();
		campoValorAluguel.setEditable(false);
		labelFilialRetirada = new JLabel();
		campoFilialRetirada = new JTextField();
		campoFilialRetirada.setEditable(false);
		labelFilialDevolucao = new JLabel();
		campoFilialDevolucao = new JComboBox();
		botaoConfirmar = new JButton();

		botaoCancelar = new JButton();

		buttonBar = new JPanel();
		CellConstraints cc = new CellConstraints();
		// ======== this ========
//		setTitle("Aluguel de Carro");
		JPanel contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		// ======== dialogPane ========
		{
			dialogPane.setBorder(Borders.DIALOG_BORDER);
			// JFormDesigner evaluation mark
			dialogPane.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0), "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12), java.awt.Color.red), dialogPane.getBorder()));
			dialogPane.addPropertyChangeListener(new java.beans.PropertyChangeListener()
			{
				public void propertyChange(java.beans.PropertyChangeEvent e)
				{
					if ("border".equals(e.getPropertyName()))
						throw new RuntimeException();
				}
			});
			dialogPane.setLayout(new BorderLayout());
			// ======== contentPanel ========
			{
				contentPanel.setLayout(new FormLayout(new ColumnSpec[] { FormFactory.DEFAULT_COLSPEC, FormFactory.DEFAULT_COLSPEC, FormFactory.LABEL_COMPONENT_GAP_COLSPEC, FormFactory.DEFAULT_COLSPEC, FormFactory.LABEL_COMPONENT_GAP_COLSPEC, FormFactory.DEFAULT_COLSPEC, FormFactory.LABEL_COMPONENT_GAP_COLSPEC, FormFactory.DEFAULT_COLSPEC, FormFactory.LABEL_COMPONENT_GAP_COLSPEC, FormFactory.DEFAULT_COLSPEC, FormFactory.LABEL_COMPONENT_GAP_COLSPEC, FormFactory.DEFAULT_COLSPEC,
						FormFactory.LABEL_COMPONENT_GAP_COLSPEC, FormFactory.DEFAULT_COLSPEC }, new RowSpec[] { new RowSpec(Sizes.dluY(13)), new RowSpec(Sizes.DLUY4), FormFactory.DEFAULT_ROWSPEC, new RowSpec(Sizes.DLUY3), new RowSpec(RowSpec.CENTER, Sizes.DEFAULT, FormSpec.DEFAULT_GROW), new RowSpec(Sizes.DLUY3), FormFactory.DEFAULT_ROWSPEC, new RowSpec(Sizes.DLUY3), FormFactory.DEFAULT_ROWSPEC, new RowSpec(Sizes.DLUY4), FormFactory.DEFAULT_ROWSPEC, new RowSpec(Sizes.DLUY3),
						FormFactory.DEFAULT_ROWSPEC, new RowSpec(Sizes.DLUY4), FormFactory.DEFAULT_ROWSPEC, new RowSpec(Sizes.DLUY4), FormFactory.DEFAULT_ROWSPEC, new RowSpec(Sizes.DLUY3), FormFactory.DEFAULT_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.LINE_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC }));
				// ---- label6 ----
				labelCPF.setText("Cpf:");
				contentPanel.add(labelCPF, cc.xy(2, 1));
				contentPanel.add(campoCPF, cc.xywh(6, 1, 5, 1));
				// ---- label1 ----
				labelNome.setText("Nome:");
				contentPanel.add(labelNome, cc.xywh(2, 3, 4, 1));
				contentPanel.add(campoNome, cc.xywh(6, 3, 5, 1));
				// ---- label11 ----
				labelCaracteristica.setText("Caracteristicas do Grupo");
				contentPanel.add(labelCaracteristica, cc.xy(14, 3));
				// ---- label7 ----
				labelGrupo.setText("Grupo:");
				contentPanel.add(labelGrupo, cc.xy(2, 5));
				contentPanel.add(campoGrupo, cc.xywh(6, 5, 5, 1));
				// ======== scrollPane1 ========
				{
					scrollCaracteristica.setViewportView(campoCaracteristica);
				}
				contentPanel.add(scrollCaracteristica, cc.xywh(14, 5, 1, 9));
				// ---- label2 ----
				labelCarro.setText("Carro:");
				contentPanel.add(labelCarro, cc.xy(2, 7));
				contentPanel.add(campoCarro, cc.xywh(6, 7, 5, 1));
				// ---- label8 ----
				labelValorDiaria.setText("Valor da Diaria:");
				contentPanel.add(labelValorDiaria, cc.xy(2, 9));
				contentPanel.add(campoValorDiaria, cc.xywh(6, 9, 5, 1));
				// ---- label9 ----
				labelDataRetirada.setText("Data do Aluguel:");
				contentPanel.add(labelDataRetirada, cc.xy(2, 11));
				contentPanel.add(campoDataRetirada, cc.xywh(6, 11, 5, 1));
				// ---- label3 ----
				labelDataDevolucao.setText("Data de Devolu\u00e7\u00e3o:");
				contentPanel.add(labelDataDevolucao, cc.xy(2, 13));
				contentPanel.add(campoDataDevolucao, cc.xywh(6, 13, 5, 1));
				// ---- label5 ----
				labelValorAluguel.setText("Valor do Aluguel:");
				contentPanel.add(labelValorAluguel, cc.xy(2, 15));
				contentPanel.add(campoValorAluguel, cc.xywh(6, 15, 5, 1));
				// ---- label10 ----
				labelFilialRetirada.setText("Filial do aluguel:");
				contentPanel.add(labelFilialRetirada, cc.xy(2, 17));
				contentPanel.add(campoFilialRetirada, cc.xywh(6, 17, 5, 1));
				// ---- label4 ----
				labelFilialDevolucao.setText("Filial da devolu\u00e7\u00e3o:");
				contentPanel.add(labelFilialDevolucao, cc.xy(2, 19));
				contentPanel.add(campoFilialDevolucao, cc.xywh(6, 19, 5, 1));
				// ---- button1 ----
				botaoConfirmar.setText("Confirmar");
				contentPanel.add(botaoConfirmar, cc.xy(6, 22));
				// ---- button2 ----
				botaoCancelar.setText("Cancelar");
				contentPanel.add(botaoCancelar, cc.xy(10, 22));
			}
			dialogPane.add(contentPanel, BorderLayout.NORTH);
			// ======== buttonBar ========
			{
				buttonBar.setBorder(Borders.BUTTON_BAR_GAP_BORDER);
				buttonBar.setLayout(new FormLayout(new ColumnSpec[] { FormFactory.GLUE_COLSPEC, FormFactory.BUTTON_COLSPEC, FormFactory.RELATED_GAP_COLSPEC, FormFactory.BUTTON_COLSPEC }, RowSpec.decodeSpecs("")));
			}
			dialogPane.add(buttonBar, BorderLayout.SOUTH);
		}
		contentPane.add(dialogPane, BorderLayout.WEST);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization
		// //GEN-END:initComponents
		jContentPane = contentPane;
	}

   
	public JTextField getCampoCPF()
	{
		return campoCPF;
	}

	public JTextField getCampoNome()
	{
		return campoNome;
	}

	public JTextField getCampoDataDevolucao()
	{
		return campoDataDevolucao;
	}

	public JTextField getCampoDataRetirada()
	{
		return campoDataRetirada;
	}

	public JTextField getCampoValorDiaria()
	{
		return campoValorDiaria;
	}

	public JTextField getCampoValorAluguel()
	{
		return campoValorAluguel;
	}

	public JComboBox getCampoGrupo()
	{
		return campoGrupo;
	}

	public JTextField getCampoFilialRetirada()
	{
		return campoFilialRetirada;
	}

	public JComboBox getCampoFilialDevolucao()
	{
		return campoFilialDevolucao;
	}

	public JButton getBotaoConfirmar()
	{
		return botaoConfirmar;
	}

	public JButton getBotaoCancelar()
	{
		return botaoCancelar;
	}

	public JEditorPane getCampoCaracteristica()
	{
		return campoCaracteristica;
	}

	public JComboBox getCampoCarro()
	{
		return campoCarro;
	}
}
