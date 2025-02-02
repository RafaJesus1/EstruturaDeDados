import java.util.Scanner;

//Você está começando na academia hoje e a sua instrutora fez um levantamento do seu biotipo,
//além de outras informações suas. Ela para calcular o seu IMC (Índice de Massa Corporal), mediu o
//seu peso e sua altura. Com essas informações em mãos, ela calculou o seu IMC usando a seguinte
//fórmula: imc = peso / (altura * altura). Com o valor calculado, ela te apresentou a sua ficha de
//acompanhamento. Você resolveu ajudar a sua instrutora e vai fazer um programa para calcular o
//imc

public class Atividade02 {
    public static void main(String[] args) {
        //Scanner para receber uma entrada no terminal
        Scanner scanner = new Scanner(System.in);
        //Declarando as variáveis
        double peso, altura, imc;

        //Lendo a instrução, para sinalizar o usuário a digitar o peso
        System.out.println("Digite seu peso: ");
        //Captando o resultado que foi inserido pelo usuário
        peso = scanner.nextDouble();

        //Lendo a instrução, para sinalizar o usuário a digitar a altura
        System.out.println("Digite sua altura: ");
        //Captando o resultado que foi inserido pelo usuário
        altura  = scanner.nextDouble();

        //Fazendo o cálculo do IMC com os valores anteriores
        imc = peso / (altura*altura);

        //Imprimindo o resultado
        System.out.printf("O seu Índice de Massa Corporal é: %.2f", imc);

    }
}
