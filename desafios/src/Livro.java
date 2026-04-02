//Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos getters e setters para
// acessar e modificar esses atributos.
// Adicione um método exibirDetalhes que imprime o título e o autor do livro.
public class Livro {
    private String tituloLivro;
    private String autorLivro;

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }
}
