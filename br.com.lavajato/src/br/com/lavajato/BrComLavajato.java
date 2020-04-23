
package br.com.lavajato;

public class BrComLavajato {

  
    public static void main(String[] args) {
          // public Veiculo(String placa,String modelo,int anoFabricacao,String cor){
       Veiculo v1= new Veiculo("HOV-3322","Camaro",2015,"Amarelo");
       Veiculo v2= new Veiculo("UTV-4455","Focus",2010,"Prata");
       Veiculo v3= new Veiculo("HWB-6677","Gol",1998,"Preto");
       
       //  public Endereco(String logradouro,int numero,String complemento,String bairro,String cidade,String estado,String cep){
       Endereco e1=new Endereco("Rua jequitibas",166,"Casa","Morada nova","Belo horizonte","Minas Gerais","37908-099");
       Endereco e2=new Endereco("Rua 10",9292,"Apartamento","Industrial","Contagem","Minas Gearais","39393-088");
       Endereco e3=new Endereco("Rua jovelino ferreira",6666,"Casa","Granja verde","Betim","Minas Gearis","383838-00");
       // public Cliente(String nome,String telefone,String cpf, Endereco endereco)
       Cliente c1 = new Cliente("Fulano", "9999999999", "999999999", e1);
       Cliente c2= new Cliente("Odesio","(310-99932-9999","158.999.388-99",e2);
       Cliente c3= new Cliente("Roberto","(31)-98888-99999","159.333.434-59",e3);
       c1.addVeiculos(v1);
       c2.addVeiculos(v2);
       c3.addVeiculos(v3);
    // public Servicos(String nome,double valor,int tempo){
       Servicos s1= new Servicos("Lavagem completa",50,40);
       Servicos s2=new Servicos("Ducha rapida",10,5);
       Servicos s3=new Servicos("Encerar carro",80,30);
      
       // public Funcionario(int id,String nome,String cpf,String email){
       Funcionario f1= new Funcionario(1,"João","135.477.999-28","joao@mail.com");
       Funcionario f2= new Funcionario(2,"Adolfo","139.333.444-19","Adolgo@mail,com");
       Funcionario f3= new Funcionario(3,"Matheus","138.478.555-66","Matheus@mail.com");
       
       Agendamento agendamento = new Agendamento("01-01-2001", "10:00", f1,c1,v1);
       agendamento.addServicos(s1);
       agendamento.addServicos(s2);
       agendamento.addServicos(s3);
       
       
       agendamento.imprimirAgendamento();
       
    }
    
}
