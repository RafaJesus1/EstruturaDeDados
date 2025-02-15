package Lista03;

//A equipe de meteorologia de um jornal precisava calcular a temperatura média semanal em
//determinada localidade. Para tal, são feitas as leituras das máximas dos sete dias de uma semana.
//Por fim, a temperatura média deve ser exibida.

import java.util.Scanner;

public class Atividade36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temperatura;
        double temperaturaMedia = 0;
        int dias = 7;

        for(int i = 0; i < dias; i++) {
            System.out.printf("Digite a temperatura máxima do dia %d: ", i + 1);
            temperatura = sc.nextDouble();
            temperatura /= dias;
            temperaturaMedia += temperatura;
        }

        System.out.printf("A temperatura média semanal é: %.1f°\n", temperaturaMedia);
    }
}
