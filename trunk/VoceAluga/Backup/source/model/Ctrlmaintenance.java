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
package model;

import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.*;

import model.Maintenance;
import model.DomainDB;
import model.umModelo;
import model.umCarro;
import model.umFilial;
import model.umFuncionario;
import model.umReserva;
import model.umCliente;
import model.umCartaoDeCredito;
import model.umListaNegra;
import model.umGrupos;
import model.umModelReserva;

/**
 * Controla as interações entre o formulario da manutenção
 * e a classe DomainDB
 */
public class Ctrlmaintenance {

    private DomainDB dominio = new DomainDB();


    public boolean incluir(Object obj) {
        boolean result = false;
        try{

                if(obj instanceof umModelo){
                    ((umModelo)obj).setOid(dominio.getOid(obj));
                    dominio.insert((umModelo)obj, dominio.getOid(obj));
                }
                if(obj instanceof umCarro){
                    ((umCarro)obj).setOid(dominio.getOid(obj));
                    dominio.insert((umCarro)obj, dominio.getOid(obj));
                }
                if(obj instanceof umFilial){
                    ((umFilial)obj).setOid(dominio.getOid(obj));
                    dominio.insert((umFilial)obj, dominio.getOid(obj));
                }
                if(obj instanceof umFuncionario){
                    ((umFuncionario)obj).setOid(dominio.getOid(obj));
                    dominio.insert((umFuncionario)obj, dominio.getOid(obj));
                }
                if(obj instanceof umReserva){
                    ((umReserva)obj).setOid(dominio.getOid(obj));
                    dominio.insert((umReserva)obj, dominio.getOid(obj));
                }
                if(obj instanceof umCliente){
                    ((umCliente)obj).setOid(dominio.getOid(obj));
                    dominio.insert((umCliente)obj, dominio.getOid(obj));
                }
                if(obj instanceof umCartaoDeCredito){
                    ((umCartaoDeCredito)obj).setOid(dominio.getOid(obj));
                    dominio.insert((umCartaoDeCredito)obj, dominio.getOid(obj));
                }
                if(obj instanceof umListaNegra){
                    ((umListaNegra)obj).setOid(dominio.getOid(obj));
                    dominio.insert((umListaNegra)obj, dominio.getOid(obj));
                }
                if(obj instanceof umGrupos){
                    ((umGrupos)obj).setOid(dominio.getOid(obj));
                    dominio.insert((umGrupos)obj, dominio.getOid(obj));
                }
                if(obj instanceof umModelReserva){
                    ((umModelReserva)obj).setOid(dominio.getOid(obj));
                    dominio.insert((umModelReserva)obj, dominio.getOid(obj));
                }

            result = true;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }

    public boolean excluir(Object obj) {
        boolean result = false;
        try{

                if(obj instanceof umModelo){
                    dominio.delete((umModelo)obj);
                }
                if(obj instanceof umCarro){
                    dominio.delete((umCarro)obj);
                }
                if(obj instanceof umFilial){
                    dominio.delete((umFilial)obj);
                }
                if(obj instanceof umFuncionario){
                    dominio.delete((umFuncionario)obj);
                }
                if(obj instanceof umReserva){
                    dominio.delete((umReserva)obj);
                }
                if(obj instanceof umCliente){
                    dominio.delete((umCliente)obj);
                }
                if(obj instanceof umCartaoDeCredito){
                    dominio.delete((umCartaoDeCredito)obj);
                }
                if(obj instanceof umListaNegra){
                    dominio.delete((umListaNegra)obj);
                }
                if(obj instanceof umGrupos){
                    dominio.delete((umGrupos)obj);
                }
                if(obj instanceof umModelReserva){
                    dominio.delete((umModelReserva)obj);
                }

            result = true;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }


    /**
     * Atualiza os registros que estão sendo mostrados atualmente
     * @param column valor obj
     * @return result
     */
    public boolean atualizar(String column, String valor, Object obj) {

        boolean result = false;
        Class classe = null;
        try{

                if(obj instanceof umModelo){
                    classe = ((umModelo)obj).getClass();
                }
                if(obj instanceof umCarro){
                    classe = ((umCarro)obj).getClass();
                }
                if(obj instanceof umFilial){
                    classe = ((umFilial)obj).getClass();
                }
                if(obj instanceof umFuncionario){
                    classe = ((umFuncionario)obj).getClass();
                }
                if(obj instanceof umReserva){
                    classe = ((umReserva)obj).getClass();
                }
                if(obj instanceof umCliente){
                    classe = ((umCliente)obj).getClass();
                }
                if(obj instanceof umCartaoDeCredito){
                    classe = ((umCartaoDeCredito)obj).getClass();
                }
                if(obj instanceof umListaNegra){
                    classe = ((umListaNegra)obj).getClass();
                }
                if(obj instanceof umGrupos){
                    classe = ((umGrupos)obj).getClass();
                }
                if(obj instanceof umModelReserva){
                    classe = ((umModelReserva)obj).getClass();
                }

            Method[] metodos = classe.getMethods();
            for(int i =0; i < metodos.length; i++){
                Method metodo = metodos[i];

                if(metodo.getName().equalsIgnoreCase("set" + column)){
                    Class[] params = metodo.getParameterTypes();
                    for(int j = 0; j < params.length; j++){
                        if(params[j].getName().equals("java.lang.String")){
                            metodo.invoke(obj, new Object[]{valor});

                        }
                    }

                }
            }

                if(obj instanceof umModelo){
                    dominio.update((umModelo)obj);
                }
                if(obj instanceof umCarro){
                    dominio.update((umCarro)obj);
                }
                if(obj instanceof umFilial){
                    dominio.update((umFilial)obj);
                }
                if(obj instanceof umFuncionario){
                    dominio.update((umFuncionario)obj);
                }
                if(obj instanceof umReserva){
                    dominio.update((umReserva)obj);
                }
                if(obj instanceof umCliente){
                    dominio.update((umCliente)obj);
                }
                if(obj instanceof umCartaoDeCredito){
                    dominio.update((umCartaoDeCredito)obj);
                }
                if(obj instanceof umListaNegra){
                    dominio.update((umListaNegra)obj);
                }
                if(obj instanceof umGrupos){
                    dominio.update((umGrupos)obj);
                }
                if(obj instanceof umModelReserva){
                    dominio.update((umModelReserva)obj);
                }

            result = true;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;

    }

    public List buscar(Object obj) {
        List result = new ArrayList();
        try{
	        result = dominio.findAll(obj);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;

    }

	public void beginCase(Object obj) {
		Maintenance maintenance = new Maintenance();
        maintenance.setInstancia(obj);
        maintenance.setVisible(true);
	}

}

