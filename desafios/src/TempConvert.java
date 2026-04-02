public class TempConvert {
    public static void main(String[] args) {
        //Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit.
        double temperaturaCelsius = 30.8;
        double temperaturaFahrenheit = (temperaturaCelsius*1.8)+32;
        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", temperaturaCelsius, temperaturaFahrenheit);
        System.out.println(mensagem);
        int conversaointeira = (int) temperaturaFahrenheit;
        System.out.println("A temperatura de 30.8 em Celsius é em Fahrenheit: "+conversaointeira);
    }
}
