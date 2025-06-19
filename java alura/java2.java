import java.util.Scanner;

public class java2 {
     public static void main(String[] args) {
        String nome;
        double nota, media, soma = 0;
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        nome = scanner.nextLine();

        do{
            System.out.println("Digite a nota do aluno: ");
            nota = scanner.nextDouble();
            i++;
            soma += nota;
        }while( i <= 2);

        media = soma/i;
    
        Aluno a = new Aluno(nome, media);

        System.out.println(a.toString());

        a.setNome("Bolsonaro");
        a.setNota(5.9878786);

        System.out.println(a.getNome());
        System.out.println(a.getNota());
     }

}