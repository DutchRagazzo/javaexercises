public class ConvertDolar {
        public static void main(String[] args) {
            //Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.
            // Considere que o valor de 1 dólar é equivalente a 4.94 reais.
            // Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
            double valorEmDolares = 5.10;
            double taxaDeConversao = 4.94;
            double convertionDolarEmReal = valorEmDolares*taxaDeConversao;
            String msgConversao = String.format("A conversão de %f em Real = %f", valorEmDolares, convertionDolarEmReal);
            System.out.println(msgConversao);
    }
}
