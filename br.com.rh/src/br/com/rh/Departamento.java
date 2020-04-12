
package br.com.rh;


public class Departamento{
    
    private String departamento;
    private int ramal;
    private String email;
    private String diretor;
    public Departamento(){}
    public Departamento(String departamento,String email,int ramal,String diretor){
          
      this.departamento=departamento;
      this.ramal=ramal;
      this.email=email;
      this.diretor=diretor;
       }
    public String getDepartamento(){
        return this.departamento;
    }
    public void exibeDepartamento(){
        System.out.println("-----DEPARTAMENTO-----");
        System.out.println("NOME DEPARTAMENTO : "+this.departamento);
        System.out.println("RAMAL : "+this.ramal);
        System.out.println("EMAIL : "+this.email);
        System.out.println("DIRETOR : "+this.diretor);
        System.out.println("/////////////////");
    }
    
    }

    

