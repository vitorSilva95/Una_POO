
package br.com.lavajato;

import java.util.ArrayList;
import java.util.List;

public class Agendamento {
    String data;
    String horario;
    Funcionario funcionario;
    Cliente cliente;
    private final List<Servicos> servicos;
    Veiculo veiculo;
    
    public Agendamento(String data,String horario,Funcionario funcionario,Cliente cliente,Veiculo veiculo){
        this.data = data;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.horario = horario;
        this.servicos = new ArrayList<>();
        if (!cliente.conferirVeiculo(veiculo)) {
            throw new IllegalArgumentException("O veículo nao pertence ao cliente");
        }
        this.veiculo=veiculo;
    }
    public void addServicos(Servicos servico){
        servicos.add(servico);
    }
    public double calcularValorServico(){
        double preco = 0.00;
        for (int i = 0; i < servicos.size(); i++) {
            preco += servicos.get(i).valor;
        }
        return preco;
    }
    public int calcularTempoServico(){
        int tempo = 0;
        for (int i = 0; i < servicos.size(); i++) {
            tempo += servicos.get(i).tempo;
        }  
        return tempo;
    }
    public void imprimirAgendamento(){
        int tempo=calcularTempoServico();
        double preco=calcularValorServico();
        System.out.println("Nome Cliente: "+cliente.nome);
        System.out.println("Nome Funcionario :"+funcionario.nome);
        System.out.println("Data do agendamento: "+data);
        System.out.println("Horario agendamento: "+horario);
        System.out.println("Veiculo :"+veiculo.modelo+" Placa :"+veiculo.placa);
        System.out.println("Valor Agendamento:"+preco);
        System.out.println("Tempo de Duração Serviço:"+tempo);
        

    }
}
