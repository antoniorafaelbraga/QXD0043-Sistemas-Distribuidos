package util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import pojos.Pessoa;

public class Exportacao {

	public static void main(String[] args) throws IOException {
		// desserialização: recuperando os objetos gravados no arquivo binário "dados.dat"
		ArrayList<Object> pessoa = Desempacotamento.lerArquivoBinario("dados.dat");

		FileWriter arq = new FileWriter("export.txt");
		PrintWriter gravarArq = new PrintWriter(arq);

		int i = 1;
		int n = pessoa.size();

		for (Object item : pessoa) {
			System.out.printf("Exportando %do. registro de %d: %s\n", i++, n, ((Pessoa) item).getNome());

			gravarArq.printf("Nome|%s;Peso Corporal|%.2f;Altura|%.2f;IMC|%.2f;Interpretação|%s%n",
					((Pessoa) item).getNome(), ((Pessoa) item).getPC(), ((Pessoa) item).getAlt(), ((Pessoa) item).IMC(),
					((Pessoa) item).interpretaIMC());
		}

		gravarArq.close();

		System.out.printf("\nExportação realizada com sucesso.\n");
	}

}