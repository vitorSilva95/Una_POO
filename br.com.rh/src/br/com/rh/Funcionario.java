
package br.com.rh;

import br.com.rh.Repositorio.CargoRepositorio;
import br.com.rh.Repositorio.DepartamentoRepositorio;


public class Funcionario {
     private String nome;
     private int numeroRegistro;
     private String cpf;
     private String email;
     private String logradouro;
     private String complemento;
     private int numeroEndereco;
     private int quantidadeDependentes;
     private Departamento departamento;
     private Cargo cargo;
     private int faltas;
     private double salarioLiquido;
     private double salarioBruto;
     private double sbr;
     private double impostoDeRenda;
     
     public Funcionario(String nome,String cpf,String logradouro,int numeroEndereco ,String departamento,String cargo,String email,
             int quantidadeDependentes,int faltas,double salarioBruto) throws Exception{
         
         this.nome=nome;
         this.cpf=cpf;
         this.logradouro=logradouro;
         this.numeroEndereco=numeroEndereco;
         this.setDepartamento(departamento);
         this.setCargo(cargo);
         this.email=email;
         this.quantidadeDependentes=quantidadeDependentes;
         this.faltas=faltas;
         this.salarioBruto=salarioBruto;
         
     }
     
     private void setCargo(String cargo) throws Exception{
         if(CargoRepositorio.cargoExists(cargo)){
             this.cargo = CargoRepositorio.getCargo(cargo);
             return;
         }
         
         throw new Exception("Cargo inexistente");
     }
     private void setDepartamento(String departamento) throws Exception{
         if (DepartamentoRepositorio.departamentoExists(departamento)) {
             this.departamento = DepartamentoRepositorio.getDepartamento(departamento);
             return;
             
         }
         throw new Exception("Departamento Inexistente");
     }
    public int getFaltas() {
        return faltas;
    }

    public int validarFaltas() {
        
        
        if (faltas>=0 && faltas<=30) {
            return this.faltas;
        }else
            return 0;
    }
    
    public void calcularSalarioBruto(){
        this.sbr=this.salarioBruto -(this.salarioBruto/30)* validarFaltas();
    }
    public void calcularImpostoDeRenda(){
        if (this.salarioBruto<=1903.98) {
            this.impostoDeRenda=0;
        }else if (this.salarioBruto>=1903.99 && this.salarioBruto<=2826.65) {
            this.impostoDeRenda=0.075;
        }else if (this.salarioBruto>=2826.66 && this.salarioBruto<=3751.05) {
            this.impostoDeRenda=0.15;
        }else if (this.salarioBruto>=3751.06 && this.salarioBruto<=4664.68) {
            this.impostoDeRenda=0.225;
        }else
            this.impostoDeRenda=0.275;
    }
    public void calcularSalarioLiquido(){
        this.calcularImpostoDeRenda();
        this.salarioLiquido=this.sbr-(this.salarioBruto*0.11+this.salarioBruto*this.impostoDeRenda);
        
    }
    public void exibeFuncionario(){
         System.out.println("--------FUNCIONARIO--------");
         System.out.println("NOME : "+this.nome);
         System.out.println("CPF : "+this.cpf);
         System.out.println("ENDEREÇO: "+this.logradouro+" Numero "+this.numeroEndereco);
         System.out.println("DEPARTAMENTO :"+this.departamento);
         System.out.println("CARGO : "+ this.cargo);
         System.out.println("E-MAIL : "+this.email);
         System.out.println("DEPENDENTES : "+this.quantidadeDependentes);
         System.out.println("FALTAS : "+this.faltas);
         System.out.println("SALARIO BRUTO : "+ this.salarioBruto);
         System.out.println("SALARIO BRUTO COM FALTAS : "+this.sbr);
         System.out.println("SALARIO LIQUIDO : "+this.salarioLiquido);
     }
    
}
