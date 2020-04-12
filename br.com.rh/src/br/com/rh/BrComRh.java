
package br.com.rh;

import br.com.rh.Repositorio.CargoRepositorio;
import br.com.rh.Repositorio.DepartamentoRepositorio;

public class BrComRh {

    public static void main(String[] args) throws Exception {
        
        
        Cargo cargo1 = new Cargo("DESENVOLVEDOR MOBILE","SUPERIOR EM ADS");
        cargo1.exibeCargo();
        CargoRepositorio.addCargo(cargo1);
        
        Departamento dep1 = new Departamento("DESENVOLVIMENTO","dev@gmail.com",45988,"CARLOS");
        dep1.exibeDepartamento();
        DepartamentoRepositorio.addDepartamento(dep1);
        
        Funcionario f1= new Funcionario("OZEIAS","133.567.888-16","Rua Jatoba Contagem MG ",333,"DESENVOLVIMENTO",
                "DESENVOLVEDOR MOBILE","OZEIAS@gmail.com",5,0,2500.00);
        f1.calcularSalarioBruto();
        f1.calcularSalarioLiquido();
        f1.exibeFuncionario();
        
    }
    
}
