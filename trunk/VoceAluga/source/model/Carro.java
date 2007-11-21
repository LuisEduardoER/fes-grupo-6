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

public class Carro extends DomainDB {

    /**
     * Construtor dessa classe
     */
    public Carro(){
    }

    public boolean atualizaCarro(int idCarro, int idFilialAtual) {
    	
    	umCarro uC = find(idCarro);
		uC.setFilialId(idFilialAtual);
    	return update(uC);    	
    }
    
    public umCarro find(int idCarro) {
    	
    	List<umCarro> l = findAll(new umCarro());
    	l.remove(0);
    	for( umCarro c : l ) {
    		if( c.getCarroId() == idCarro ) {
    	
    			return c;
    		}
      	}
    	return null;
    }
    
    public umCarro find(String modelo) {
    	
    	List<umCarro> l = findAll(new umCarro());
    	l.remove(0);
    	for( umCarro c : l ) {
    		if( c.getCarroModelo() == modelo ) {
    			
    			return c;
    		}
      	}
    	return null;
    }
    
    public List<umCarro> findAll(String filial, String grupo, String dataRetirada, String dataDevolucao) {
    	
    	Filial filialDao = new Filial();
    	umFilial uF = filialDao.find( filial );
    	
    	Grupo grupoDao = new Grupo();
    	umGrupo uG = grupoDao.find(grupo);
    	
    	
    	List result = new ArrayList();
    	
		try {
			getNomeClasse(new umCarro());
	
			//StringBuffer sql = new StringBuffer("select * from tbCarro where filialId=" + uF.getFilialId() + " and modeloId in (select modeloId from tbModelo where grupoId=" + uG.getGrupoId() + ")");
			//StringBuffer sql = new StringBuffer("select * from tbModelo where grupoId=" + uG.getGrupoId() + " and modeloId in (select modeloId from tbCarro where filialId=" + uF.getFilialId() + ")");
			StringBuffer sql = new StringBuffer("select * from tbCarro where filialId=" + uF.getFilialId() 
												+ " and modeloId in (select modeloId from tbModelo where grupoId=" + uG.getGrupoId() 
												+ " and carroId not in ( select carroId from tbReserva where date(reservaDataDevolucao)>=now())" 
												+ " and carroId not in ( select carroId from tbLocacao where date(locacaoDataDevolucao)>=now()))");

			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
            ResultSet rs = pstmt.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();
            int numCols = rsmd.getColumnCount ();
            List colunas = new ArrayList();

            for(int i = 1; i <= numCols; i++){
                if(!rsmd.getColumnName(i).equalsIgnoreCase("OID"))
                    colunas.add(rsmd.getColumnName(i));
            }

            result.add((String[])colunas.toArray(new String[colunas.size()]));

            while(rs.next()){

                Object temp = new umCarro();
                
                Method[] metodos = classe.getMethods();
                Field[] atributos = classe.getDeclaredFields();
                Field campo = null;

                for(int i =0; i < atributos.length; i++){
                    campo = atributos[i];
                    for(int j = 0; j < metodos.length; j++){
                        Method metodo = metodos[j];
                        if(metodo.getName().equalsIgnoreCase("set" + campo.getName())){
                            Object valorParam = this.getMetodo(rs, campo);

		        			if((valorParam instanceof Integer || valorParam instanceof Float ||
		        					valorParam instanceof Long || valorParam instanceof Double) &&
		        					!metodo.getParameterTypes()[0].getName().equals("java.lang.String")){
	                             metodo.invoke(temp, new Object[]{valorParam});
                                 break;
                            }else if(valorParam instanceof java.lang.String &&
                                    metodo.getParameterTypes()[0].getName().equals("java.lang.String") ){
                                 metodo.invoke(temp, new Object[]{valorParam});
                                 break;
                            }

                        }

                    }
                }

                result.add(temp);
            }
        	pstmt.close();
			rs.close();
	}
    catch(SQLException sqle){
        System.out.println(sqle.getMessage());
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    
    result.remove(0);

    return result;
    }

}