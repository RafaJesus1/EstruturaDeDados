package Lista03;
import java.util.Scanner;

//Calcular a área de uma casa, ou um apartamento, pode ser uma tarefa complicada,
//principalmente, quando a área construída não é parecida com um quadrado ou retângulo. Por isso,
//um modo mais fácil é somar as áreas de cada cômodo da casa e então ter a área total. Faça um
//programa que pede a área por cômodo, até que a área informada seja igual a zero. Quando a área
//for nula, você deve informar a área total da casa, ou apartamento

//Pede a área por cômodo

public class Atividade30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double areaPorComodo;
        double areaTotal = 0;

        do {
            System.out.println("Digite o valor da área do comodo: ");
            areaPorComodo = sc.nextDouble();
            areaTotal += areaPorComodo;
        } while (areaPorComodo != 0);

        System.out.printf("A área total é %.2f metros quadrados.", areaTotal);
    }
}
