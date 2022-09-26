package writeread.estudo.capdois;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TesteArquivo {

	public static void main(String[] args) {

		String nomeDoArquivo = "Estoque.csv";
		String diretorio = System.getProperty("user.home");
		String caminho = diretorio + "\\" + nomeDoArquivo;

		List<String> conteudo = new ArrayList<>();
		conteudo.add("Produto; Quantidade; Unidade de Medida; Valor da Unidade;");
		conteudo.add("Pera; 200; pct; R$ 5,40;");
		conteudo.add("Morango; 200; cx; R$ 10,40;");
		conteudo.add("Abacaxi; 200; un; R$ 30,40;");

		// gravarEstoque(nomeDoArquivo, caminho, conteudo);

		lerEstoque(caminho);

		File arquivo = new File(caminho);

		if (arquivo.exists()) {
			System.out.println("O arquivo existe!" + "\nPode ser lido: " + arquivo.canRead() + "\nPode ser gravado: "
					+ arquivo.canWrite() + "\nTamnho: " + arquivo.length() + "\nCaminho: " + arquivo.getPath());
		} else {
			// Cria o arquivo
			try {
				if (arquivo.createNewFile())
					System.out.println("Arquivo criado!");
				else
					System.out.println("Arquivo não criado!");

			} catch (IOException e) {

				e.printStackTrace();

			}
		}
		
		File fDiretorio = new File(diretorio);
		
		if (fDiretorio.exists()) {
			System.out.println("Diretório Existe!");
		}else {
			if (fDiretorio.mkdir())
				System.out.println("Diretório foi criado!");
			else
				System.out.println("Diretório não criado.");
		}
	}

	private static void gravarEstoque(String nomeDoArquivo, String caminho, List<String> conteudo) {

		FileWriter stream;
		PrintWriter print;

		try {
			// Stream é uma conexão de escrita para o arquivo
			stream = new FileWriter(caminho);
			// A classe PrintWriter escreverá no arquivo
			print = new PrintWriter(stream);

			for (String linha : conteudo) {
				// O método println escreve uma linha no arquivo
				print.println(linha);
			}
			// Close fecha o arquivo
			print.close();
			stream.close();

			System.out.println(" O arquivo " + nomeDoArquivo + " Foi salvo em " + caminho);

		} catch (IOException e) {

			e.printStackTrace();

		}
	}

	private static void lerEstoque(String caminho) {
		try {
			// Abre o arquivo
			FileReader stream = new FileReader(caminho);

			// BufferedReader possui o método readLine
			// Lê uma linha de arquivo e retorna uma String com o valor lido ou null
			BufferedReader reader = new BufferedReader(stream);

			// Lê uma linha do arquivo
			String linha = reader.readLine();

			// Enquato linha for diferente de null
			while (linha != null) {

				System.out.println(linha);
				// Lê a próxima linha do arquivo
				linha = reader.readLine();

			}
			reader.close();
			// Fecha o arquivo
			stream.close();

		} catch (IOException e) {

			e.printStackTrace();

		}
	}

}
