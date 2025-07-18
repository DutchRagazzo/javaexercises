//Crie um programa que solicite ao usuário digitar um número.
// Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".

import java.util.Scanner;
public class Desafio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");//pede o input do número ao usuário.
        double numeroEscolhido = scanner.nextDouble();//Configura o scanner para ler valores decimais.
        if(numeroEscolhido>0){
            System.out.println("O número escolhido ("+numeroEscolhido+") é positivo.");
        }else{
            System.out.println("O número escolhido ("+numeroEscolhido+") é negativo.");
        }

//Peça ao usuário para inserir dois números inteiros.
// Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.

        System.out.println("Digite um número inteiro: ");
        int numInteiroEscolhido1 = scanner.nextInt();//define um número a ser lido
        System.out.println("Digite outro número inteiro: ");
        int numInteiroEscolhido2 = scanner.nextInt();//define outro numero

        if(numInteiroEscolhido1 == numInteiroEscolhido2) {
            System.out.println("Os números são iguais");
        }else if(numInteiroEscolhido1 > numInteiroEscolhido2){
            System.out.println("O primeiro número escolhido ("+numInteiroEscolhido1+")  é maior que o segundo número escolhido : "+numInteiroEscolhido2);
            System.out.println("Os números são diferentes");
        }else{
            System.out.println("O segundo número (" +numInteiroEscolhido2+ ") é maior que o segundo número escolhido: "+numInteiroEscolhido1);
            System.out.println("Os números são diferentes");
        }

        //Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo".
        // Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
        System.out.println("Escolha uma dessas opções:");
        System.out.println("1.Calcular área do quadrado.");
        System.out.println(" 2. Calcular área do círculo.");
        int opcao = scanner.nextInt();
            if (opcao == 1) {
                System.out.print("Insira a medida do lado do quadrado em metros: ");
                double ladoQuadrado = scanner.nextDouble();
                double areaQuadrado = Math.pow(ladoQuadrado, 2);
                System.out.println("A área do quadrado de lado " + ladoQuadrado + "m tem uma área de " + areaQuadrado + "m²");
            }
            else if (opcao ==2) {
                System.out.print("Insira a medida do raio da base do círculo em metros: ");
                double raioCirculo = scanner.nextDouble();
                double areaCirculo = Math.pow(raioCirculo, 2)*Math.PI;
                System.out.println("A área do quadrado de raio "+ raioCirculo +"m tem uma área aproximada de "+ Math.round(areaCirculo) +"m² se PI = 3,14");
            }
            else{

                System.out.println("Opção não reconhecida");
            }

        //Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
        System.out.println("Digite um número para saber a tabuada dele do 1 ao 10: ");
        int multiplicando = scanner.nextInt();
        for(int i = 1; i<=10; i++){
            int produto = multiplicando * i;
            System.out.printf("%d x %d = %d%n", multiplicando, i,produto);
        }
        //Crie um programa que solicite ao usuário a entrada de um número inteiro.
        // Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
        System.out.println("Digite um número inteiro: ");
        int intNum = scanner.nextInt();
        if (intNum % 2 == 0){
            System.out.println("O número escolhido ("+intNum+") é par");
        }else{
            System.out.println("O número escolhido ("+intNum+") é ímpar");
        }
        //Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
        System.out.println("Digite um número natural para descobrir o fatorial desse número: ");
        int numerofatorial = scanner.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= numerofatorial; i++) {
            fatorial *= i;
        System.out.printf("O fatorial do número %d é: %d ", numerofatorial, fatorial );

        scanner.close();
        }
    }}

