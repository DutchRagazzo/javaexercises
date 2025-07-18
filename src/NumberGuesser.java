//Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100
// e pedir para que o usuário tente adivinhar o número, em até 5 tentativas.
// A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//Scanner lê as entradas do sistema.
        int numeroMaximo = 100;//define o numero bound (limite) a ser gerado
        double tentativas = 0;//inicia o número de tentativas como 0
        Random random = new Random();/* criando o objeto da classe Random, que gera número pseudoaleatório
         do tipo int, maior que ou igual a zero e menor que o valor de bound. */
        int numberGerado = random.nextInt(numeroMaximo+1);
        //o +1 para considerar o 100, e não somente os numeros < 100
        System.out.println(numberGerado);//ter o numero gerado para depuração
        System.out.println("""
                
                ███╗░░██╗██╗░░░██╗███╗░░░███╗██████╗░███████╗██████╗░        ░██████╗░██╗░░░██╗███████╗░██████╗░██████╗███████╗██████╗░
                ████╗░██║██║░░░██║████╗░████║██╔══██╗██╔════╝██╔══██╗        ██╔════╝░██║░░░██║██╔════╝██╔════╝██╔════╝██╔════╝██╔══██╗
                ██╔██╗██║██║░░░██║██╔████╔██║██████╦╝█████╗░░██████╔╝        ██║░░██╗░██║░░░██║█████╗░░╚█████╗░╚█████╗░█████╗░░██████╔╝
                ██║╚████║██║░░░██║██║╚██╔╝██║██╔══██╗██╔══╝░░██╔══██╗        ██║░░╚██╗██║░░░██║██╔══╝░░░╚═══██╗░╚═══██╗██╔══╝░░██╔══██╗
                ██║░╚███║╚██████╔╝██║░╚═╝░██║██████╦╝███████╗██║░░██║        ╚██████╔╝╚██████╔╝███████╗██████╔╝██████╔╝███████╗██║░░██║
                ╚═╝░░╚══╝░╚═════╝░╚═╝░░░░░╚═╝╚═════╝░╚══════╝╚═╝░░╚═╝        ░╚═════╝░░╚═════╝░╚══════╝╚═════╝░╚═════╝░╚══════╝╚═╝░░╚═╝""");
        System.out.println("Bem-Vindo ao Number Guesser! Você tem 5 tentativas para descobrir um número de 0 a 100");

        for(int i = 0; i<5; i++) {//Criando loop para controlar as tentativas e
            // ler o numero escolhido e comparar com o numero gerado

            System.out.println("Digite um número de 0 a 100: ");
            int numeroEscolhido = scanner.nextInt();//defino o scanner para ler o proximo valor inteiro que for inputado

            if (numeroEscolhido > numberGerado) {
                System.out.println("O número escolhido é maior que o número gerado");

            }
            else if (numeroEscolhido==numberGerado){//caso a pessoa acerte

                System.out.println("Parabéns! Você descobriu o número gerado!!");
                break;
            }
            else{
                System.out.println("O número escolhido é menor que o número gerado");
            }
            tentativas++;//incrementa o número de tentativas
            String msgtentativas;
            if(tentativas == 1) {
                msgtentativas = String.format("Já se foi %f tentativa", tentativas);
            }else{
                msgtentativas = String.format("Já se foram %f tentativas", tentativas);
            }
            System.out.println(msgtentativas);
            if (tentativas == 5 && numeroEscolhido != numberGerado) {
                System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + numberGerado);
            }

        }


    }
}
