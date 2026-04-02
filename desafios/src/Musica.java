public class Musica {
    //Crie uma classe Musica com atributos titulo, artista, anoLancamento,
    // Somaavaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
    String tituloMusica;
    String artistaMusica;
    int anoLancamento;
    double somaavaliacao;
    double numAvaliacoes;
    void avaliarMusica(double avaliacao){
        somaavaliacao += avaliacao;
        numAvaliacoes++;
    }
    double calcularMedia() {
        if (numAvaliacoes == 0) {
            return 0; // evita divisão por zero
        }
        return somaavaliacao / numAvaliacoes;
    }
    void exibirFichaTecnica(){
        System.out.println("Título da música: " + tituloMusica);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Artista: " + artistaMusica);
        System.out.println("Nota da música: " + calcularMedia() );
        System.out.println("Total de avaliações: " +numAvaliacoes );
    }
}
