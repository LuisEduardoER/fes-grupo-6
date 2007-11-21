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

public class umModelo{

    /**
     * Propriedade fixa e necessaria para identificar o registro
     */
    private int oid;

    private String modeloNome;

    private String modeloFabricante;

    private int modeloId;

    private int grupoId;


    /**
     * Construtor dessa classe
     */
    public umModelo(){
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
     * @return ModeloNome
     */
    public String getModeloNome() {
        return modeloNome;
    }

    /**
     * @param umModeloNome
     */
    public void setModeloNome(String umModeloNome) {
        modeloNome = umModeloNome;
    }

    /**
     * @return ModeloFabricante
     */
    public String getModeloFabricante() {
        return modeloFabricante;
    }

    /**
     * @param umModeloFabricante
     */
    public void setModeloFabricante(String umModeloFabricante) {
        modeloFabricante = umModeloFabricante;
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

public class umModelo{

    /**
     * Propriedade fixa e necessaria para identificar o registro
       
    private int oid;

    private String modeloNome;

    private String modeloFabricante;


    /**
     * Construtor dessa classe
       
    public umModelo(){
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
     * @return ModeloNome
       
    public String getModeloNome() {
        return modeloNome;
    }

    /**
     * @param umModeloNome
       
    public void setModeloNome(String umModeloNome) {
        modeloNome = umModeloNome;
    }

    /**
     * @return ModeloFabricante
       
    public String getModeloFabricante() {
        return modeloFabricante;
    }

    /**
     * @param umModeloFabricante
       
    public void setModeloFabricante(String umModeloFabricante) {
        modeloFabricante = umModeloFabricante;
    }


}
*/
