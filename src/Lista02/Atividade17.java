package Lista02;
import java.util.Scanner;

//Você agora quer fazer um programa apenas para exercitar a sua lógica. Basicamente, você viu que
//o IBGE faz uma consulta de 5 preços para ver a média de preços. Você resolveu fazer o seguinte:
//ler os valores, calcular a média e verificar quais valores estão acima da média.

public class Atividade17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double preco1, preco2, preco3, preco4, preco5;
        double media;
        boolean acima = false;

        System.out.println("Digite o preço 1: ");
        preco1 = scanner.nextDouble();
        System.out.println("Digite o preço 2: ");
        preco2 = scanner.nextDouble();
        System.out.println("Digite o preço 3: ");
        preco3 = scanner.nextDouble();
        System.out.println("Digite o preço 4: ");
        preco4 = scanner.nextDouble();
        System.out.println("Digite o preço 5: ");
        preco5 = scanner.nextDouble();

        media = (preco1 + preco2 + preco3 + preco4 + preco5) / 5;

        if (preco1 > media){
            System.out.printf("O preço 1 (R$%.2f reais) está acima da média (%.2f reais).\n", preco1, media);
            acima = true;
        }
        if (preco2 > media){
            System.out.printf("O preço 2 (R$%.2f reais) está acima da média (%.2f reais).\n", preco2, media);
            acima = true;

        }
        if (preco3 > media){
            System.out.printf("O preço 3 (R$%.2f reais) está acima da média (%.2f reais).\n", preco3, media);
            acima = true;
        }
        if (preco4 > media){
            System.out.printf("O preço 4 (R$%.2f reais) está acima da média (%.2f reais).\n", preco4, media);
            acima = true;
        }
        if (preco5 > media){
            System.out.printf("O preço 5 (R$%.2f reais) está acima da média (%.2f reais).\n", preco5, media);
            acima = true;
        }
        if (!acima) {
            System.out.printf("Nenhum preço está acima da média (%.2f reais).", media);
        }
    }
}
