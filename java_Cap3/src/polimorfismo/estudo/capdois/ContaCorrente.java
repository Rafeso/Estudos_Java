package polimorfismo.estudo.capdois;

import polimorfismo.partedois.estudo.capdois.SaldoInsuficienteException;

public class ContaCorrente {

	protected double saldo;
	
	public void sacar(double valor) throws SaldoInsuficienteException {
		if (valor > saldo) {
			throw new SaldoInsuficienteException();
		}
		saldo -= valor;
	}
}
