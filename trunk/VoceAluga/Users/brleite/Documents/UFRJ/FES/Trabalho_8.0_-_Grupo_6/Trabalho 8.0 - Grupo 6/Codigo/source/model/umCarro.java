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

public class umCarro{

    /**
     * Propriedade fixa e necessaria para identificar o registro
     */
    private int oid;

    private int carroId;

    private String carroModelo;

    private String carroPlaca;

    private String dtIniManutencao;

    private String dtFimManutencao;


    /**
     * Construtor dessa classe
     */
    public umCarro(){
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

    /**
     * @return CarroModelo
     */
    public String getCarroModelo() {
        return carroModelo;
    }

    /**
     * @param umCarroModelo
     */
    public void setCarroModelo(String umCarroModelo) {
        carroModelo = umCarroModelo;
    }

    /**
     * @return CarroPlaca
     */
    public String getCarroPlaca() {
        return carroPlaca;
    }

    /**
     * @param umCarroPlaca
     */
    public void setCarroPlaca(String umCarroPlaca) {
        carroPlaca = umCarroPlaca;
    }

    /**
     * @return DtIniManutencao
     */
    public String getDtIniManutencao() {
        return dtIniManutencao;
    }

    /**
     * @param umDtIniManutencao
     */
    public void setDtIniManutencao(String umDtIniManutencao) {
        dtIniManutencao = umDtIniManutencao;
    }

    /**
     * @return DtFimManutencao
     */
    public String getDtFimManutencao() {
        return dtFimManutencao;
    }

    /**
     * @param umDtFimManutencao
     */
    public void setDtFimManutencao(String umDtFimManutencao) {
        dtFimManutencao = umDtFimManutencao;
    }


}
