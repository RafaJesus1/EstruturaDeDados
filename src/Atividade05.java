import java.util.Scanner;

//Você quer viajar para fora do Brasil, mas ainda não escolheu o seu destino. Você está em dúvida
//entre Europa, Canadá, Estados Unidos e Argentina. Você sabe que as moedas nessas regiões são:
//euro, dólar canadense, dólar americano, peso argentino. Você queria um programa que você
//desse o valor que deseja levar e as cotações do dia de cada moeda e imprimisse quanto em cada
//moeda você teria. Então, resolveu que faria esse programa para você e sua mãe verem quanto de
//dinheiro teriam em cada região.

//

public class Atividade05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double euro, dolarCanadense, dolarAmericano, pesoArgentino, seuDinheiro;
        euro = 6.0524;
        dolarCanadense = 4.0225;
        dolarAmericano = 5.8410;
        pesoArgentino = 0.005600;

        System.out.println("Quanto de dinheiro você quer converter: ");
        seuDinheiro = scanner.nextDouble();

        System.out.printf("Seu dinheiro em real (R$%.2f) convertido nos câmbios estrangeiros: \nEUR: €%.2f\nCAD: C$%.2f\nUSD: $%.2f\nARS: $%.2f ", seuDinheiro, seuDinheiro/euro, seuDinheiro/dolarCanadense, seuDinheiro/dolarAmericano, seuDinheiro/pesoArgentino);


    }
}
