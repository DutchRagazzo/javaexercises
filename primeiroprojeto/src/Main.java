public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o screenMatch");
        System.out.println("Filme: Interstellar");

        int anoDeLancamento = 2014;
        System.out.println("Ano de lançamento: "+anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.7;
//Média calculada pelas 3 avaliações
        double media = (10+8.3+7.0) /3;
        System.out.println("A média de avaliações desse filme é: "+media);
        String sinopse;
        sinopse = """
                Filme: Interstellar
                Filme de Sci-Fi estrelado por Matthew McConaughey e dirigido por Christopher Nolan.
                Muito Bom
                Ano de Lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media/2);
        System.out.println(classificacao);


    }
}
