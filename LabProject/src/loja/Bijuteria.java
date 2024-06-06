package loja;

import endereco.Endereco;
import data.Data;

public class Bijuteria extends Loja {
    private double metaVendas;

    // Construtor
    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
                     Endereco endereco, Data dataFundacao, double metaVendas, int capacidadeEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeEstoque);
        this.metaVendas = metaVendas;
    }

    // Métodos de acesso
    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    // Método toString sobrescrito
    @Override
    public String toString() {
        return "Bijuteria{" +
                super.toString() +
                ", metaVendas=" + metaVendas +
                '}';
    }
}
