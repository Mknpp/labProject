package loja;

import data.Data;
import endereco.Endereco;

public class Vestuario extends Loja {
    private boolean produtosImportados;

    // Construtor
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
                     Endereco endereco, Data dataFundacao, boolean produtosImportados, int capacidadeEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeEstoque);
        this.produtosImportados = produtosImportados;
    }

    // Métodos de acesso
    public boolean isProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    // Método toString sobrescrito
    @Override
    public String toString() {
        return "Vestuario{" +
                super.toString() +
                ", produtosImportados=" + produtosImportados +
                '}';
    }
}
