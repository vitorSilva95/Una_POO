
package br.com.lavajato;

public class Endereco {
    
    String logradouro;
    int numero;
    String complemento;
    String bairro;
    String cidade;
    String estado;
    String cep;
    
    public Endereco(String logradouro,int numero,String complemento,String bairro,String cidade,String estado,String cep){
        this.bairro=bairro;
        this.cep=cep;
        this.cidade=cidade;
        this.complemento=complemento;
        this.estado=estado;
        this.logradouro=logradouro;
        this.numero=numero;
    }
    
    public void imprimeEndereco(){
        System.out.println("Endereço :Estado "+estado+"Cidade :"+cidade+"Bairro :"+bairro+"Logradouro :"+logradouro+"Numero :"+numero+"Complento :"+complemento+"CEP :"+cep);
    }
    
}
