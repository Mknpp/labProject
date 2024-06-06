package shopping;

import endereco.Endereco;
import loja.Informatica;
import loja.Loja;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    // Construtor
    public Shopping(String nome, Endereco endereco, int quantidadeMaximaLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaximaLojas];
    }

    // Métodos de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    // Método toString
    @Override
    public String toString() {
        return "Shopping{" +
                "nome='" + nome + '\'' +
                ", endereco=" + endereco +
                '}';
    }

    // Método para inserir loja no shopping
    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false; // Se não houver espaço livre
    }

    // Método para remover loja do shopping
    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false; // Se a loja não for encontrada
    }

    // Método para obter a quantidade de lojas por tipo
    public int quantidadeLojasPorTipo(String tipo) {
        int count = 0;
        for (Loja loja : lojas) {
            if (loja != null && loja.getClass().getSimpleName().equals(tipo)) {
                count++;
            }
        }
        return count == 0 ? -1 : count;
    }

    // Método para obter a loja de informática com seguro mais caro
    public Informatica lojaSeguroMaisCaro() {
        double maxSeguro = -1;
        Informatica lojaMaisCara = null;
        for (Loja loja : lojas) {
            if (loja instanceof Informatica) {
                Informatica informatica = (Informatica) loja;
                if (informatica.getSeguroEletronicos() > maxSeguro) {
                    maxSeguro = informatica.getSeguroEletronicos();
                    lojaMaisCara = informatica;
                }
            }
        }
        return lojaMaisCara;
    }
}
