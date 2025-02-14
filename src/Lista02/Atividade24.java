package Lista02;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

//Chega de trabalhar com datas! Agora vamos trabalhar com números aleatórios. Você está fazendo
//um sistema de rifas. Você deve ler o número máximo da rifa, por exemplo: 30, 50, 100, assim
//como o número da rifa apostado pelo usuário. Você deve fazer o sorteio e verificar se o número
//que o usuário escolheu foi o sorteado. Procure como gerar números aleatórios na internet.

// FONTE: https://www.devmedia.com.br/numeros-aleatorios-em-java-a-classe-java-util-random/26355

public class Atividade24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroMaximo, palpiteUsuario, numeroAleatorio;
        Random random = new Random();

        System.out.println("Digite um número máximo para Rifa: ");
        numeroMaximo = sc.nextInt();

        numeroAleatorio = random.nextInt(numeroMaximo) + 1;

        System.out.println("Digite o seu palpite: ");
        palpiteUsuario = sc.nextInt();

        if (palpiteUsuario == numeroAleatorio) {
            System.out.printf("Parabéns! Você ganhou uma coca-cola!\nNúmero Sorteado: %d.", numeroAleatorio);
        } else {
            System.out.printf("Parabéns! Você perdeu :)\nNúmero Sorteado: %d.", numeroAleatorio);
        }


    }
}
