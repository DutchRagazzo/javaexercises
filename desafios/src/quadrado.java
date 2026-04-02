public class quadrado {
    public static int calcularPotencia(int base, int expoente) {
        int resultado = 1; // O resultado inicial é 1 para qualquer base
        for (int i = 0; i < expoente; i++) {
            resultado *= base; // Multiplica o resultado pela base a cada iteração
        }
        return resultado;
    }

}
