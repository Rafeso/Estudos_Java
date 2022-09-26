package polimorfismo.estudo.capdois;

import polimorfismo.partedois.estudo.capdois.SaldoInsuficienteException;

public class ContaCorrenteEspecial extends ContaCorrente {
	
	private double limite;
	
	@Override
	public void sacar(double valor) throws SaldoInsuficienteException {
		if (valor > saldo + limite) {
			throw new SaldoInsuficienteException();
			
		}
		saldo -= valor;
	}
	
}
