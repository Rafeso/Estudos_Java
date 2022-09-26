package excecoes.estudo.capdois;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import divisao.estudo.capdois.DivisaoPorZeroException;

public class Exceptions {

	public static void main(String[] args) throws IOException {
		
		// Exceções Uncheked
//		try {
//
//			int val = 10/0;
//			System.out.println(val);
//
//			int[] valores = new int[3];
//			System.out.println(valores[4]);
//
//			String nome = null;
//			System.out.println(nome.length());
//
//			int numero = Integer.parseInt("zero");
//
//		} catch (ArithmeticException e) {
//
//			System.out.println("Não é possivel realizar uma divisão por Zero!");
//
//			// Mensagem com a lista de erros
//			System.out.println(e.getMessage());
//			// Imprime a pilha de erro da exceção.
//			e.printStackTrace();
//
//		} catch (ArrayIndexOutOfBoundsException e) {
//
//			System.out.println("Não é possivel acessar a posição 4 do array!");
//
//		} catch (NumberFormatException e) {
//
//			System.out.println("Não foi possivel realizar a conversão!");
//
//		} catch (NullPointerException e) {
//
//			System.out.println("Não foi possível acessar o lenth, variável nome não foi instanciada!");
//
//		}finally {
//			System.out.println("Sempre passará por aqui!");
//		}
		
//		FileWriter fw = new FileWriter("C:\\nota.txt");
//		
//		PrintWriter print = new PrintWriter(fw);
//		print.println("Maça = 4,00");
//		print.println("Maça = 4,00");
//		print.println("Maça = 4,00");
//		print.println("Maça = 4,00");
//		print.close();
//		fw.close();
		
		// Criação de exceções
		
		// Exceção do tipo unchecked herdando RuntimeException.
		
//		public static void main(String[] args) throws DivisaoPorZeroException {
//			
//			try {
//				int val = 10 / 0;
//				System.out.println(val);
//
//			} catch (Exception e) {
//
//				throw new DivisaoPorZeroException();
//
//			}
//		}
		
		// Se herdando Exception, necessariamente é preciso lançar o metodo check através da adição de throws na assinatura do método.
		
//		public static void main(String[] args) throws DivisaoPorZeroException {
			
//			try {
//				int val = 10 / 0;
//				System.out.println(val);
//				
//			} catch (Exception e) {
//				
//				throw new DivisaoPorZeroException();
//				
//			}
//		}
	}
}

		

