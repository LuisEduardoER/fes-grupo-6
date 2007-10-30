/*
 * CÓDIGO GERADO PELO RAPDIS
 * www.geti.dcc.ufrj.br
 * Data da geração 24/10/2007
 * Hora da geração 09:11 AM
 * 
 * Nome Voce Aluga
 * E-mail Seu Email
 * Autor Grupo 6
 * Versão 1.0
 */
package model;

public class umModelo{

    /**
     * Propriedade fixa e necessaria para identificar o registro
     */
    private int oid;

    private String modeloNome;

    private String modeloFabricante;


    /**
     * Construtor dessa classe
     */
    public umModelo(){
    }

    /**
    * @return oid
    */
    public int getOid() {
        return oid;
    }

	/**
    * @param umResponsavel
    */
    public void setOid(int oid) {
        this.oid = oid;
    }

    /**
     * @return ModeloNome
     */
    public String getModeloNome() {
        return modeloNome;
    }

    /**
     * @param umModeloNome
     */
    public void setModeloNome(String umModeloNome) {
        modeloNome = umModeloNome;
    }

    /**
     * @return ModeloFabricante
     */
    public String getModeloFabricante() {
        return modeloFabricante;
    }

    /**
     * @param umModeloFabricante
     */
    public void setModeloFabricante(String umModeloFabricante) {
        modeloFabricante = umModeloFabricante;
    }


}
