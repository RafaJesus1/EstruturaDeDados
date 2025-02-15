package Lista03;
import java.util.Scanner;

//Em um jogo de buraco, a soma dos pontos é importante para saber a equipe vencedora. Deste
//modo, vamos fazer um programa que some todos os pontos de um jogador e ao fim imprima a
//pontuação total. A leitura deve terminar quando uma pontuação negativa for informada.


public class Atividade32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pontos;
        int pontuacaoTotal = 0;

        while (true) {
            System.out.println("Digite o ponto do jogador: ");
            pontos = sc.nextInt();

            if (pontos < 0) {
                break;
            }

            pontuacaoTotal += pontos;
        }

        System.out.printf("A pontuação total do jogador: %d", pontuacaoTotal);
    }
}
