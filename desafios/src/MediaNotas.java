public class MediaNotas {
    public static void main(String[] args){
        //Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        double nota1 = 7.20;
        double nota2 = 8.50;
        double mediaNotas = nota1+nota2/2;
        String media = String.format("A média entre %f e %f é %f", nota1, nota2, mediaNotas);
        System.out.println(media);
    }
}
