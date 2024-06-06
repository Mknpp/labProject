package loja;

import data.Data;
import endereco.Endereco;

public class Alimentacao extends Loja {
    private Data dataAlvara;

    // Construtor
    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
                       Endereco endereco, Data dataFundacao, Data dataAlvara, int capacidadeEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeEstoque);
        this.dataAlvara = dataAlvara;
    }

    // Métodos de acesso
    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    // Método toString sobrescrito
    @Override
    public String toString() {
        return "Alimentacao{" +
                super.toString() +
                ", dataAlvara=" + dataAlvara +
                '}';
    }
}
