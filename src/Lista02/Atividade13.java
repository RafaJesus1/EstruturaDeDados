package Lista02;
import java.util.Scanner;

//Você sabe que o “par ou ímpar” é o modo tradicional de escolher algo pela sorte. Normalmente, as
//duas pessoas usam apenas uma mão e escolhem o número de dedos que desejam. Você soma o
//total de dedos e verifica se o número é ímpar ou par. Um número é par se a sua divisão inteira por
//2 resta zero, um número é ímpar no caso contrário. Então, faça isso. Leia o número de dedos da
//mão de cada jogador e diga se o resultado deu ímpar ou par

public class Atividade13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dedosJogador1, dedosJogador2;

        System.out.println("Jogador 1, quantos dedos tem? ");
        dedosJogador1 = scanner.nextInt();

        System.out.println("Jogador 2, quantos dedos tem? ");
        dedosJogador2 = scanner.nextInt();

        if ((dedosJogador1 + dedosJogador2) % 2 == 0 && dedosJogador2 + dedosJogador1 <= 10) {
            System.out.print("Par!");
        } else if ((dedosJogador1 + dedosJogador2) % 2 != 0 && dedosJogador2 + dedosJogador1 <= 10) {
            System.out.print("Ímpar!");
        } else {
            System.out.print("Limite de dedos excedido! Tentem novamente.");
        }
    }
}
