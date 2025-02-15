package Lista03;

//O zoom é uma plataforma de busca dos preços mais baixos da web para um mesmo produto. Ele
//além de mostrar o menor valor encontrado, apresenta também o preço médio do produto nos
//últimos trinta dias. Para encontrar o preço médio, o programa lê 6 preços durante o mês e calcula
//a média deles. Faça um programa que leia os 6 preços do produto e apresente o valor médio

//Ler os 6 preços dos produtos
//Apresentar o valor médio

import java.util.Scanner;

public class Atividade35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qntdProdutos = 6;
        double valorProduto;
        double valorMedio = 0;

        for (int i = 0; i < qntdProdutos; i++) {
            System.out.printf("Digite o valor do %d° produto: ", i + 1);
            valorProduto = sc.nextDouble();

            System.out.printf("O preço do %d° produto: R$%.2f\n\n", i + 1, valorProduto);

            valorProduto /= qntdProdutos;
            valorMedio += valorProduto;
        }

        System.out.printf("O valor médio dos produtos: R$%.2f\n", valorMedio);
    }
}
