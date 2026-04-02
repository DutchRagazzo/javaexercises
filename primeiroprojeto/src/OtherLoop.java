import java.util.Scanner;

public class OtherLoop {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);//* Abre o scanner para ler tudo que entrar pelo teclado
        double mediaAvaliacao = 0;// inicia a media das notas dadas para os filmes com 0
        double filmeNota = 0;   /* le numero decimal das notas */
        int totalDeNotas = 0;
        while (filmeNota !=-1) {//Repete esse bloco enquanto o input da nota não receber -1
            System.out.println("Qual a sua nota pra esse filme? Caso não queira avaliá-lo digite -1");
            filmeNota = leitor.nextDouble();//le as notas
            if(filmeNota != -1){//para evitar que se some o -1 com as avaliacoes
                mediaAvaliacao += filmeNota;//A media recebe o valor que tinha + a nota dada pelo filme
                totalDeNotas++; //incrementa o total de notas de avaliação, já que o bloco pode se repetir diversas vezes
            }

        }
        if(totalDeNotas == 0){
            System.out.println("Média das Avaliações = 0");
        }else{
            System.out.println("Média de Avaliações: "+(mediaAvaliacao)/totalDeNotas);
        }
    }
}
