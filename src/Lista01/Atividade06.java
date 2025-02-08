package Lista01;

import java.util.Scanner;

//O Bar do Boca é um bar conhecido na sua cidade. Todas as sextas-feiras, o bar tem música ao vivo
//e um novo cardápio a cada mês. O dono do bar, Boca, não sabe mais o que fazer com as contas
//que são fechadas erradas, pois os garçons esquecem de adicionar a taxa de couvert ou esquecem
//que a gorjeta sai de 10% para 20%. Você que conhece o Boca há muito tempo resolveu ajudá-lo.
//Você vai fazer um programa que ler o total da conta e acrescenta 20% da gorjeta e a taxa fixa do
//couvert

//fazer = um programa
//ler = o total da conta e acrescenta 20% da gorjeta e a taxa fixa do couvert

public class Atividade06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalCompra, gorjeta, taxaCouvert;
        taxaCouvert = 15.00;

        System.out.println("Digite o total da compra: ");
        totalCompra = scanner.nextDouble();

        gorjeta = totalCompra * 0.2;

        System.out.printf("Total da compra: R$%.2f\nGorjeta: RS%.2f\nCouvert: R$%.2f\nTotal com acréscimos: R$%.2f", totalCompra, gorjeta, taxaCouvert, totalCompra + gorjeta + taxaCouvert );



    }
}
