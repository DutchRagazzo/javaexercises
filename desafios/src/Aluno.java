//Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para acessar e
// modificar esses atributos. Adicione um
// método calcularMedia que retorna a média das notas do aluno.
public class Aluno {
    private String nomeAluno;
    private double notasAluno;
    private double mediaAluno;

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public void setNotasAluno(double notasAluno) {
        this.notasAluno = notasAluno;
    }

    public double getNotasAluno() {
        return notasAluno;
    }
}
