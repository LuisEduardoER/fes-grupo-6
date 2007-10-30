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

public class umFilial{

    /**
     * Propriedade fixa e necessaria para identificar o registro
     */
    private int oid;

    private int filialId;

    private String filialNome;

    private String filialEndereco;

    private String filialTelefone;


    /**
     * Construtor dessa classe
     */
    public umFilial(){
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
     * @return FilialId
     */
    public int getFilialId() {
        return filialId;
    }

    /**
     * @param umFilialId
     */
    public void setFilialId(int umFilialId) {
        filialId = umFilialId;
    }
    /**
     * @param umFilialId
     */
    public void setFilialId(String umFilialId) {
        filialId = Integer.parseInt(umFilialId);
    }

    /**
     * @return FilialNome
     */
    public String getFilialNome() {
        return filialNome;
    }

    /**
     * @param umFilialNome
     */
    public void setFilialNome(String umFilialNome) {
        filialNome = umFilialNome;
    }

    /**
     * @return FilialEndereco
     */
    public String getFilialEndereco() {
        return filialEndereco;
    }

    /**
     * @param umFilialEndereco
     */
    public void setFilialEndereco(String umFilialEndereco) {
        filialEndereco = umFilialEndereco;
    }

    /**
     * @return FilialTelefone
     */
    public String getFilialTelefone() {
        return filialTelefone;
    }

    /**
     * @param umFilialTelefone
     */
    public void setFilialTelefone(String umFilialTelefone) {
        filialTelefone = umFilialTelefone;
    }


}
