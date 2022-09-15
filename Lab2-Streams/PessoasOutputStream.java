package sockets.Streams;

import java.io.IOException;
import java.io.OutputStream;

import sockets.Pojos.Pessoa;

public class PessoasOutputStream extends OutputStream {
	
	private OutputStream op;
	private Pessoa[] pessoas;
	
	public PessoasOutputStream() {
		
	}
	
	public PessoasOutputStream(Pessoa[] p, OutputStream os) {
		this.pessoas = p;
		this.op = os;
	}

	public void enviar2System() {
		
		int qtdpessoa = pessoas.length;
		//envia quantidade de pessoas para o servidor;
		
		for (Pessoa pessoa : pessoas) {
			int tamanhoNomePessoa = pessoa.getNome().getBytes().length;
			String nome = pessoa.getNome();
			double cpf = pessoa.getCpf();
			int idade = pessoa.getIdade();
			
			PessoasOutputStream pos = new PessoasOutputStream();
			// envia os dados de um conjunto (array) de Pessoas
			System.out.println("tamanhoNomePessoa: "+tamanhoNomePessoa +"nome: "+ nome+" cpf: "+cpf);
		}
	}

	public void writeFile() {
		// envia os dados de um conjunto (array) de Pessoas
	}
	
	public void writeTCP() {
		// envia os dados de um conjunto (array) de Pessoas
	}		
	
	@Override
	public void write(int b) throws IOException {
		// TODO Auto-generated method stub
	}

	@Override
	public String toString() {
		return "Olá, qualquer coisa, PessoasOutputStream [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}

