
package br.com.lavajato;

public class Funcionario {
    int id;
    String nome;
    String cpf;
    String email;
    
    
  public Funcionario(int id,String nome,String cpf,String email){
      this.id=id;
      this.nome=nome;
      this.cpf=cpf;
      this.email=email;
  }
  public void imprimeFuncionario(){
      System.out.println("Funcionario: Nome:"+nome+"ID :"+id+"CPF :"+cpf+ "E-mail :"+email);
  }
}
