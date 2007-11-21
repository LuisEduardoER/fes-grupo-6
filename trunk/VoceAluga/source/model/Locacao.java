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

public class Locacao extends DomainDB {

    /**
     * Construtor dessa classe
     */
    public Locacao(){
    }
    
    public boolean criaLocacao(String cpfCliente, int idCarro, String dataRetirada, String dataDevolucao, double valorLocacao, int idFilialRetirada, int idFilialDevolucao){
    	Cliente clienteDao = new Cliente();
		umCliente uC = clienteDao.find( cpfCliente );
		
		Carro carroDao = new Carro();
		umCarro uCar = carroDao.find(idCarro);
				
		if( uC == null )
			return false;
				
		umLocacao uL = new umLocacao();
		uL.setClienteId(uC.getClienteId());
		uL.setLocacaoDataRetirada(dataRetirada);
		uL.setLocacaoDataDevolucao(dataDevolucao);
		uL.setLocacaoValor(""+valorLocacao);
		uL.setModeloId(uCar.getModeloId());
		uL.setCarroId(uCar.getCarroId());
		uL.setLocacaoId(this.getOid(uL));
		
		return this.insert(uL, this.getOid(uL));
	
	}



}