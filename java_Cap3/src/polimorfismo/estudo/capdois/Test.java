package polimorfismo.estudo.capdois;

import polimorfismo.partedois.estudo.capdois.SaldoInsuficienteException;

public class Test {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrenteEspecial();
	
		try {
			
			conta.sacar(50.0);
			
		} catch (SaldoInsuficienteException e) {
			
			e.printStackTrace();
			
		}
		
	}

}
