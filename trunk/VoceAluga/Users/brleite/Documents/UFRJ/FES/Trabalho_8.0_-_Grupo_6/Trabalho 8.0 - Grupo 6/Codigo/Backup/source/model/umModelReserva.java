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

public class umModelReserva{

    /**
     * Propriedade fixa e necessaria para identificar o registro
     */
    private int oid;


    private String dataDeRetirada;

    private String dataDeDevolucao;

    private String grupo;

    private String modelo;

    /**
     * Construtor dessa classe
     */
    public umModelReserva(){
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
     * @return DataDeRetirada
     */
    public String getDataDeRetirada() {
        return dataDeRetirada;
    }

    /**
     * @param umDataDeRetirada
     */
    public void setDataDeRetirada(String umDataDeRetirada) {
        dataDeRetirada = umDataDeRetirada;
    }

    /**
     * @return DataDeDevolucao
     */
    public String getDataDeDevolucao() {
        return dataDeDevolucao;
    }

    /**
     * @param umDataDeDevolucao
     */
    public void setDataDeDevolucao(String umDataDeDevolucao) {
        dataDeDevolucao = umDataDeDevolucao;
    }

    /**
     * @return Grupo
     */
    public String getGrupo() {
        return grupo;
    }

    /**
     * @param umGrupo
     */
    public void setGrupo(String umGrupo) {
        grupo = umGrupo;
    }

    /**
     * @return Modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param umModelo
     */
    public void setModelo(String umModelo) {
        modelo = umModelo;
    }


}
