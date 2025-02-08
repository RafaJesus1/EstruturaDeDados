package Lista02;

//Dessa vez, lhe iludiram e disseram que iam pagar para você fazer um programa, mas no fundo
//você sabe que não vai receber. Você foi contratado para criar um programa de promoção do dia
//1
//do consumidor. Basicamente, você vai ler o total da compra de um consumidor e aplicar o
//desconto conforme abaixo:
//total compra desconto
//< 50,00 5%
//< 100,00 10%
//< 200,00 20%
//< 500,00 25%
//>= 500, 00 30%
//Por fim, você deve imprimir o valor total da compra após o desconto

import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalCompra, desconto;

        System.out.println("Digite o total da compra: ");
        totalCompra = scanner.nextDouble();

        if (totalCompra < 50.00) {
            desconto = totalCompra * 0.05;
        } else if (totalCompra < 100.00) {
            desconto = totalCompra * 0.10;
        } else if (totalCompra < 200.00) {
            desconto = totalCompra * 0.20;
        } else if (totalCompra < 500.00) {
            desconto = totalCompra * 0.25;
        } else {
            desconto = totalCompra * 0.30;
        }

        System.out.printf("Total da compra: R$%.2f\nDesconto: R$%.2f\nTotal com desconto: R$%.2f", totalCompra, desconto, totalCompra - desconto);
    }
}
