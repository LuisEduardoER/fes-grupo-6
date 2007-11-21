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

public class umCartaoDeCredito{

    /**
     * Propriedade fixa e necessaria para identificar o registro
     */
    private int oid;

    private String numeroDoCartao;

    private int clienteId;


    /**
     * Construtor dessa classe
     */
    public umCartaoDeCredito(){
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
     * @return NumeroDoCartao
     */
    public String getNumeroDoCartao() {
        return numeroDoCartao;
    }

    /**
     * @param umNumeroDoCartao
     */
    public void setNumeroDoCartao(String umNumeroDoCartao) {
        numeroDoCartao = umNumeroDoCartao;
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

public class umCartaoDeCredito{

    /**
     * Propriedade fixa e necessaria para identificar o registro
       
    private int oid;

    private String numeroDoCartao;


    /**
     * Construtor dessa classe
       
    public umCartaoDeCredito(){
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
     * @return NumeroDoCartao
       
    public String getNumeroDoCartao() {
        return numeroDoCartao;
    }

    /**
     * @param umNumeroDoCartao
       
    public void setNumeroDoCartao(String umNumeroDoCartao) {
        numeroDoCartao = umNumeroDoCartao;
    }


}
*/
