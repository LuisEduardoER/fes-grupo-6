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

public class umGrupos{

    /**
     * Propriedade fixa e necessaria para identificar o registro
     */
    private int oid;

    private int grupoId;

    private String grupoNome;

    private boolean grupoAr;

    private boolean grupoVidro;

    private boolean grupoDirecao;

    private int grupoPortas;

    private String grupoMotor;

    private boolean grupoCd;

    private boolean grupoTrava;

    private float grupoValorDiaria;


    /**
     * Construtor dessa classe
     */
    public umGrupos(){
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
     * @return GrupoId
     */
    public int getGrupoId() {
        return grupoId;
    }

    /**
     * @param umGrupoId
     */
    public void setGrupoId(int umGrupoId) {
        grupoId = umGrupoId;
    }
    /**
     * @param umGrupoId
     */
    public void setGrupoId(String umGrupoId) {
        grupoId = Integer.parseInt(umGrupoId);
    }

    /**
     * @return GrupoNome
     */
    public String getGrupoNome() {
        return grupoNome;
    }

    /**
     * @param umGrupoNome
     */
    public void setGrupoNome(String umGrupoNome) {
        grupoNome = umGrupoNome;
    }

    /**
     * @return GrupoAr
     */
    public boolean getGrupoAr() {
        return grupoAr;
    }

    /**
     * @param umGrupoAr
     */
    public void setGrupoAr(boolean umGrupoAr) {
        grupoAr = umGrupoAr;
    }
    /**
     * @param umGrupoAr
     */
    public void setGrupoAr(String umGrupoAr) {
        grupoAr = Boolean.parseBoolean(umGrupoAr);
    }

    /**
     * @return GrupoVidro
     */
    public boolean getGrupoVidro() {
        return grupoVidro;
    }

    /**
     * @param umGrupoVidro
     */
    public void setGrupoVidro(boolean umGrupoVidro) {
        grupoVidro = umGrupoVidro;
    }
    /**
     * @param umGrupoVidro
     */
    public void setGrupoVidro(String umGrupoVidro) {
        grupoVidro = Boolean.parseBoolean(umGrupoVidro);
    }

    /**
     * @return GrupoDirecao
     */
    public boolean getGrupoDirecao() {
        return grupoDirecao;
    }

    /**
     * @param umGrupoDirecao
     */
    public void setGrupoDirecao(boolean umGrupoDirecao) {
        grupoDirecao = umGrupoDirecao;
    }
    /**
     * @param umGrupoDirecao
     */
    public void setGrupoDirecao(String umGrupoDirecao) {
        grupoDirecao = Boolean.parseBoolean(umGrupoDirecao);
    }

    /**
     * @return GrupoPortas
     */
    public int getGrupoPortas() {
        return grupoPortas;
    }

    /**
     * @param umGrupoPortas
     */
    public void setGrupoPortas(int umGrupoPortas) {
        grupoPortas = umGrupoPortas;
    }
    /**
     * @param umGrupoPortas
     */
    public void setGrupoPortas(String umGrupoPortas) {
        grupoPortas = Integer.parseInt(umGrupoPortas);
    }

    /**
     * @return GrupoMotor
     */
    public String getGrupoMotor() {
        return grupoMotor;
    }

    /**
     * @param umGrupoMotor
     */
    public void setGrupoMotor(String umGrupoMotor) {
        grupoMotor = umGrupoMotor;
    }

    /**
     * @return GrupoCd
     */
    public boolean getGrupoCd() {
        return grupoCd;
    }

    /**
     * @param umGrupoCd
     */
    public void setGrupoCd(boolean umGrupoCd) {
        grupoCd = umGrupoCd;
    }
    /**
     * @param umGrupoCd
     */
    public void setGrupoCd(String umGrupoCd) {
        grupoCd = Boolean.parseBoolean(umGrupoCd);
    }

    /**
     * @return GrupoTrava
     */
    public boolean getGrupoTrava() {
        return grupoTrava;
    }

    /**
     * @param umGrupoTrava
     */
    public void setGrupoTrava(boolean umGrupoTrava) {
        grupoTrava = umGrupoTrava;
    }
    /**
     * @param umGrupoTrava
     */
    public void setGrupoTrava(String umGrupoTrava) {
        grupoTrava = Boolean.parseBoolean(umGrupoTrava);
    }

    /**
     * @return GrupoValorDiaria
     */
    public float getGrupoValorDiaria() {
        return grupoValorDiaria;
    }

    /**
     * @param umGrupoValorDiaria
     */
    public void setGrupoValorDiaria(float umGrupoValorDiaria) {
        grupoValorDiaria = umGrupoValorDiaria;
    }
    /**
     * @param umGrupoValorDiaria
     */
    public void setGrupoValorDiaria(String umGrupoValorDiaria) {
        grupoValorDiaria = Float.parseFloat(umGrupoValorDiaria);
    }


}
