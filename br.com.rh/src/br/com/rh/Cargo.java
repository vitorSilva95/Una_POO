
package br.com.rh;

   /* O usuário deve ser capaz de cadastrar os cargos que os
funcionários podem ocupar. Cada cargo deve ter seu nome e sua titulação
mínima cadastrada. */

public class Cargo {
    
    private String nomeCargo;
    private String titulacaoMinima;
    
    public Cargo(String nomeCargo,String titulacaoMinima){
        this.nomeCargo=nomeCargo;
        this.titulacaoMinima=titulacaoMinima;
    }
    
    public String getNomeCargo(){ 
        return this.nomeCargo;
    }
    
    public void exibeCargo(){
        System.out.println("-------CARGO--------");
        System.out.println("NOME DO CARGO :"+this.nomeCargo);
        System.out.println("TITULACAO MINIMA :"+this.titulacaoMinima);
        System.out.println("////////////////////////");
    }
    
    
}
