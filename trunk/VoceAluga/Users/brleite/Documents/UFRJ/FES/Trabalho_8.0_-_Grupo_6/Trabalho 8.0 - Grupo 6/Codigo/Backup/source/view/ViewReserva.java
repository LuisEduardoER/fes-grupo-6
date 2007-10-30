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
package view;

import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ViewReserva extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

   	// Guarda a instância do controle associado a esta interface
	private ActionListener listener = null;

    private JLabel lbDataDeRetirada;

    private JTextField txtDataDeRetirada;

    private JLabel lbDataDeDevolucao;

    private JTextField txtDataDeDevolucao;

    private JLabel lbGrupo;

    private JTextField txtGrupo;

    private JLabel lbModelo;

    private JTextField txtModelo;

    private String dataDeRetirada;

    private String dataDeDevolucao;

    private String grupo;

    private String modelo;


    private int currentState;
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
	 * Este método inicializa a classe
	 *
	 * @return void
	 */
	private void initialize() {
	  this.setSize(300, 200);
	  this.setContentPane(getJContentPane());
        this.setTitle("ViewReserva");
	}

	/**
	 * Este método inicializa o jContentPane
	 *
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {

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


            lbDataDeRetirada= new JLabel();
            lbDataDeRetirada.setText("DataDeRetirada");

            lbDataDeDevolucao= new JLabel();
            lbDataDeDevolucao.setText("DataDeDevolucao");

            lbGrupo= new JLabel();
            lbGrupo.setText("Grupo");

            lbModelo= new JLabel();
            lbModelo.setText("Modelo");


			jContentPane = new JPanel();
			jContentPane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
			jContentPane.setLayout(new GridBagLayout());

            jContentPane.add(lbDataDeRetirada, gridBagConstraintsLabel0);
            jContentPane.add(getTxtDataDeRetirada(), gridBagConstraintsTxt0);
            jContentPane.add(lbDataDeDevolucao, gridBagConstraintsLabel1);
            jContentPane.add(getTxtDataDeDevolucao(), gridBagConstraintsTxt1);
            jContentPane.add(lbGrupo, gridBagConstraintsLabel2);
            jContentPane.add(getTxtGrupo(), gridBagConstraintsTxt2);
            jContentPane.add(lbModelo, gridBagConstraintsLabel3);
            jContentPane.add(getTxtModelo(), gridBagConstraintsTxt3);

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
	public void setListener(ActionListener listener) {

		this.listener = listener;

        /**
         * Associe o Listener à todos os elementos gráficos
         * necessários, para tratar os eventos..
         * Ex:
         *	botao.addActionListener(listener);
         *	botao.setActionCommand("1");
		 * 	 botao.addActionListener(new ActionListener() {
		 *	 public void actionPerformed(ActionEvent e) {
		 *	 	sendEvent(e);
		 *	 }
         *
         */
	}

	/**
	 * @param msg
	 */
	private void sendEvent(ActionEvent e){
		int msg = Integer.parseInt(e.getActionCommand());
	}

	/**
	 * @param msg
	 */
	public void changeState(int msg){
	}


    public void viewReserva() {
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

}
