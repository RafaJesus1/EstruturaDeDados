package Lista02;

import java.util.Scanner;

//Sofia tem oitos anos e está aprendendo os números, os antecessores e os sucessores. Você
//resolveu fazer um programa para ajudá-la a saber se um número é sucessor de outro. Você
//basicamente pede como entrada um número, depois o suposto sucessor, por fim exibe se o
//suposto sucessor é o sucessor mesmo. É tipo assim: Sofia insere os números: 23 e, depois, 24 e
//você vai exibir: “O número 24 é sucessor de 23”, mas se Sofia colocar 23 e, depois, 26, você deve
//exibir: “O número 26 não é sucessor de 23”.

public class Atividade11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primeiroNumero, segundoNumero;

        System.out.println("Sofia, pode digitar o primeiro número: ");
        primeiroNumero = scanner.nextInt();
        System.out.println("Agora digite o segundo número: ");
        segundoNumero = scanner.nextInt();

        if (segundoNumero > primeiroNumero) {
            System.out.printf("O %d é o sucessor do %d", segundoNumero, primeiroNumero);
        } else if (primeiroNumero > segundoNumero) {
            System.out.printf("O %d não é o sucessor do %d", segundoNumero, primeiroNumero);
        } else {
            System.out.printf("O %d tem o mesmo valor que  %d", primeiroNumero, segundoNumero);

        }


    }
}
