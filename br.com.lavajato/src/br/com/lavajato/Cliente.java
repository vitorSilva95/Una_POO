
package br.com.lavajato;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String nome;
    String telefone;
    String cpf;
    Endereco endereco;
    private final List<Veiculo> veiculos;
    
    public Cliente(String nome,String telefone,String cpf, Endereco endereco){
        this.nome=nome;
        this.cpf=cpf;
        this.telefone=telefone;
        this.veiculos = new ArrayList<>();
        this.endereco = endereco;
    }
    public void addVeiculos(Veiculo veiculo){
        veiculos.add(veiculo);
    }
    public boolean conferirVeiculo(Veiculo veiculo){
        return this.veiculos.contains(veiculo);
    }
        
    
}
