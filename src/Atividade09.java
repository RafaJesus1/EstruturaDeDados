import java.util.Scanner;

//A sua professora de Física passou uma questão sobre velocidade média. Ela explicou que a
//velocidade média de um corpo, por exemplo, um carro, é calculada dividindo a distância
//percorrido (em metros) pela quantidade de tempo (em segundos).
//Desse modo, a velocidade = distancia / tempo. Você que não é besta foi logo fazendo um
//programa que calculasse a velocidade média, apenas lendo a distância percorrida e o tempo
//gastado para percorrê-lo

//Calcular: velocidade média
//Ler: a distância percorrida e o tempo gastado para percorrê-lo

public class Atividade09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double velocidadeMedia, distancia, tempo;

        System.out.println("Digite a distância percorrida: ");
        distancia = scanner.nextDouble();

        System.out.println("Digite o tempo gasto: ");
        tempo = scanner.nextDouble();

        velocidadeMedia = distancia / tempo;
        System.out.printf("A distância percorrida foi: %.2fm\nO tempo gasto para percorrê-lo: %.2fs\nA velocidade média foi: %.2fm/s", distancia, tempo, velocidadeMedia);


    }
}
