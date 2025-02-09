package Lista02;
import java.util.Scanner;

//Em um jogo de tabuleiro, um jogador pode movimentar uma peça apenas se o número do seu
//dado for maior que o do seu adversário. Faça um programa que informe se o jogador pode ou não
//jogar aquela partida. Leia o número do dado do jogador e do seu adversário e informe quem deve
//jogar. No caso de empate, nenhum dos jogadores joga.

//

public class Atividade18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dadoJogador1, dadoJogador2;

        System.out.println("Digite o dado do jogador 1: ");
        dadoJogador1 = scanner.nextInt();
        System.out.println("Digite o dado do jogador 2: ");
        dadoJogador2 = scanner.nextInt();

        if(dadoJogador1 > dadoJogador2){
            System.out.printf("Dado do primeiro jogador: %d\nDado do segundo jogador: %d\n", dadoJogador1, dadoJogador2);
            System.out.print("Faça sua jogada, jogador 1!");
        } else if (dadoJogador1 < dadoJogador2) {
            System.out.printf("Dado do primeiro jogador: %d\nDado do segundo jogador: %d\n", dadoJogador1, dadoJogador2);
            System.out.print("Faça sua jogada, jogador 2!");
        } else {
            System.out.print("Deu empate!");
        }
    }
}
