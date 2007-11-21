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

public class Grupo extends DomainDB {

    /**
     * Construtor dessa classe
     */
    public Grupo(){
    }
    
    // TODO: Fazer um sql para isso depois
    public umGrupo find(String grupo) {
    	List<umGrupo> l = findAll(new umGrupo());
    	l.remove(0);
    	for( umGrupo g : l ) {
    		if( g.getGrupoNome().equals(grupo) ) {
    			return g;
    		}
      	}
    	return null;
    }
    
    public List<umGrupo> findAll( int id_filial ) {
    	List result = new ArrayList();
    	
		try {
			getNomeClasse(new umGrupo());
	
	//		StringBuffer sql = new StringBuffer("select * from tbGrupo where grupoId in (select grupoId from tbModelo where modeloId in (select modeloId from tbCarro where filialId="+ id_filial +"))");
			StringBuffer sql = new StringBuffer("select * from tbGrupo" 
												+ " where grupoId in (select grupoId from tbModelo" 
													+ " where modeloId in (select modeloId from tbCarro" 
														+ " where filialId="+ id_filial 
															+ " and carroId not in ( select carroId from tbReserva )" 
															+ " and carroId not in ( select carroId from tbLocacao )))");
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

                Object temp = new umGrupo();
                
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
