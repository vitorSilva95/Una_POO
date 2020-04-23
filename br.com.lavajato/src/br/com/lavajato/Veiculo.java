
package br.com.lavajato;

public class Veiculo {
    
   String placa;
   String modelo;
   int anoFabricacao;
   String cor;
   
   public Veiculo(String placa,String modelo,int anoFabricacao,String cor){
       this.anoFabricacao=anoFabricacao;
       this.cor=cor;
       this.modelo=modelo;
       this.placa=placa;
   }
   public void imprimeVeiculo(){
       System.out.println("Modelo :"+modelo+"  Ano de Fabricação :"+anoFabricacao+"  Cor :"+cor+"  Placa :"+placa);
   }
}
