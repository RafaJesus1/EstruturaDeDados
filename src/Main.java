import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome;
        int idade;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();

        System.out.println("O seu nome é " + nome + " e sua idade é " + idade + " anos.");


    }
}