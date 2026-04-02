import java.util.Scanner;

public class LeituraDados {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);//* Abre o scanner para ler tudo que entrar pelo teclado
        System.out.println("Digite seu filme favorito: ");
        String filmeNome = leitor.nextLine();//*le a próxima linha digitada no terminal
        System.out.println("Qual a sua nota pra esse filme?");
        Double filmeNota = leitor.nextDouble();//le numero decimal
        System.out.println("Qual é o ano de lançamento?");
        Integer filmeAno = leitor.nextInt();//le numero inteiro
        System.out.println(filmeNome);
        System.out.println(filmeAno);
        System.out.println(filmeNota);

    }
}
