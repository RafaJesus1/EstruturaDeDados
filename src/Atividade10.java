import java.util.Scanner;

//Uma loja de tintas deseja informar para os clientes o melhor custo-benefício na compra de suas
//tintas. Você foi contratado para desenvolver um programa que deverá pedir o tamanho em
//metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6
//metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em
//galões de 3,6 litros, que custam R$ 25,00. Informe ao usuário as quantidades de tinta a serem
//compradas e os respectivos preços em 3 situações:
//a. comprar apenas latas de 18 litros;
//b. comprar apenas galões de 3,6 litros;
//c. misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10%
//de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.

//Desenvolver: um programa
//Pedir: o tamanho em metros quadrados da área a ser pintada
//Considere: cobertura de tinta é de 1 litro para cada 6 metros quadrado e que a tinta é vendida em latas de 18 litros


public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double comprimento, largura, area;
        double lataDe18Litros = 18 * 6;
        double galaoDe36Litros = 3.6 * 6;

        System.out.println("Digite a largura da parede: ");
        largura = scanner.nextDouble();

        System.out.println("Digite o comprimento da parede: ");
        comprimento = scanner.nextDouble();

        area = comprimento * largura;
        System.out.printf("A área total da parede é: %.2fm²\n", area);

        double quantidadeDeLatas = area / lataDe18Litros;
        double quantidadeDeGaloes = area / galaoDe36Litros;
        double precoLatas = 80.00;
        double precoGaloes = 25.00;

        System.out.printf("Na situação de comprar apenas latas de 18 litros, precisará de: %.0f latas e pagará R$%.2f reais\nComprando apenas galões de 3,6 litros: %.0f galões e pagará R$%.2f reais", quantidadeDeLatas, quantidadeDeLatas * precoLatas, quantidadeDeGaloes, quantidadeDeGaloes * precoGaloes);

    }
}
