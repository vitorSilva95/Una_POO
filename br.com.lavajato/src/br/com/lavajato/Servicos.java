
package br.com.lavajato;

public class Servicos {
    
    String nome;
    double valor;
    int tempo;
    
    
   public Servicos(String nome,double valor,int tempo){
       this.nome=nome;
       this.valor=valor;
       this.tempo=tempo;
   }
   
   public void imprimeServicos(){
       System.out.println("Servico: "+nome+ "Valor: "+valor+"Tempo gasto :"+tempo);
   }
}
