package Lista01;

import java.util.Scanner;

//Maria amou o programa que você fez para ela de calcular a área dos terrenos, mas ela possui outro
//grande problema: alguns terrenos não possuem lados uniformes, assim, ela precisa, muitas vezes,
//informar, além da área, o perímetro do terreno. Ela confirmou a você que todos os terrenos só
//possuem quatro lados. Você sabe que para calcular o perímetro do terreno basta somar todos os lados.
//Dessa forma, você confirmou a ela que faria esse programa de calcular perímetro.


//Calcular: o perímetro do terreno

public class Atividade04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ladoA, ladoB, ladoC, ladoD, perimetro;

        System.out.println("Digite o primeiro lado do terreno: ");
        ladoA = scanner.nextDouble();

        System.out.println("Digite o segundo lado do terreno: ");
        ladoB = scanner.nextDouble();

        System.out.println("Digite o terceiro lado do terreno: ");
        ladoC = scanner.nextDouble();

        System.out.println("Digite o quarto lado do terreno: ");
        ladoD = scanner.nextDouble();


        perimetro = ladoA + ladoB + ladoC + ladoD;
        System.out.printf("O perímetro do terreno é: %.2f", perimetro);


    }
}
