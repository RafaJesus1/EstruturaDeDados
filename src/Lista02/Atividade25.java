package Lista02;
import java.util.Scanner;

//As cores no computador podem ser representadas por número inteiros entre 0 e 255, ou seja, 256
//valores distintos, onde 0 (zero) representa preto e 255 representa branco. Nessa escala de cinza,
//os valores abaixo de 128 são os mais escuros, acima desse valor os mais claros. Faça um programa
//que leia o nível de cinza, verifique se o valor está entre 0 e 255 e depois diga se é tom escuro ou
//claro.
//

//Leia o nível de cinza
//Verificar se o valor está entre 0 e 255
//Dizer se é tom escuro ou claro;

//Os valores < 128 são mais escuros > 128 são claros

public class Atividade25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nivelCinza;


        System.out.println("Digite o nível de cinza: ");
        nivelCinza = sc.nextInt();

        if (nivelCinza == 0) {
            System.out.printf("A cor será preta!\nNúmero da cor: %d.\n", nivelCinza);
        } else if (nivelCinza == 255) {
            System.out.printf("A cor será branca!\nNúmero da cor: %d.\n", nivelCinza);
        } else if (nivelCinza < 128 && nivelCinza > 0) {
            System.out.printf("O tom do cinza será escuro!\nNúmero da cor: %d.\n", nivelCinza);
        } else if (nivelCinza > 128 && nivelCinza < 256) {
            System.out.printf("O tom do cinza será claro!\nNúmero da cor: %d.\n", nivelCinza);
        } else if (nivelCinza == 128) {
            System.out.printf("A cor será cinza!\nNúmero da cor: %d.\n", nivelCinza);
        } else {
            System.out.println("Cores distintas!");
        }

    }
}
