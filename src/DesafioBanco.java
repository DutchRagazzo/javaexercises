import java.util.Scanner;

public class DesafioBanco {
    public static void main(String[] args) {
        //definindo variaveis para armazenar valores fora do loop
        Scanner scanner = new Scanner(System.in);
        double saldoInicial = 1656.00;
        String nomeCliente = "Gabriel Holanda";
        String tipoDeConta = "Corrente";
        int opcao;

        String interfaceApp =
                String.format(
                """
                ***********************
              
                Dados iniciais do cliente
                
                Nome:           %s
                Tipo de Conta:  %s
                Saldo Inicial:  R$ %.2f
                
                ***********************""",
                nomeCliente,      // %s → nomeCliente
                tipoDeConta,      // %s → tipoDeConta
                saldoInicial      // %.2f → saldoInicial
        );
        String operacoesApp = """
                 Operações
                
                1- Consultar saldo
                2- Depositar
                3- Transferir 
                4- Sair
                
                Digite a opção desejada:""";
        do {
            System.out.println(interfaceApp);
            System.out.println(operacoesApp);
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo atual é: R$ " + saldoInicial);
                    break;
                case 2:
                    System.out.print("Digite o valor a depositar: ");
                    double deposito = scanner.nextDouble();
                    saldoInicial += deposito;
                    System.out.println("Depósito realizado. Novo saldo: R$ " + saldoInicial);
                    break;
                case 3:
                    System.out.print("Digite o valor a transferir: ");
                    double transferencia = scanner.nextDouble();
                    if (transferencia <= saldoInicial) {
                        saldoInicial -= transferencia;
                        System.out.println("Transferência realizada. Novo saldo: R$ " + saldoInicial);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 4:
                    System.out.println("Encerrando operação. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 4);

        scanner.close();
    }
}




