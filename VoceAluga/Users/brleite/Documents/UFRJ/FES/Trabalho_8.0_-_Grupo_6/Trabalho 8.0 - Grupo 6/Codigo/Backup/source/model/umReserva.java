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

public class umReserva{

    /**
     * Propriedade fixa e necessaria para identificar o registro
     */
    private int oid;

    private int reservaId;

    private String reservaDataRetirada;

    private String reservaDataDevolucao;

    private String reservaValor;


    /**
     * Construtor dessa classe
     */
    public umReserva(){
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
     * @return ReservaId
     */
    public int getReservaId() {
        return reservaId;
    }

    /**
     * @param umReservaId
     */
    public void setReservaId(int umReservaId) {
        reservaId = umReservaId;
    }
    /**
     * @param umReservaId
     */
    public void setReservaId(String umReservaId) {
        reservaId = Integer.parseInt(umReservaId);
    }

    /**
     * @return ReservaDataRetirada
     */
    public String getReservaDataRetirada() {
        return reservaDataRetirada;
    }

    /**
     * @param umReservaDataRetirada
     */
    public void setReservaDataRetirada(String umReservaDataRetirada) {
        reservaDataRetirada = umReservaDataRetirada;
    }

    /**
     * @return ReservaDataDevolucao
     */
    public String getReservaDataDevolucao() {
        return reservaDataDevolucao;
    }

    /**
     * @param umReservaDataDevolucao
     */
    public void setReservaDataDevolucao(String umReservaDataDevolucao) {
        reservaDataDevolucao = umReservaDataDevolucao;
    }

    /**
     * @return ReservaValor
     */
    public String getReservaValor() {
        return reservaValor;
    }

    /**
     * @param umReservaValor
     */
    public void setReservaValor(String umReservaValor) {
        reservaValor = umReservaValor;
    }


}
