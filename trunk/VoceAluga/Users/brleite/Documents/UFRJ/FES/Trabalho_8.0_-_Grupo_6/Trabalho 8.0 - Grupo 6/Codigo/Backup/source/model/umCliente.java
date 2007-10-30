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

public class umCliente{

    /**
     * Propriedade fixa e necessaria para identificar o registro
     */
    private int oid;

    private int clienteId;

    private String clienteNome;

    private String clienteTelefone;

    private String clienteEndereco;

    private String clienteCpf;

    private String clienteDataNasc;

    private String clienteEstCivil;


    /**
     * Construtor dessa classe
     */
    public umCliente(){
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
     * @return ClienteNome
     */
    public String getClienteNome() {
        return clienteNome;
    }

    /**
     * @param umClienteNome
     */
    public void setClienteNome(String umClienteNome) {
        clienteNome = umClienteNome;
    }

    /**
     * @return ClienteTelefone
     */
    public String getClienteTelefone() {
        return clienteTelefone;
    }

    /**
     * @param umClienteTelefone
     */
    public void setClienteTelefone(String umClienteTelefone) {
        clienteTelefone = umClienteTelefone;
    }

    /**
     * @return ClienteEndereco
     */
    public String getClienteEndereco() {
        return clienteEndereco;
    }

    /**
     * @param umClienteEndereco
     */
    public void setClienteEndereco(String umClienteEndereco) {
        clienteEndereco = umClienteEndereco;
    }

    /**
     * @return ClienteCpf
     */
    public String getClienteCpf() {
        return clienteCpf;
    }

    /**
     * @param umClienteCpf
     */
    public void setClienteCpf(String umClienteCpf) {
        clienteCpf = umClienteCpf;
    }

    /**
     * @return ClienteDataNasc
     */
    public String getClienteDataNasc() {
        return clienteDataNasc;
    }

    /**
     * @param umClienteDataNasc
     */
    public void setClienteDataNasc(String umClienteDataNasc) {
        clienteDataNasc = umClienteDataNasc;
    }

    /**
     * @return ClienteEstCivil
     */
    public String getClienteEstCivil() {
        return clienteEstCivil;
    }

    /**
     * @param umClienteEstCivil
     */
    public void setClienteEstCivil(String umClienteEstCivil) {
        clienteEstCivil = umClienteEstCivil;
    }


}
