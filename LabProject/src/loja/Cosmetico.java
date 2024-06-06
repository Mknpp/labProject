package loja;

import data.Data;
import endereco.Endereco;


public class Cosmetico extends Loja {
    private double taxaComercializacao;

    // Construtor
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
                     Endereco endereco, Data dataFundacao, double taxaComercializacao, int capacidadeEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeEstoque);
        this.taxaComercializacao = taxaComercializacao;
    }

    // Métodos de acesso
    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    // Método toString sobrescrito
    @Override
    public String toString() {
        return "Cosmetico{" +
                super.toString() +
                ", taxaComercializacao=" + taxaComercializacao +
                '}';
    }
}
