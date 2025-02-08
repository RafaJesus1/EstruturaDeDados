package Lista02;
import java.util.Scanner;

//Na sua escola, você faz três avaliações no ano e a sua nota final é a média aritmética dessas três
//avaliações. Para você ser aprovado sua média deve ser maior ou igual a 7.0 pontos, caso contrário
//você estará reprovado. Faça um programa para ler suas notas e dizer se você está aprovado ou
//reprovado

public class Atividade14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double notas1, notas2, notas3;
        double media = 0;

        System.out.println("Digite a primeira nota: ");
        notas1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        notas2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota: ");
        notas3 = scanner.nextDouble();

        media = (notas1 + notas2 + notas3) / 3;

        if (media >= 7) {
            System.out.printf("Parabéns! Você passou com %.2f pontos!", media);
        } else {
            System.out.printf("Que pena! Você não passou por %.2f pontos!", media);
        }



    }
}
