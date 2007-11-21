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

public class umFuncionario{

    /**
     * Propriedade fixa e necessaria para identificar o registro
     */
    private int oid;

    private int funcionarioId;

    private String funcionarioNome;

    private String funcionarioTelefone;

    private String funcionarioEndereco;

    private String funcionarioCpf;

    private String funcionarioDataNasc;

    private String funcionarioEstCivil;

    private String funcionarioLogin;

    private String funcionarioSenha;

    private String funcionarioCargo;

    private int filialId;


    /**
     * Construtor dessa classe
     */
    public umFuncionario(){
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
     * @return FuncionarioId
     */
    public int getFuncionarioId() {
        return funcionarioId;
    }

    /**
     * @param umFuncionarioId
     */
    public void setFuncionarioId(int umFuncionarioId) {
        funcionarioId = umFuncionarioId;
    }
    /**
     * @param umFuncionarioId
     */
    public void setFuncionarioId(String umFuncionarioId) {
        funcionarioId = Integer.parseInt(umFuncionarioId);
    }

    /**
     * @return FuncionarioNome
     */
    public String getFuncionarioNome() {
        return funcionarioNome;
    }

    /**
     * @param umFuncionarioNome
     */
    public void setFuncionarioNome(String umFuncionarioNome) {
        funcionarioNome = umFuncionarioNome;
    }

    /**
     * @return FuncionarioTelefone
     */
    public String getFuncionarioTelefone() {
        return funcionarioTelefone;
    }

    /**
     * @param umFuncionarioTelefone
     */
    public void setFuncionarioTelefone(String umFuncionarioTelefone) {
        funcionarioTelefone = umFuncionarioTelefone;
    }

    /**
     * @return FuncionarioEndereco
     */
    public String getFuncionarioEndereco() {
        return funcionarioEndereco;
    }

    /**
     * @param umFuncionarioEndereco
     */
    public void setFuncionarioEndereco(String umFuncionarioEndereco) {
        funcionarioEndereco = umFuncionarioEndereco;
    }

    /**
     * @return FuncionarioCpf
     */
    public String getFuncionarioCpf() {
        return funcionarioCpf;
    }

    /**
     * @param umFuncionarioCpf
     */
    public void setFuncionarioCpf(String umFuncionarioCpf) {
        funcionarioCpf = umFuncionarioCpf;
    }

    /**
     * @return FuncionarioDataNasc
     */
    public String getFuncionarioDataNasc() {
        return funcionarioDataNasc;
    }

    /**
     * @param umFuncionarioDataNasc
     */
    public void setFuncionarioDataNasc(String umFuncionarioDataNasc) {
        funcionarioDataNasc = umFuncionarioDataNasc;
    }

    /**
     * @return FuncionarioEstCivil
     */
    public String getFuncionarioEstCivil() {
        return funcionarioEstCivil;
    }

    /**
     * @param umFuncionarioEstCivil
     */
    public void setFuncionarioEstCivil(String umFuncionarioEstCivil) {
        funcionarioEstCivil = umFuncionarioEstCivil;
    }

    /**
     * @return FuncionarioLogin
     */
    public String getFuncionarioLogin() {
        return funcionarioLogin;
    }

    /**
     * @param umFuncionarioLogin
     */
    public void setFuncionarioLogin(String umFuncionarioLogin) {
        funcionarioLogin = umFuncionarioLogin;
    }

    /**
     * @return FuncionarioSenha
     */
    public String getFuncionarioSenha() {
        return funcionarioSenha;
    }

    /**
     * @param umFuncionarioSenha
     */
    public void setFuncionarioSenha(String umFuncionarioSenha) {
        funcionarioSenha = umFuncionarioSenha;
    }

    /**
     * @return FuncionarioCargo
     */
    public String getFuncionarioCargo() {
        return funcionarioCargo;
    }

    /**
     * @param umFuncionarioCargo
     */
    public void setFuncionarioCargo(String umFuncionarioCargo) {
        funcionarioCargo = umFuncionarioCargo;
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

public class umFuncionario{

    /**
     * Propriedade fixa e necessaria para identificar o registro
       
    private int oid;

    private int funcionarioId;

    private String funcionarioNome;

    private String funcionarioTelefone;

    private String funcionarioEndereco;

    private String funcionarioCpf;

    private String funcionarioDataNasc;

    private String funcionarioEstCivil;

    private String funcionarioLogin;

    private String funcionarioSenha;

    private String funcionarioCargo;


    /**
     * Construtor dessa classe
       
    public umFuncionario(){
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
     * @return FuncionarioId
       
    public int getFuncionarioId() {
        return funcionarioId;
    }

    /**
     * @param umFuncionarioId
       
    public void setFuncionarioId(int umFuncionarioId) {
        funcionarioId = umFuncionarioId;
    }
    /**
     * @param umFuncionarioId
       
    public void setFuncionarioId(String umFuncionarioId) {
        funcionarioId = Integer.parseInt(umFuncionarioId);
    }

    /**
     * @return FuncionarioNome
       
    public String getFuncionarioNome() {
        return funcionarioNome;
    }

    /**
     * @param umFuncionarioNome
       
    public void setFuncionarioNome(String umFuncionarioNome) {
        funcionarioNome = umFuncionarioNome;
    }

    /**
     * @return FuncionarioTelefone
       
    public String getFuncionarioTelefone() {
        return funcionarioTelefone;
    }

    /**
     * @param umFuncionarioTelefone
       
    public void setFuncionarioTelefone(String umFuncionarioTelefone) {
        funcionarioTelefone = umFuncionarioTelefone;
    }

    /**
     * @return FuncionarioEndereco
       
    public String getFuncionarioEndereco() {
        return funcionarioEndereco;
    }

    /**
     * @param umFuncionarioEndereco
       
    public void setFuncionarioEndereco(String umFuncionarioEndereco) {
        funcionarioEndereco = umFuncionarioEndereco;
    }

    /**
     * @return FuncionarioCpf
       
    public String getFuncionarioCpf() {
        return funcionarioCpf;
    }

    /**
     * @param umFuncionarioCpf
       
    public void setFuncionarioCpf(String umFuncionarioCpf) {
        funcionarioCpf = umFuncionarioCpf;
    }

    /**
     * @return FuncionarioDataNasc
       
    public String getFuncionarioDataNasc() {
        return funcionarioDataNasc;
    }

    /**
     * @param umFuncionarioDataNasc
       
    public void setFuncionarioDataNasc(String umFuncionarioDataNasc) {
        funcionarioDataNasc = umFuncionarioDataNasc;
    }

    /**
     * @return FuncionarioEstCivil
       
    public String getFuncionarioEstCivil() {
        return funcionarioEstCivil;
    }

    /**
     * @param umFuncionarioEstCivil
       
    public void setFuncionarioEstCivil(String umFuncionarioEstCivil) {
        funcionarioEstCivil = umFuncionarioEstCivil;
    }

    /**
     * @return FuncionarioLogin
       
    public String getFuncionarioLogin() {
        return funcionarioLogin;
    }

    /**
     * @param umFuncionarioLogin
       
    public void setFuncionarioLogin(String umFuncionarioLogin) {
        funcionarioLogin = umFuncionarioLogin;
    }

    /**
     * @return FuncionarioSenha
       
    public String getFuncionarioSenha() {
        return funcionarioSenha;
    }

    /**
     * @param umFuncionarioSenha
       
    public void setFuncionarioSenha(String umFuncionarioSenha) {
        funcionarioSenha = umFuncionarioSenha;
    }

    /**
     * @return FuncionarioCargo
       
    public String getFuncionarioCargo() {
        return funcionarioCargo;
    }

    /**
     * @param umFuncionarioCargo
       
    public void setFuncionarioCargo(String umFuncionarioCargo) {
        funcionarioCargo = umFuncionarioCargo;
    }


}
*/
