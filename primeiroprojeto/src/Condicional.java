public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2014;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.7;
        String tipoPlano = "normal";
        if (anoDeLancamento>=2025){
            System.out.println("Filme novo que os clientes adoram");
        } else{
            System.out.println("Filme clássico que vale a pena assistir");
        }
        if (incluidoNoPlano || tipoPlano.equals("plus")){
            System.out.println("Filme disponível no plano atual");
        } else {
            System.out.println("Filme disponível para compra ou aluguel");
        }
    }
}
