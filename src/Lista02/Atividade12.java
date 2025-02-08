package Lista02;
import java.util.Scanner;

//Você viu na televisão que esse inverno vai ser rigoroso no Brasil. Decidiu então que vai monitorar a
//temperatura da sua cidade. Se as temperaturas estiverem abaixo de 17ºC, você vai exibir na tela:
//“Frio da moléstia", mas caso contrário: “Tudo normal nas terras de Cuçumarim”´´.

public class Atividade12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temperatura;

        System.out.println("Digite a temperatura: ");
        temperatura = scanner.nextDouble();

        if (temperatura < 17) {
            System.out.printf("A temperatura está em %.1f°C\nFrio da moléstia!!!",temperatura);
        } else {
            System.out.printf("A temperatura está em %.1f°C\nTudo normal nas terras de Cuçumarim!!", temperatura);
        }
    }
}
