public class Carro {
    //Crie uma classe Carro com atributos modelo,
    // anoDeLancamento, corDoCarro e métodos para exibir a ficha técnica e calcular a idade do carro.
    String nomeDoCarro;
    String modeloDoCarro;
    String tipoDeCarro;
    int anoDeLancamento;
    String corDoCarro;
    int calcularIdadeDoCarro(){
        int anoAtual = 2025;//pra evitar de deixar o numero do ano e deixar o código mais legível
        int  idadeDoCarro = (anoAtual - anoDeLancamento);
        if(idadeDoCarro==0){
            return anoAtual;
        }
        return idadeDoCarro;
    }
    void exibirFichaTecnica(){
        System.out.println("Marca do carro: " + nomeDoCarro);
        System.out.println("Modelo do carro: "+ modeloDoCarro);
        System.out.println("Tipo de carro: "+ tipoDeCarro);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Idade do carro: "+calcularIdadeDoCarro());
        System.out.println("Cor do carro: " + corDoCarro);
    }

}
