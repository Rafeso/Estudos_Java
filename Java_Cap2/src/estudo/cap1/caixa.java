package estudo.cap1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
//		valores[0] = 10;
//		valores[1] = 20;
//		valores[2] = 30;
//		valores[3] = 40;
//		valores[4] = 50;
//		
//		System.out.println(valores[1]);
//		
//		
//		// Outras formas de declarar Arrays.
//		
//		float valores1[] = { 10, 20, 30, 40, 50 };
//		float valores2[] = new float[] { 10, 20 ,30, 40, 50 };
//		
//		System.out.println(valores1[4]);
//		System.out.println(valores2[4]);
//		
		
		// Exemplo de Array com objetos.
		// 
		
//		Produto[] produtos = new Produto [2];
//		
//		Produto prod1 = new Produto();
//		prod1.setNome("Limão");
//		prod1.setDescricao("Galego");
//		prod1.setValor(4);
//		
//		Produto prod2 = new Produto();
//		prod1.setNome("Maça");
//		prod1.setDescricao("Gala");
//		prod1.setValor(10);
//		
//		// Atribuição do endereço de memória.
//	
//		produtos[1] = prod1;				
//		produtos[1] = prod2;
		
		// Strings
		
		// Três formas de se utilizar String.
//		
//		// Declarando variável
//		String nome;
//		// Instanciando variável
//		nome = new String();
//		nome = "Maça";
//		System.out.println(nome);
//		
//		// Declarando e instanciado na mesma linha.
//		String nome2 = new String("Maça");
//		System.out.println(nome2);
//		
//		// Apenas a declaração e atribuição.
//		// Obs: Esta forma utiliza cache de memória na plataforma Java, pois a variável não foi instanciada.
//		String nome3 = "Maça";
//		System.out.println(nome3);
		
		// Quebras de linhas, tabulações e caractéres especiais (Escape).
		
//		// Quebra de linha.
//		String descricao = "Tipo Gala \nA maça mais doce do mercado";
//		System.out.println(descricao);
//		
//		// Cria espaçamento de tabulação.
//		descricao = "Tipo Gala \tA maça mais doce do mercado";
//		System.out.println(descricao);
//		
//		// Condição de imprimir aspas duplas.
//		descricao = "Tipo Gala: \"A maça mais doce do mercado\"";
//		System.out.println(descricao);
		
		// Concatenando Strings.
		
//		String nome = new String("Maça");
//		String descricao = new String();
//		descricao = "Tipo Gala, a maça mais doce do mercado";
//		
//		String propaganda = nome + " " + descricao;
//		System.out.println(propaganda);
//		
//		propaganda = nome.concat(" ").concat(descricao);
//		System.out.println(propaganda);
//		
//		propaganda += "!";
//		System.out.println(propaganda);
		
		// Métodos de String.
		
//		String nome = new String("maça");
//		String nome2 = new String("Maça");
//		String nome3 = new String("maça");
//		
//		// Compara se os valores são iguais, se não retorna false.
//		System.out.println(nome.equals(nome2)); // false
//		// Compara os valores, porém ignora a diferença de letras maiusculas e minusculas.
//		System.out.println(nome.equalsIgnoreCase(nome2)); // true
//		
//		System.out.println(nome.equals(nome3)); // true
//		
//		// Retorna false, pois não compara o conteudo mas sim a posição da String na memória.
//		boolean teste = (nome == nome3);
//		System.out.println(teste); //false
//		
//		String nome4 = "maça";
//		String nome5 = "maça";
//		// Pelo fato de não terem sido instanciadas ira retornar true, pois ambas se encontram no cache de memória, ou seja, no mesmo endereço.
//		teste = (nome4 == nome5);
//		System.out.println(teste); //true
		
		
		// Obtendo o tamanho da string e descobrindo quais conjuntos iniciam e terminam uma String.
		
//		String descricao = new String("Maça Gala, a maça mais doce do mercado!");
		
//		//Retornará o tamanho da String.
//		System.out.println(descricao.length());
//		// Descobrir se a String começa com a palavra Maça.
//		System.out.println(descricao.startsWith("Maça")); // true
//		//Descobrir se a String finaliza com uma exclamação.
//		System.out.println(descricao.endsWith("!")); // true
//		
//		// Localizando ou obtendo um caracter ou uma palavra dentro de uma cadeia de caracteres de uma string.
//		
//		System.out.println(descricao.charAt(1));
//		
//		// Retornará o indice da posição do caracter "G".
//		System.out.println(descricao.indexOf("G"));
//		System.out.println(descricao.indexOf("Gala"));
//		
//		
//		System.out.println(descricao.indexOf("a"));
//		// Indice da posição da ultima ocorrencia do caracter "a" dentro da String descrição.
//		System.out.println(descricao.lastIndexOf("a"));
//		
//		// Substituindo caracteres.
//		System.out.println(descricao.replace("G", "g"));
//		System.out.println(descricao.replace("Gala", "Fuji"));
//		System.out.println(descricao.replace("a", "A"));
//		
//		// Metodo split quebra a String com o delimitador espaço, e o atributo length retornará quantas Strings foram resultantes dessa quebra.
//		System.out.println(descricao.split(" ").length);
//		// Impressão do resultado dessa quebra com Arrays.toString . 
//		System.out.println(Arrays.toString(descricao.split(" ")));
		
		// Transformando caracteres em maiusculo ou minusculo e pegando trechos da String.
		
//		System.out.println(descricao.toLowerCase());
//		System.out.println(descricao.toUpperCase());
//		
//		// Fará uma busca e pegará um trecho de caracteres da String descrição, começando do indice 0 até o indice 4.
//		System.out.println(descricao.substring(0,4)); // Maça
//		// Pegará do indice 4 em diante.
//		System.out.println(descricao.substring(4)); // Gala, a maça mais doce do mercado!
//		
//		// Substring pegará o trecho e o indexOf dará o indice de onde começa a palavra "Maça" e o segundo indexOf irá informar o substring onde para o corte dessa substring
//		// quando encontrar o caracter espaço.
//		System.out.println(descricao.substring(
//				descricao.indexOf("Maça"),
//				descricao.indexOf(" "))); // Maça
//		
//		System.out.println(descricao);
		
		
		// Collections
		
		// Quando não definimos o Arraylist com o uso de Generics, o código não compila. Para isso é necessesário o uso de um cast.
		
//		ArrayList carrinho = new ArrayList();
//		Double valor = 150.55;
//		int valor2 = 1;
//		int valor3;
//		
//		carrinho.add(valor);
//		carrinho.add("Uva");
//		carrinho.add(valor2);
//		
//		System.out.println(carrinho.get(1));
//		
//		valor3 = (int) carrinho.get(3); // cast (int)
//		
//		System.out.println(valor3);
		
		// Boa prática, declarando Arraylist como Arraylist de String.
		// Generics não permite tipos primitivos.
		
//		List<String> carrinho = new ArrayList<String>();
//		
//		System.out.println(carrinho.isEmpty());
//		
//		carrinho.add("Pera");
//		carrinho.add("Uva");
//		carrinho.set(1, "Melancia");
//		
//		// isEmpty retorna true or false se o Arraylist está vazio ou não.
//		System.out.println(carrinho.isEmpty());
//		// Retorna o tamanho do Arraylist
//		System.out.println(carrinho.size());
		
		// Demais métodos da Arraylist
		
//		carrinho.add("Maça");
//		carrinho.add("Uva");
//		carrinho.add("Melancia");
//		carrinho.add("Goiaba");
//		carrinho.add("Maça");
//		
//		// Contains retorna se a palavra maça está contida em algum dos itens do Arraylist.
//		System.out.println(carrinho.contains("Maça"));
//		// Retorna a posição da palavra maça no arraylist
//		System.out.println(carrinho.indexOf("Maça"));
//		// Busca a palavra maça a partir da posição retornada pelo indexOf.
//		System.out.println(carrinho.get(carrinho.indexOf("Maça")));
//		// Retorna qual a ultima occorencia da palavra maça.
//		System.out.println(carrinho.lastIndexOf("Maça"));
//		
//		carrinho.remove(carrinho.indexOf("Maça"));
//		System.out.println(carrinho.get(0));
//		
//		carrinho.clear();
//		System.out.println(carrinho.isEmpty());
		
		//HashSet
		
//		Set<String> cesta = new HashSet<String>();
//		
//		System.out.println(cesta.isEmpty());
//		cesta.add("Maça");
//		cesta.add("Uva");
//		cesta.add("Maça");
//		cesta.add("Melancia");
//		System.out.println(cesta.isEmpty());
//		
//		System.out.println(cesta.size()); // O size é de 3 elementos, pois a classe HashSet não permite elementos duplicados diferente da classe List.
//		System.out.println(cesta);
		
		// Interface Map
		
		// Declarada a variável caixa da interface Map, implementada pela classe HashMap com o par chave, valor "String, String".
		Map<String, String> caixa = new HashMap<String, String>();
		// Adicionando caixas.
		caixa.put("M225", "Fernando");
		caixa.put("M230", "Patricia");
		caixa.put("M250", "Eduarda");
		
		// Verificando se o HashMap está vazio.
		System.out.println(caixa.isEmpty());
		// Imprimindo o tamanho do HashMap.
		System.out.println(caixa.size());
		// Verificando se dentro do HasMap caixa contém a chave "M250".
		System.out.println(caixa.containsKey("M250"));
		// Verificando se dentro do HashMap caixa contém o valor "Fernando".
		System.out.println(caixa.containsValue("Fernando"));
		// Imprimindo todos os itens do HashMap.
		System.out.println(caixa);
	}

}
