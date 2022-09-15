package serialization;

import com.thoughtworks.xstream.XStream;

import pojos.Pessoa;

public class Teste {

   public static void main(String args[]) {
         // criando um Aluno
         Pessoa pessoa = new Pessoa("Antonio Rafael Braga", 70, 180);
         // exibindo o resultado da serializa��o com XStream
         XStream xstream= new XStream();
         String representacao = xstream.toXML(pessoa);
         System.out.println(representacao);
         
         XStream xstream2 = new XStream();
         Pessoa pessoa2 = (Pessoa) xstream2.fromXML(representacao);
         System.out.println(pessoa2.getNome());
     }
}