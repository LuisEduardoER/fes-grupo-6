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

public class umListaNegra{

    /**
     * Propriedade fixa e necessaria para identificar o registro
     */
    private int oid;

    private int clienteId;

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
     * @return ClienteId
     */
    public int getClienteId() {
        return clienteId;
    }

    /**
     * @param umClienteId
     */
    public void setClienteId(int umClienteId) {
        clienteId = umClienteId;
    }
    /**
     * @param umClienteId
     */
    public void setClienteId(String umClienteId) {
        clienteId = Integer.parseInt(umClienteId);
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
   
package model;

public class umListaNegra{

    /**
     * Propriedade fixa e necessaria para identificar o registro
       
    private int oid;

    private int listaNegraId;

    private String listaNegraMotivo;


    /**
     * Construtor dessa classe
       
    public umListaNegra(){
    }

    /**
    * @return oid
      
    public int getOid() {
        return oid;
    }

	/**
    * @param umResponsavel
      
    public void setOid(int oid) {
        this.oid = oid;
    }

    /**
     * @return ListaNegraId
       
    public int getListaNegraId() {
        return listaNegraId;
    }

    /**
     * @param umListaNegraId
       
    public void setListaNegraId(int umListaNegraId) {
        listaNegraId = umListaNegraId;
    }
    /**
     * @param umListaNegraId
       
    public void setListaNegraId(String umListaNegraId) {
        listaNegraId = Integer.parseInt(umListaNegraId);
    }

    /**
     * @return ListaNegraMotivo
       
    public String getListaNegraMotivo() {
        return listaNegraMotivo;
    }

    /**
     * @param umListaNegraMotivo
       
    public void setListaNegraMotivo(String umListaNegraMotivo) {
        listaNegraMotivo = umListaNegraMotivo;
    }


}
*/
