package Lista03;

//Em um supermercado é comum que no caixa os produtos sejam passados até que finalize-se a
//compra. Você deve fazer um programa que leia os preços dos produtos, até que o preço zero seja
//informado. O total da compra deve ser informado no final. Você deve, basicamente, somar todos
//os preços informados.

import java.util.Scanner;

public class Atividade31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double precoProduto;
        double totalCompra = 0;

        do {
            System.out.println("Digite o preço do produto: ");
            precoProduto = sc.nextDouble();
            totalCompra += precoProduto;
        } while (precoProduto != 0);

        System.out.printf("Total da compra: R$%.2f reais.", totalCompra);
    }
}
