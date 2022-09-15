//https://www.devmedia.com.br/introducao-a-serializacao-de-objetos/3050
package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import pojos.Cliente;

public class ExemploStream {
	public static void main(String[] args) {
		// Cria o objeto serializado
		Cliente cliente = new Cliente("Antonio Rafael Braga", 'M', "123.456.789-01");
		Cliente cliente2 = new Cliente("Rafael Braga", 'M', "123.456.789-02");
		try {
			// Gera o arquivo para armazenar o objeto
			FileOutputStream arquivoGrav = new FileOutputStream("saida.dat");
			// Classe responsavel por inserir os objetos
			ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
			// Grava o objeto cliente no arquivo
			objGravar.writeObject(cliente);
			objGravar.writeObject(cliente2);
			// Fecha streams ObjectOutputStream
			objGravar.flush();
			objGravar.close();
			// Fecha streams FileOutputStream	
			arquivoGrav.flush();
			arquivoGrav.close();
			System.out.println("Objeto gravado com sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Recuperando objeto: ");
		try {
			// Carrega o arquivo
			FileInputStream arquivoLeitura = new FileInputStream("saida.dat"); 
			// Recupera os objetos do arquivo
			ObjectInputStream objLeitura = new ObjectInputStream(arquivoLeitura);
			// Imprime os objetos
			System.out.println(objLeitura.readObject());
			objLeitura.close();
			arquivoLeitura.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}