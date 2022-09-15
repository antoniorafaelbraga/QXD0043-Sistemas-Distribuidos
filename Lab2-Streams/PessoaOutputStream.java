package sockets.Streams;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import sockets.Pojos.Pessoa;

public class PessoaOutputStream {
	public static void main(String[] args) {

		Pessoa[] pessoas = new Pessoa[10];
		
		Pessoa pessoa1 = new Pessoa("eu1", 1234567, 180);
		Pessoa pessoa2 = new Pessoa("eu2", 7859352, 150);
		Pessoa pessoa3 = new Pessoa("eu3", 5487455, 190);
		Pessoa pessoa4 = new Pessoa("eu4", 5487864, 170);
		
		pessoas[0] = pessoa1;
		pessoas[1] = pessoa2;
		pessoas[2] = pessoa3;
		pessoas[3] = pessoa4;
		
		DataOutputStream dip = new DataOutputStream(new OutputStream() {
			
			@Override
			public void write(int b) throws IOException {
				// TODO Auto-generated method stub
				
			}
		});
		
		PessoasOutputStream pos = new PessoasOutputStream(pessoas, dip);
		System.out.println(pos);
		pos.enviar2System();
	}
}
