/*
 * C�DIGO GERADO PELO RAPDIS
 * www.geti.dcc.ufrj.br
 * Data da gera��o 21/11/2007
 * Hora da gera��o 02:18 AM
 * 
 * Nome Voce Aluga
 * E-mail Seu Email
 * Autor Grupo 6
 * Vers�o 1.0
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

    private int modeloId;

    private int clienteId;

    private int carroId;


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

    /**
     * @return ModeloId
     */
    public int getModeloId() {
        return modeloId;
    }

    /**
     * @param umModeloId
     */
    public void setModeloId(int umModeloId) {
        modeloId = umModeloId;
    }
    /**
     * @param umModeloId
     */
    public void setModeloId(String umModeloId) {
        modeloId = Integer.parseInt(umModeloId);
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
     * @return CarroId
     */
    public int getCarroId() {
        return carroId;
    }

    /**
     * @param umCarroId
     */
    public void setCarroId(int umCarroId) {
        carroId = umCarroId;
    }
    /**
     * @param umCarroId
     */
    public void setCarroId(String umCarroId) {
        carroId = Integer.parseInt(umCarroId);
    }


}
