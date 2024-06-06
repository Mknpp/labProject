package loja;

import data.Data;
import endereco.Endereco;

// Arquivo: Informatica.java
public class Informatica extends Loja {
    private double seguroEletronicos;

    // Construtor
    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
                       Endereco endereco, Data dataFundacao, double seguroEletronicos, int capacidadeEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeEstoque);
        this.seguroEletronicos = seguroEletronicos;
    }

    // Métodos de acesso
    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    // Método toString sobrescrito
    @Override
    public String toString() {
        return "Informatica{" +
                super.toString() +
                ", seguroEletronicos=" + seguroEletronicos +
                '}';
    }
}
