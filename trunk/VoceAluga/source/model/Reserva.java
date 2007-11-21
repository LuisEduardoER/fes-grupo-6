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

import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Reserva extends DomainDB {


	public boolean criaReserva(String cpfCliente, umCarro uCar, String dataRetirada, String dataDevolucao, double valorReserva, int idFilialRetirada) {
		
		Cliente clienteDao = new Cliente();
		umCliente uC = clienteDao.find( cpfCliente );
		
		if( uC == null )
			return false;
				
		umReserva uR = new umReserva();
		uR.setClienteId(uC.getClienteId());
		uR.setReservaDataRetirada(dataRetirada);
		uR.setReservaDataDevolucao(dataDevolucao);
		uR.setReservaValor(""+valorReserva);
		uR.setCarroId(uCar.getCarroId());
		uR.setReservaId(this.getOid(uR));
		
		return this.insert(uR, this.getOid(uR));
	
	}
	
	
    /**
     * Construtor dessa classe
     */
    public Reserva(){
    }


}

