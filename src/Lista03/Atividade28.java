package Lista03;
import java.util.Scanner;

//Quando crianças aprendemos as tabuadas dos números 2, 3, 4, assim em diante. Vamos criar a
//tabuada do número que quisermos. O usuário deve informar o número que ele deseja a tabuada e
//você deve imprimir a tabuada tal como abaixo:
//Número da tabula: 5
//Tabuada de 5:
//5 X 1 = 5
//5 X 2 = 10
//...
//5 X 10 = 50

//Informar: o número que o usuário deseja
//Variável: numeroTabuada

//Estrutura de repetição: for, já que sabemos que a tabuada vai até 10

public class Atividade28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroTabuada;

        System.out.println("Digite um número que você deseja a tabuada: ");
        numeroTabuada = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", numeroTabuada, i, numeroTabuada * i);
        }
    }
}
