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

public class umCartaoDeCredito{

    /**
     * Propriedade fixa e necessaria para identificar o registro
     */
    private int oid;

    private String numeroDoCartao;


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


}
