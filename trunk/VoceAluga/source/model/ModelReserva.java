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

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ModelReserva extends DomainDB {

    /**
     * Construtor dessa classe
     */
    public ModelReserva(){
    }


    public void construtor(){
    }


    public void getGruposDisponiveis(){
    }

    public void getModelosDisponiveis(){
    }

    // Registra reserva no banco
	public boolean registrarReserva(String cpfCliente,umCarro uC, String dataRetirada, String dataDevolucao, double valorAluguel, int idFilialRetirada)
	{
		
		Reserva reservaDao = new Reserva();
		boolean result = reservaDao.criaReserva(cpfCliente, uC, dataRetirada, dataDevolucao, valorAluguel, idFilialRetirada);
		if( result ) {
			JOptionPane.showMessageDialog(null, "Reserva efetuada com sucesso", "Confirmação",1);
		}
		else {
			JOptionPane.showMessageDialog(null, "Reserva falhou", "Confirmação",1);
		}
		return result;	
		
	}
    
    public List<umGrupo> getListaGruposDisponíveis( int id_filial, String dataRetirada, String dataDevolucao  ) {
		
    	Grupo grupoDao = new Grupo();
    	List<umGrupo> l = grupoDao.findAll(id_filial, dataRetirada, dataDevolucao);
    	
    	return l;
    }
    
    public List<umCarro> getListaCarrosDisponiveis(String filial, String grupo, String dataRetirada, String dataDevolucao ) {
    	Carro carroDao = new Carro();
    	List<umCarro> l = carroDao.findAll(filial, grupo, dataRetirada, dataDevolucao);
    	
    	return l;
    }
}