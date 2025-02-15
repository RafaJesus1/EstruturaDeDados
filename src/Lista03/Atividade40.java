package Lista03;
import java.util.Scanner;

//As temperaturas no verão estão sendo cada vez mais quentes, assim como algumas regiões estão
//tendo invernos mais rigorosos. Devido a isso, alertas de emergências devem ser divulgados com
//antecedência. Você deve fazer um programa que leia as temperaturas máximas e mínimas
//durante uma semana. Você deve apresentar a mínima e a máxima da semana.

//Leia as temperaturas máximas e mínimas da semana


public class Atividade40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temperatura;
        double temperaturaMinima = Double.MAX_VALUE;
        double temperaturaMaxima = Double.MIN_VALUE;
        int dias = 7;

        for (int i = 0; i < dias; i++) {
            System.out.printf("\nDigite uma temperatura máxima do dia %d: ", i + 1);
            temperatura = sc.nextDouble();

            if (temperatura > temperaturaMaxima) {
                temperaturaMaxima = temperatura;
            }

            System.out.printf("\nDigite uma temperatura mínima do dia %d: ", i + 1);
            temperatura = sc.nextDouble();

            if (temperatura < temperaturaMinima) {
                temperaturaMinima = temperatura;
            }
        }

        System.out.printf("A temperatura máxima da semana é: %.1f°\nA temperatura mínima da semana é: %.1f°", temperaturaMaxima, temperaturaMinima);
    }
}
