
package br.com.rh.Repositorio;

import br.com.rh.Departamento;
import java.util.ArrayList;
import java.util.List;


public class DepartamentoRepositorio {
    private static List<Departamento> departamentos = new ArrayList<Departamento>();
    public static void addDepartamento(Departamento departamento){
        departamentos.add(departamento);
    }
    
    public static Departamento getDepartamento(String departamento){
        return departamentos.stream().filter(d -> departamento.equals(d.getDepartamento())).findFirst().orElse(new Departamento());
    }
    
    public static boolean departamentoExists(String departamento){
        return departamentos.stream().anyMatch(d -> (departamento == null ? d.getDepartamento() == null : departamento.equals(d.getDepartamento())));
    
}
}
