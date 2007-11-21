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
package view;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import model.*;
import controller.ControllerLocacao;
import controller.ControllerReserva;
import controller.ViewAlugar;

public class FrmMain extends JFrame {

	private static final long serialVersionUID = 1L;

	private JMenuBar jJMenuBar = null;

	private JMenu jMenu = null;

	private JMenu jMenu1 = null;

	private JMenu jMenu2 = null;

	private JPanel jContentPanel = null;

    private JMenuItem ucAlugarCarroSemReserva;

    private JMenuItem ucReservarCarro;

    private JMenuItem Grupo;

    private JMenuItem Modelo;

    private JMenuItem Carro;

    private JMenuItem Filial;

    private JMenuItem Funcionario;

    private JMenuItem Reserva;

    private JMenuItem Cliente;

    private JMenuItem CartaoDeCredito;

    private JMenuItem ListaNegra;

    private JMenuItem Locacao;

    private JMenuItem ModelReserva;

    private JMenuItem ModelLocacao;

    private Ctrlmaintenance maintenance = new Ctrlmaintenance();


	/**
	 * Este método inicializa o jJMenuBar
	 *
	 * @return javax.swing.JMenuBar
	 */
	private JMenuBar getJJMenuBar() {
		if (jJMenuBar == null) {
			jJMenuBar = new JMenuBar();
			jJMenuBar
					.setLayout(new BoxLayout(getJJMenuBar(), BoxLayout.X_AXIS));
			jJMenuBar
					.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
			jJMenuBar.add(getJMenu());
			jJMenuBar.add(getJMenu1());
			jJMenuBar.add(getJMenu2());
		}
		return jJMenuBar;
	}

	/**
	 * Este método inicializa o jMenu
	 *
	 * @return javax.swing.JMenu
	 */
	private JMenu getJMenu() {
		if (jMenu == null) {
			jMenu = new JMenu();
			jMenu.setText("Funções");
            jMenu.add(getJMenuItemUcAlugarCarroSemReserva());
            jMenu.add(getJMenuItemUcReservarCarro());
		}
		return jMenu;
	}

	/**
	 * Este método inicializa o jMenu1
	 *
	 * @return javax.swing.JMenu
	 */
	private JMenu getJMenu1() {
		if (jMenu1 == null) {
			jMenu1 = new JMenu();
			jMenu1.setText("Mantendo");
            jMenu1.add(getJMenuItemGrupo());
            jMenu1.add(getJMenuItemModelo());
            jMenu1.add(getJMenuItemCarro());
            jMenu1.add(getJMenuItemFilial());
            jMenu1.add(getJMenuItemFuncionario());
            jMenu1.add(getJMenuItemReserva());
            jMenu1.add(getJMenuItemCliente());
            jMenu1.add(getJMenuItemCartaoDeCredito());
            jMenu1.add(getJMenuItemListaNegra());
            jMenu1.add(getJMenuItemLocacao());
            jMenu1.add(getJMenuItemModelReserva());
            jMenu1.add(getJMenuItemModelLocacao());
		}
		return jMenu1;
	}

	/**
	 * Este método inicializa o jMenu2
	 *
	 * @return javax.swing.JMenu
	 */
	private JMenu getJMenu2() {
		if (jMenu2 == null) {
			jMenu2 = new JMenu();
			jMenu2.setText("Sobre");
			jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					new FrmAbout().setVisible(true);
				}
			});
		}
		return jMenu2;
	}

	/**
	 * This method initializes jContentPanel
	 *
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPanel() {
		if (jContentPanel == null) {
			jContentPanel = new JPanel();
			jContentPanel.setLayout(new BorderLayout());
		}
		return jContentPanel;
	}


    /**
     * Este método inicializa o item de menu
     * responsável pelo caso de uso AlugarCarroSemReserva
     *
     * @return javax.swing.JMenuItem);
     */
    private JMenuItem getJMenuItemUcAlugarCarroSemReserva() {
        if (ucAlugarCarroSemReserva == null) {
            ucAlugarCarroSemReserva = new JMenuItem();
            ucAlugarCarroSemReserva.setText("AlugarCarroSemReserva");
            ucAlugarCarroSemReserva.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    ControllerLocacao controllerLocacao = new ControllerLocacao();
                    controllerLocacao.beginCase();
                }
            });
        }
        return ucAlugarCarroSemReserva;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pelo caso de uso ReservarCarro
     *
     * @return javax.swing.JMenuItem);
     */
    private JMenuItem getJMenuItemUcReservarCarro() {
        if (ucReservarCarro == null) {
            ucReservarCarro = new JMenuItem();
            ucReservarCarro.setText("ReservarCarro");
            ucReservarCarro.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    ControllerReserva controllerReserva = new ControllerReserva();
                    controllerReserva.beginCase();
                }
            });
        }
        return ucReservarCarro;
    }

    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe Grupo
     *
     * @return javax.swing.JMenuItem);
     */
    private JMenuItem getJMenuItemGrupo() {
        if (Grupo == null) {
            Grupo = new JMenuItem();
            Grupo.setText("Grupo");
            Grupo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umGrupo());
                }
            });
        }
        return Grupo;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe Modelo
     *
     * @return javax.swing.JMenuItem);
     */
    private JMenuItem getJMenuItemModelo() {
        if (Modelo == null) {
            Modelo = new JMenuItem();
            Modelo.setText("Modelo");
            Modelo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umModelo());
                }
            });
        }
        return Modelo;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe Carro
     *
     * @return javax.swing.JMenuItem);
     */
    private JMenuItem getJMenuItemCarro() {
        if (Carro == null) {
            Carro = new JMenuItem();
            Carro.setText("Carro");
            Carro.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umCarro());
                }
            });
        }
        return Carro;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe Filial
     *
     * @return javax.swing.JMenuItem);
     */
    private JMenuItem getJMenuItemFilial() {
        if (Filial == null) {
            Filial = new JMenuItem();
            Filial.setText("Filial");
            Filial.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umFilial());
                }
            });
        }
        return Filial;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe Funcionario
     *
     * @return javax.swing.JMenuItem);
     */
    private JMenuItem getJMenuItemFuncionario() {
        if (Funcionario == null) {
            Funcionario = new JMenuItem();
            Funcionario.setText("Funcionario");
            Funcionario.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umFuncionario());
                }
            });
        }
        return Funcionario;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe Reserva
     *
     * @return javax.swing.JMenuItem);
     */
    private JMenuItem getJMenuItemReserva() {
        if (Reserva == null) {
            Reserva = new JMenuItem();
            Reserva.setText("Reserva");
            Reserva.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umReserva());
                }
            });
        }
        return Reserva;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe Cliente
     *
     * @return javax.swing.JMenuItem);
     */
    private JMenuItem getJMenuItemCliente() {
        if (Cliente == null) {
            Cliente = new JMenuItem();
            Cliente.setText("Cliente");
            Cliente.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umCliente());
                }
            });
        }
        return Cliente;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe CartaoDeCredito
     *
     * @return javax.swing.JMenuItem);
     */
    private JMenuItem getJMenuItemCartaoDeCredito() {
        if (CartaoDeCredito == null) {
            CartaoDeCredito = new JMenuItem();
            CartaoDeCredito.setText("CartaoDeCredito");
            CartaoDeCredito.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umCartaoDeCredito());
                }
            });
        }
        return CartaoDeCredito;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe ListaNegra
     *
     * @return javax.swing.JMenuItem);
     */
    private JMenuItem getJMenuItemListaNegra() {
        if (ListaNegra == null) {
            ListaNegra = new JMenuItem();
            ListaNegra.setText("ListaNegra");
            ListaNegra.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umListaNegra());
                }
            });
        }
        return ListaNegra;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe Locacao
     *
     * @return javax.swing.JMenuItem);
     */
    private JMenuItem getJMenuItemLocacao() {
        if (Locacao == null) {
            Locacao = new JMenuItem();
            Locacao.setText("Locacao");
            Locacao.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umLocacao());
                }
            });
        }
        return Locacao;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe ModelReserva
     *
     * @return javax.swing.JMenuItem);
     */
    private JMenuItem getJMenuItemModelReserva() {
        if (ModelReserva == null) {
            ModelReserva = new JMenuItem();
            ModelReserva.setText("ModelReserva");
            ModelReserva.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umModelReserva());
                }
            });
        }
        return ModelReserva;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe ModelLocacao
     *
     * @return javax.swing.JMenuItem);
     */
    private JMenuItem getJMenuItemModelLocacao() {
        if (ModelLocacao == null) {
            ModelLocacao = new JMenuItem();
            ModelLocacao.setText("ModelLocacao");
            ModelLocacao.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umModelLocacao());
                }
            });
        }
        return ModelLocacao;
    }

	/**
	 * This is the default constructor
	 */
	public FrmMain() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 *
	 * @return void
	 */
	private void initialize() {
		this.setSize(580, 350);
		this.setContentPane(getJContentPanel());
		this.setJMenuBar(getJJMenuBar());
        this.setTitle("VoceAluga");
	}

}
/*
/*
 * CÓDIGO GERADO PELO RAPDIS
 * www.geti.dcc.ufrj.br
 * Data da geração 20/11/2007
 * Hora da geração 05:14 PM
 * 
 * Nome Voce Aluga
 * E-mail Seu Email
 * Autor Grupo 6
 * Versão 1.0
   
package view;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import model.*;
import controller.ControllerLocacao;
import controller.ControllerReserva;
import controller.ViewAlugar;

public class FrmMain extends JFrame {

	private static final long serialVersionUID = 1L;

	private JMenuBar jJMenuBar = null;

	private JMenu jMenu = null;

	private JMenu jMenu1 = null;

	private JMenu jMenu2 = null;

	private JPanel jContentPanel = null;

    private JMenuItem ucAlugarCarroSemReserva;

    private JMenuItem ucReservarCarro;

    private JMenuItem Grupo;

    private JMenuItem Modelo;

    private JMenuItem Carro;

    private JMenuItem Filial;

    private JMenuItem Funcionario;

    private JMenuItem Reserva;

    private JMenuItem Cliente;

    private JMenuItem CartaoDeCredito;

    private JMenuItem ListaNegra;

    private JMenuItem Locacao;

    private JMenuItem ModelReserva;

    private JMenuItem ModelLocacao;

    private Ctrlmaintenance maintenance = new Ctrlmaintenance();


	/**
	 * Este método inicializa o jJMenuBar
	 *
	 * @return javax.swing.JMenuBar
	   
	private JMenuBar getJJMenuBar() {
		if (jJMenuBar == null) {
			jJMenuBar = new JMenuBar();
			jJMenuBar
					.setLayout(new BoxLayout(getJJMenuBar(), BoxLayout.X_AXIS));
			jJMenuBar
					.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
			jJMenuBar.add(getJMenu());
			jJMenuBar.add(getJMenu1());
			jJMenuBar.add(getJMenu2());
		}
		return jJMenuBar;
	}

	/**
	 * Este método inicializa o jMenu
	 *
	 * @return javax.swing.JMenu
	   
	private JMenu getJMenu() {
		if (jMenu == null) {
			jMenu = new JMenu();
			jMenu.setText("Funções");
            jMenu.add(getJMenuItemUcAlugarCarroSemReserva());
            jMenu.add(getJMenuItemUcReservarCarro());
		}
		return jMenu;
	}

	/**
	 * Este método inicializa o jMenu1
	 *
	 * @return javax.swing.JMenu
	   
	private JMenu getJMenu1() {
		if (jMenu1 == null) {
			jMenu1 = new JMenu();
			jMenu1.setText("Mantendo");
            jMenu1.add(getJMenuItemGrupo());
            jMenu1.add(getJMenuItemModelo());
            jMenu1.add(getJMenuItemCarro());
            jMenu1.add(getJMenuItemFilial());
            jMenu1.add(getJMenuItemFuncionario());
            jMenu1.add(getJMenuItemReserva());
            jMenu1.add(getJMenuItemCliente());
            jMenu1.add(getJMenuItemCartaoDeCredito());
            jMenu1.add(getJMenuItemListaNegra());
            jMenu1.add(getJMenuItemLocacao());
            jMenu1.add(getJMenuItemModelReserva());
            jMenu1.add(getJMenuItemModelLocacao());
		}
		return jMenu1;
	}

	/**
	 * Este método inicializa o jMenu2
	 *
	 * @return javax.swing.JMenu
	   
	private JMenu getJMenu2() {
		if (jMenu2 == null) {
			jMenu2 = new JMenu();
			jMenu2.setText("Sobre");
			jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					new FrmAbout().setVisible(true);
				}
			});
		}
		return jMenu2;
	}

	/**
	 * This method initializes jContentPanel
	 *
	 * @return javax.swing.JPanel
	   
	private JPanel getJContentPanel() {
		if (jContentPanel == null) {
			jContentPanel = new JPanel();
			jContentPanel.setLayout(new BorderLayout());
		}
		return jContentPanel;
	}


    /**
     * Este método inicializa o item de menu
     * responsável pelo caso de uso AlugarCarroSemReserva
     *
     * @return javax.swing.JMenuItem);
       
    private JMenuItem getJMenuItemUcAlugarCarroSemReserva() {
        if (ucAlugarCarroSemReserva == null) {
            ucAlugarCarroSemReserva = new JMenuItem();
            ucAlugarCarroSemReserva.setText("AlugarCarroSemReserva");
            ucAlugarCarroSemReserva.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    ControllerLocacao controllerLocacao = new ControllerLocacao();
                    controllerLocacao.beginCase();
                }
            });
        }
        return ucAlugarCarroSemReserva;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pelo caso de uso ReservarCarro
     *
     * @return javax.swing.JMenuItem);
       
    private JMenuItem getJMenuItemUcReservarCarro() {
        if (ucReservarCarro == null) {
            ucReservarCarro = new JMenuItem();
            ucReservarCarro.setText("ReservarCarro");
            ucReservarCarro.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    ControllerReserva controllerReserva = new ControllerReserva();
                    controllerReserva.beginCase();
                }
            });
        }
        return ucReservarCarro;
    }

    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe Grupo
     *
     * @return javax.swing.JMenuItem);
       
    private JMenuItem getJMenuItemGrupo() {
        if (Grupo == null) {
            Grupo = new JMenuItem();
            Grupo.setText("Grupo");
            Grupo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umGrupo());
                }
            });
        }
        return Grupo;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe Modelo
     *
     * @return javax.swing.JMenuItem);
       
    private JMenuItem getJMenuItemModelo() {
        if (Modelo == null) {
            Modelo = new JMenuItem();
            Modelo.setText("Modelo");
            Modelo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umModelo());
                }
            });
        }
        return Modelo;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe Carro
     *
     * @return javax.swing.JMenuItem);
       
    private JMenuItem getJMenuItemCarro() {
        if (Carro == null) {
            Carro = new JMenuItem();
            Carro.setText("Carro");
            Carro.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umCarro());
                }
            });
        }
        return Carro;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe Filial
     *
     * @return javax.swing.JMenuItem);
       
    private JMenuItem getJMenuItemFilial() {
        if (Filial == null) {
            Filial = new JMenuItem();
            Filial.setText("Filial");
            Filial.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umFilial());
                }
            });
        }
        return Filial;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe Funcionario
     *
     * @return javax.swing.JMenuItem);
       
    private JMenuItem getJMenuItemFuncionario() {
        if (Funcionario == null) {
            Funcionario = new JMenuItem();
            Funcionario.setText("Funcionario");
            Funcionario.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umFuncionario());
                }
            });
        }
        return Funcionario;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe Reserva
     *
     * @return javax.swing.JMenuItem);
       
    private JMenuItem getJMenuItemReserva() {
        if (Reserva == null) {
            Reserva = new JMenuItem();
            Reserva.setText("Reserva");
            Reserva.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umReserva());
                }
            });
        }
        return Reserva;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe Cliente
     *
     * @return javax.swing.JMenuItem);
       
    private JMenuItem getJMenuItemCliente() {
        if (Cliente == null) {
            Cliente = new JMenuItem();
            Cliente.setText("Cliente");
            Cliente.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umCliente());
                }
            });
        }
        return Cliente;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe CartaoDeCredito
     *
     * @return javax.swing.JMenuItem);
       
    private JMenuItem getJMenuItemCartaoDeCredito() {
        if (CartaoDeCredito == null) {
            CartaoDeCredito = new JMenuItem();
            CartaoDeCredito.setText("CartaoDeCredito");
            CartaoDeCredito.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umCartaoDeCredito());
                }
            });
        }
        return CartaoDeCredito;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe ListaNegra
     *
     * @return javax.swing.JMenuItem);
       
    private JMenuItem getJMenuItemListaNegra() {
        if (ListaNegra == null) {
            ListaNegra = new JMenuItem();
            ListaNegra.setText("ListaNegra");
            ListaNegra.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umListaNegra());
                }
            });
        }
        return ListaNegra;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe Locacao
     *
     * @return javax.swing.JMenuItem);
       
    private JMenuItem getJMenuItemLocacao() {
        if (Locacao == null) {
            Locacao = new JMenuItem();
            Locacao.setText("Locacao");
            Locacao.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umLocacao());
                }
            });
        }
        return Locacao;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe ModelReserva
     *
     * @return javax.swing.JMenuItem);
       
    private JMenuItem getJMenuItemModelReserva() {
        if (ModelReserva == null) {
            ModelReserva = new JMenuItem();
            ModelReserva.setText("ModelReserva");
            ModelReserva.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umModelReserva());
                }
            });
        }
        return ModelReserva;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe ModelLocacao
     *
     * @return javax.swing.JMenuItem);
       
    private JMenuItem getJMenuItemModelLocacao() {
        if (ModelLocacao == null) {
            ModelLocacao = new JMenuItem();
            ModelLocacao.setText("ModelLocacao");
            ModelLocacao.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umModelLocacao());
                }
            });
        }
        return ModelLocacao;
    }

	/**
	 * This is the default constructor
	   
	public FrmMain() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 *
	 * @return void
	   
	private void initialize() {
		this.setSize(580, 350);
		this.setContentPane(getJContentPanel());
		this.setJMenuBar(getJJMenuBar());
        this.setTitle("VoceAluga");
	}

}
/*
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
   
package view;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import model.*;
import controller.Grupo;
import controller.ControllerLocacao;
import controller.ControllerReserva;
import controller.ViewAlugar;

public class FrmMain extends JFrame {

	private static final long serialVersionUID = 1L;

	private JMenuBar jJMenuBar = null;

	private JMenu jMenu = null;

	private JMenu jMenu1 = null;

	private JMenu jMenu2 = null;

	private JPanel jContentPanel = null;

    private JMenuItem ucAlugarCarroSemReserva;

    private JMenuItem ucReservarCarro;

    private JMenuItem Modelo;

    private JMenuItem Carro;

    private JMenuItem Filial;

    private JMenuItem Funcionario;

    private JMenuItem Reserva;

    private JMenuItem Cliente;

    private JMenuItem CartaoDeCredito;

    private JMenuItem ListaNegra;

    private JMenuItem Grupos;

    private JMenuItem Locacao;

    private JMenuItem ModelReserva;

    private JMenuItem ModelLocacao;

    private Ctrlmaintenance maintenance = new Ctrlmaintenance();


	/**
	 * Este método inicializa o jJMenuBar
	 *
	 * @return javax.swing.JMenuBar
	   
	private JMenuBar getJJMenuBar() {
		if (jJMenuBar == null) {
			jJMenuBar = new JMenuBar();
			jJMenuBar
					.setLayout(new BoxLayout(getJJMenuBar(), BoxLayout.X_AXIS));
			jJMenuBar
					.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
			jJMenuBar.add(getJMenu());
			jJMenuBar.add(getJMenu1());
			jJMenuBar.add(getJMenu2());
		}
		return jJMenuBar;
	}

	/**
	 * Este método inicializa o jMenu
	 *
	 * @return javax.swing.JMenu
	   
	private JMenu getJMenu() {
		if (jMenu == null) {
			jMenu = new JMenu();
			jMenu.setText("Funções");
            jMenu.add(getJMenuItemUcAlugarCarroSemReserva());
            jMenu.add(getJMenuItemUcReservarCarro());
		}
		return jMenu;
	}

	/**
	 * Este método inicializa o jMenu1
	 *
	 * @return javax.swing.JMenu
	   
	private JMenu getJMenu1() {
		if (jMenu1 == null) {
			jMenu1 = new JMenu();
			jMenu1.setText("Mantendo");
            jMenu1.add(getJMenuItemModelo());
            jMenu1.add(getJMenuItemCarro());
            jMenu1.add(getJMenuItemFilial());
            jMenu1.add(getJMenuItemFuncionario());
            jMenu1.add(getJMenuItemReserva());
            jMenu1.add(getJMenuItemCliente());
            jMenu1.add(getJMenuItemCartaoDeCredito());
            jMenu1.add(getJMenuItemListaNegra());
            jMenu1.add(getJMenuItemGrupos());
            jMenu1.add(getJMenuItemLocacao());
            jMenu1.add(getJMenuItemModelReserva());
            jMenu1.add(getJMenuItemModelLocacao());
		}
		return jMenu1;
	}

	/**
	 * Este método inicializa o jMenu2
	 *
	 * @return javax.swing.JMenu
	   
	private JMenu getJMenu2() {
		if (jMenu2 == null) {
			jMenu2 = new JMenu();
			jMenu2.setText("Sobre");
			jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					new FrmAbout().setVisible(true);
				}
			});
		}
		return jMenu2;
	}

	/**
	 * This method initializes jContentPanel
	 *
	 * @return javax.swing.JPanel
	   
	private JPanel getJContentPanel() {
		if (jContentPanel == null) {
			jContentPanel = new JPanel();
			jContentPanel.setLayout(new BorderLayout());
		}
		return jContentPanel;
	}


    /**
     * Este método inicializa o item de menu
     * responsável pelo caso de uso AlugarCarroSemReserva
     *
     * @return javax.swing.JMenuItem);
       
    private JMenuItem getJMenuItemUcAlugarCarroSemReserva() {
        if (ucAlugarCarroSemReserva == null) {
            ucAlugarCarroSemReserva = new JMenuItem();
            ucAlugarCarroSemReserva.setText("AlugarCarroSemReserva");
            ucAlugarCarroSemReserva.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    ControllerLocacao controllerLocacao = new ControllerLocacao();
                    controllerLocacao.beginCase();
                }
            });
        }
        return ucAlugarCarroSemReserva;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pelo caso de uso ReservarCarro
     *
     * @return javax.swing.JMenuItem);
       
    private JMenuItem getJMenuItemUcReservarCarro() {
        if (ucReservarCarro == null) {
            ucReservarCarro = new JMenuItem();
            ucReservarCarro.setText("ReservarCarro");
            ucReservarCarro.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    ControllerReserva controllerReserva = new ControllerReserva();
                    controllerReserva.beginCase();
                }
            });
        }
        return ucReservarCarro;
    }

    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe Modelo
     *
     * @return javax.swing.JMenuItem);
       
    private JMenuItem getJMenuItemModelo() {
        if (Modelo == null) {
            Modelo = new JMenuItem();
            Modelo.setText("Modelo");
            Modelo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umModelo());
                }
            });
        }
        return Modelo;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe Carro
     *
     * @return javax.swing.JMenuItem);
       
    private JMenuItem getJMenuItemCarro() {
        if (Carro == null) {
            Carro = new JMenuItem();
            Carro.setText("Carro");
            Carro.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umCarro());
                }
            });
        }
        return Carro;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe Filial
     *
     * @return javax.swing.JMenuItem);
       
    private JMenuItem getJMenuItemFilial() {
        if (Filial == null) {
            Filial = new JMenuItem();
            Filial.setText("Filial");
            Filial.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umFilial());
                }
            });
        }
        return Filial;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe Funcionario
     *
     * @return javax.swing.JMenuItem);
       
    private JMenuItem getJMenuItemFuncionario() {
        if (Funcionario == null) {
            Funcionario = new JMenuItem();
            Funcionario.setText("Funcionario");
            Funcionario.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umFuncionario());
                }
            });
        }
        return Funcionario;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe Reserva
     *
     * @return javax.swing.JMenuItem);
       
    private JMenuItem getJMenuItemReserva() {
        if (Reserva == null) {
            Reserva = new JMenuItem();
            Reserva.setText("Reserva");
            Reserva.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umReserva());
                }
            });
        }
        return Reserva;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe Cliente
     *
     * @return javax.swing.JMenuItem);
       
    private JMenuItem getJMenuItemCliente() {
        if (Cliente == null) {
            Cliente = new JMenuItem();
            Cliente.setText("Cliente");
            Cliente.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umCliente());
                }
            });
        }
        return Cliente;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe CartaoDeCredito
     *
     * @return javax.swing.JMenuItem);
       
    private JMenuItem getJMenuItemCartaoDeCredito() {
        if (CartaoDeCredito == null) {
            CartaoDeCredito = new JMenuItem();
            CartaoDeCredito.setText("CartaoDeCredito");
            CartaoDeCredito.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umCartaoDeCredito());
                }
            });
        }
        return CartaoDeCredito;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe ListaNegra
     *
     * @return javax.swing.JMenuItem);
       
    private JMenuItem getJMenuItemListaNegra() {
        if (ListaNegra == null) {
            ListaNegra = new JMenuItem();
            ListaNegra.setText("ListaNegra");
            ListaNegra.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umListaNegra());
                }
            });
        }
        return ListaNegra;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe Grupos
     *
     * @return javax.swing.JMenuItem);
       
    private JMenuItem getJMenuItemGrupos() {
        if (Grupos == null) {
            Grupos = new JMenuItem();
            Grupos.setText("Grupos");
            Grupos.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umGrupos());
                }
            });
        }
        return Grupos;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe Locacao
     *
     * @return javax.swing.JMenuItem);
       
    private JMenuItem getJMenuItemLocacao() {
        if (Locacao == null) {
            Locacao = new JMenuItem();
            Locacao.setText("Locacao");
            Locacao.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umLocacao());
                }
            });
        }
        return Locacao;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe ModelReserva
     *
     * @return javax.swing.JMenuItem);
       
    private JMenuItem getJMenuItemModelReserva() {
        if (ModelReserva == null) {
            ModelReserva = new JMenuItem();
            ModelReserva.setText("ModelReserva");
            ModelReserva.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umModelReserva());
                }
            });
        }
        return ModelReserva;
    }
    /**
     * Este método inicializa o item de menu
     * responsável pela manutenção da classe ModelLocacao
     *
     * @return javax.swing.JMenuItem);
       
    private JMenuItem getJMenuItemModelLocacao() {
        if (ModelLocacao == null) {
            ModelLocacao = new JMenuItem();
            ModelLocacao.setText("ModelLocacao");
            ModelLocacao.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    maintenance.beginCase(new umModelLocacao());
                }
            });
        }
        return ModelLocacao;
    }

	/**
	 * This is the default constructor
	   
	public FrmMain() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 *
	 * @return void
	   
	private void initialize() {
		this.setSize(580, 350);
		this.setContentPane(getJContentPanel());
		this.setJMenuBar(getJJMenuBar());
        this.setTitle("VoceAluga");
	}

}
  
*/
