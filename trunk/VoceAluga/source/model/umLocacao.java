/*
 * CÓDIGO GERADO PELO RAPDIS
 * www.geti.dcc.ufrj.br
 * Data da geração 21/11/2007
 * Hora da geração 02:11 AM
 * 
 * Nome Voce Aluga
 * E-mail Seu Email
 * Autor Grupo 6
 * Versão 1.0
 */
package model;

public class umLocacao{

    /**
     * Propriedade fixa e necessaria para identificar o registro
     */
    private int oid;

    private int locacaoId;

    private String locacaoDataRetirada;

    private String locacaoDataDevolucao;

    private float locacaoValor;

    private int modeloId;

    private int clienteId;

    private int carroId;


    /**
     * Construtor dessa classe
     */
    public umLocacao(){
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
     * @return LocacaoId
     */
    public int getLocacaoId() {
        return locacaoId;
    }

    /**
     * @param umLocacaoId
     */
    public void setLocacaoId(int umLocacaoId) {
        locacaoId = umLocacaoId;
    }
    /**
     * @param umLocacaoId
     */
    public void setLocacaoId(String umLocacaoId) {
        locacaoId = Integer.parseInt(umLocacaoId);
    }

    /**
     * @return LocacaoDataRetirada
     */
    public String getLocacaoDataRetirada() {
        return locacaoDataRetirada;
    }

    /**
     * @param umLocacaoDataRetirada
     */
    public void setLocacaoDataRetirada(String umLocacaoDataRetirada) {
        locacaoDataRetirada = umLocacaoDataRetirada;
    }

    /**
     * @return LocacaoDataDevolucao
     */
    public String getLocacaoDataDevolucao() {
        return locacaoDataDevolucao;
    }

    /**
     * @param umLocacaoDataDevolucao
     */
    public void setLocacaoDataDevolucao(String umLocacaoDataDevolucao) {
        locacaoDataDevolucao = umLocacaoDataDevolucao;
    }

    /**
     * @return LocacaoValor
     */
    public float getLocacaoValor() {
        return locacaoValor;
    }

    /**
     * @param umLocacaoValor
     */
    public void setLocacaoValor(float umLocacaoValor) {
        locacaoValor = umLocacaoValor;
    }
    /**
     * @param umLocacaoValor
     */
    public void setLocacaoValor(String umLocacaoValor) {
        locacaoValor = Float.parseFloat(umLocacaoValor);
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