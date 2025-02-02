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

        double largura, comprimento, perimetro;

        System.out.println("Digite a largura do terreno: ");
        largura = scanner.nextDouble();

        System.out.println("Digite o comprimento do terreno: ");
        comprimento = scanner.nextDouble();

        perimetro = (largura * 2) + (comprimento * 2);
        System.out.printf("O perímetro do terreno é: %.2f", perimetro);


    }
}
