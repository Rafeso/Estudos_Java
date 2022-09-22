package estudo.cap1;

import entity.cap1.Produto;

public class caixa {

	
	public static void main(String[] args) {

		
//		  int qtdProdutos = 5; 
//		  int registro = 0;
		 

		// estrutura de repetição while.

//		
//		  while (registro < qtdProdutos) { 
//
//			  registro++;
//
//			  System.out.println("O produto número" + registro + "foi registrado"); 
//		  }
//
//
//		  // Estrutura de repetição do while.
//
//
//		  do {
//
//			  registro++;
//			  System.out.println("O caixa registou o produto " + registro);
//
//		  } while(registro < qtdProdutos);
//
//
//		  // Estrutura de repetição for, usada para quando se sabe quantas vezes um laço será executado.
//
//
//
//		  for (int i = 1; i <= qtdProdutos; i++) {
//
//			  System.out.println("O caixa registrou o produto " + i); 
//
//		  }

		
		
		// Arrays
		
		// Primeira forma de se declarar Arrays.
		
//		float valores[] = new float[5];
//		
//		valores [0] = 10;
//		valores [1] = 20;
//		valores [2] = 30;
//		valores [3] = 40;
//		valores [4] = 50;
//		
//		System.out.println(valores[1]);
//		
		
		// Outras formas de declarar Arrays.
		
//		float valores[] = { 10, 20, 30, 40, 50 };
//		float valores2[] = new float[] { 10, 20 ,30, 40, 50 };
//		
//		System.out.println(valores[4]);
//		System.out.println(valores2[4]);
		
		
		// Exemplo de Array com objetos.
		// 
		
		Produto[] produtos = new Produto [2];
		
		Produto prod1 = new Produto();
		prod1.setNome("Limão");
		prod1.setDescricao("Galego");
		prod1.setValor(4);
		
		Produto prod2 = new Produto();
		prod1.setNome("Maça");
		prod1.setDescricao("Gala");
		prod1.setValor(10);
		
		// Atribuição do endereço de memória.
		
		produtos[1] = prod1;					
		produtos[1] = prod2;					

	}

}
