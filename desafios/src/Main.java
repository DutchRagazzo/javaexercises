import br.com.desafios.alura.GabrielHolanda.Produto.modelos.Produto;
import br.com.desafios.alura.GabrielHolanda.Produto.modelos.ProdutoPerecivel;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        IdadePessoa pessoa1 = new IdadePessoa();
        IdadePessoa pessoa2 = new IdadePessoa();
        IdadePessoa pessoa3 = new IdadePessoa();

        pessoa1.setNome("João");
        pessoa1.setIdade(15);

        pessoa2.setNome("Zaqueu");
        pessoa2.setIdade(16);

        pessoa3.setNome("Naum");
        pessoa3.setIdade(17);


        var listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);
        System.out.println("Quantidade de pessoas na lista: "+ listaDePessoas.size());
        System.out.println("Dados da primeira pessoa: "+listaDePessoas.get(0).toString());
        System.out.println("Lista completa: "+listaDePessoas);


        ProdutoPerecivel leite_em_po = new ProdutoPerecivel("Leite em Pó", 5.25,3, "20/10/2020");
        Produto cuscuz = new Produto("Cuscuz",2.5, 4);
        Produto bandeja_de_ovos = new Produto("Bandeja de ovos", 5,10);
        var listaDeProdutos = new   ArrayList<>();
        listaDeProdutos.add(cuscuz);
        listaDeProdutos.add(leite_em_po);
        listaDeProdutos.add(bandeja_de_ovos);
        System.out.println("Itens na lista de compras: "+listaDeProdutos.size());
        System.out.println("Dados do primeiro item na lista "+listaDeProdutos.getFirst());
        System.out.println(leite_em_po);


    }
}
