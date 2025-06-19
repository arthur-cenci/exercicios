import java.util.Scanner;
public class calculadora {
    public static void main(String[] args) {
        double n1 = 0, n2 = 0, calculo = 0;
        int escolha, i = 0;
        Scanner scanner = new Scanner(System.in);

        Double[] hist_calculo = new Double[3];

        System.out.println("calculadora do bostil");
 
        do{

            System.out.println("escolha o calculo");

            System.out.println("1) +\n2) -\n3) *\n4) /\n5) explodir a calculadora\n6) mostrar historico\n");
            escolha = scanner.nextInt();
            
            if (escolha != 6 && escolha != 5){
                System.out.println("escolha o primeiro numero: ");
                n1 = scanner.nextDouble();
                hist_calculo[i] = n1;
                System.out.println("escolha o segundo numero");
                n2 = scanner.nextDouble();
                hist_calculo[i+1] = n2;
            }

            switch (escolha) {
            case 1:
                calculo = n1 + n2;
                System.out.println("\n\na soma entre "+n1+" e "+n2+" é "+calculo+"\n\n");
                break;
            case 2:
                calculo = n1 - n2;
                System.out.println("\n\na subtraçao entre "+n1+" e "+n2+" é "+calculo+"\n\n");    
                break;
            case 3:
                calculo = n1 * n2;
                System.out.println("\n\na multiplicação entre "+n1+" e "+n2+" é "+calculo+"\n\n");
                break;
            case 4:
                calculo = n1 / n2;
                System.out.println("\n\na divisao entre "+n1+" e "+n2+" é "+calculo+"\n\n");
                break;
            case 5:
                System.out.println("ate mais");
                break;
            case 6:
                System.out.println("historico");
                for(int j = 0; j <= hist_calculo.length; j++){
                    System.out.println(hist_calculo[j] + "\n");
                }
                break;
            default:
            System.out.println("equaçao inadequanda");
                break;
            }
            hist_calculo[i+2] = calculo;
        }while(escolha != 5 || escolha != 6);
    }
}
