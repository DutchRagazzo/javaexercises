package br.com.desafios.alura.GabrielHolanda.Produto.modelos;

public class ProdutoPerecivel extends Produto {
private String dataValidade;
    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return super.toString()+System.lineSeparator()+" Data de Validade: "+this.dataValidade;
    }
}
