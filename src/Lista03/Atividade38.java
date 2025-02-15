package Lista03;

//Em uma mesa de apostas, o jogador que tirar o maior número vence a rodada. Cada mesa de
//apostas tem o máximo de 6 jogadores. Após lido as jogadas, você deve informar a face de maior
//valor, assim como o jogador que fez essa jogada.

//6 jogadores = 6 turnos
//Ler as jogadas, depois informar a maior pontuação e o jogador;

import java.util.Scanner;

public class Atividade38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int turnos = 6;
        int maiorPonto = 0;
        int jogadorVencedor = 0;
        int pontos;

        for (int i = 0; i < turnos; i++) {
            System.out.printf("Digite o ponto do jogador %d: ", i + 1);
            pontos = sc.nextInt();
            if (pontos > maiorPonto) {
                maiorPonto = pontos;
                jogadorVencedor = i + 1;

            }
        }

        System.out.printf("O jogador %d foi o vencedor e fez %d pontos para vendcer!", jogadorVencedor, maiorPonto);
    }
}
