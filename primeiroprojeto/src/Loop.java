import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);//* Abre o scanner para ler tudo que entrar pelo teclado
        double mediaAvaliacao = 0; // inicia a media das notas dadas para os filmes com 0
        /* le numero decimal das notas */
        double filmeNota;
        for (int i = 0; i < 4; i++) {//Repete esse bloco 4 vezes, me dando 4 notas
            System.out.println("Qual a sua nota pra esse filme?");
            filmeNota = leitor.nextDouble();//le as notas
            mediaAvaliacao += filmeNota;//A media recebe o valor que tinha + a nota dada pelo filme
        }
        System.out.println("Média de Avaliações: "+mediaAvaliacao/4);

    }
}
