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

public class umListaNegra{

    /**
     * Propriedade fixa e necessaria para identificar o registro
     */
    private int oid;

    private int listaNegraId;

    private String listaNegraMotivo;


    /**
     * Construtor dessa classe
     */
    public umListaNegra(){
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
     * @return ListaNegraId
     */
    public int getListaNegraId() {
        return listaNegraId;
    }

    /**
     * @param umListaNegraId
     */
    public void setListaNegraId(int umListaNegraId) {
        listaNegraId = umListaNegraId;
    }
    /**
     * @param umListaNegraId
     */
    public void setListaNegraId(String umListaNegraId) {
        listaNegraId = Integer.parseInt(umListaNegraId);
    }

    /**
     * @return ListaNegraMotivo
     */
    public String getListaNegraMotivo() {
        return listaNegraMotivo;
    }

    /**
     * @param umListaNegraMotivo
     */
    public void setListaNegraMotivo(String umListaNegraMotivo) {
        listaNegraMotivo = umListaNegraMotivo;
    }


}
