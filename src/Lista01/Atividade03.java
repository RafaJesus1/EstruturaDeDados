package Lista01;

import java.util.Scanner;

//Maria trabalha para uma construtora no setor de vendas. Constantemente, ela tem que calcular a
//área dos terrenos vendidos. Como Maria é sua amiga há muito tempo, você resolveu ajudá-la
//criando um programa que lê o comprimento e a largura e imprime a área total do terreno em
//metros quadrados.

//Calcular: a área dos terrenos
//Criar: um programa
//Leia: o comprimento e a largura
//Imprima: a área total do terreno em metros quadrados

public class Atividade03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double largura, comprimento, areaTotal;

        System.out.println("Digite a largura do terreno: ");
        largura = scanner.nextDouble();

        System.out.println("Digite o comprimento do terreno: ");
        comprimento = scanner.nextDouble();

        areaTotal = comprimento * largura;
        System.out.printf("A área total do terreno é: %.2fm²", areaTotal);
    }
}
