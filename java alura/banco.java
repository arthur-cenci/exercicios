import java.util.Scanner;
public class banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("insira seus dados abaixo");
        
        System.out.println("insira seu nome : ");
            String nome = scanner.nextLine();
        System.out.println("insira tipo da conta : ");
            String tconta = scanner.nextLine();
        System.out.println("insira seu saldo: ");
            double saldo = scanner.nextInt();


        System.out.println("\n\n\n\n\nBanco digital");
        System.out.println("nome: "+nome);
        System.out.println("tipo da conta: "+tconta);
        System.out.println("saldo: "+saldo+"\n\n\n");

        int opcao = 0;
        String menu = "1-ver saldo\n2-transferir\n3-receber\n4-sair";
        while (opcao != 4) {
            System.out.println(menu);
            opcao = scanner.nextInt();
        

       if (opcao == 1){
                System.out.println("O saldo atualizado é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valor = scanner.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência.");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = scanner.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida");
            }
        }
    }
}