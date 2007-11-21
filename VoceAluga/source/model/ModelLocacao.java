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

public class ModelLocacao extends DomainDB {

    /**
     * Construtor dessa classe
     */
    public ModelLocacao(){
    }


    public void construtor(){
    }


    public void getGruposDisponiveis(){
    }

    public void getModelosDisponiveis(){
    }

    public boolean registrarLocacao(String cpfCliente, int idCarro, String dataRetirada, String dataDevolucao, double valorAluguel, int idFilialRetirada, int idFilialDevolucao){
    	
    	Locacao locacaoDao = new Locacao();
    	
    	boolean result = locacaoDao.criaLocacao(cpfCliente, idCarro, dataRetirada, dataDevolucao, valorAluguel, idFilialRetirada, idFilialDevolucao);
    	
 		if( result ) {
			JOptionPane.showMessageDialog(null, "Locacao efetuada com sucesso", "Confirmação",1);
	    	Carro carroDao = new Carro();
	    	return carroDao.atualizaCarro( idCarro, idFilialDevolucao );
		}
		else {
			JOptionPane.showMessageDialog(null, "Locacao falhou", "Confirmação",1);
		}
 		
 		return result;
		
    }
    
    public List<umGrupo> getListaGruposDisponíveis( int id_filial ) {
    	Grupo grupoDao = new Grupo();
    	List<umGrupo> l = grupoDao.findAll(id_filial);
    	
    	return l;
    }
    	
    public List<umFilial> getListaFiliais() {
    	Filial filialDao = new Filial();
    	List<umFilial> l = filialDao.findAll(new umFilial());
    	l.remove(0);
    	return l;
    }
    
    public List<umCarro> getListaCarrosDisponiveis(String filial, String grupo) {
    	Carro carroDao = new Carro();
    	List<umCarro> l = carroDao.findAll(filial, grupo);
    	
    	return l;
    }
}