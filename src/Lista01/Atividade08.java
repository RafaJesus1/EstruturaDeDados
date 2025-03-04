package Lista01;

import java.util.Scanner;

//O IBGE (Instituto Brasileiro de Geografia e Estatística) para definir um preço médio de um produto
//alimentar, por exemplo: o feijão, faz consulta a pelo menos 5 mercados de tamanhos variados.
//Após ler os valores dos 5 mercados, o instituto calcula o valor médio do produto. Diferente do que
//era praticado antes, atualmente, o IBGE utiliza um pequeno sistema para computar o preço
//médio. Você está trabalhando na equipe de TI do IBGE para calcular o preço médio dos produtos.
//Lembre-se de ler os cinco preços, calcular a média e exibir o resultado.

//Calcular: o preço médio dos produtos
//Ler: os cincos preços
//Exibir: o resultado

public class Atividade08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] precos = new double[5];
        String[] mercados = new String[5];
        mercados[0] = "Mercado Verão Tropical";
        mercados[1] = "Mercado Bom Preço";
        mercados[2] = "Mercado do Galego";
        mercados[3] = "Mercado do Barbosa";
        mercados[4] = "Mercado Aqui Tem";

        System.out.println("Digite os preços de 5 mercados: ");
        for (int i = 0; i < precos.length; i++) {
            System.out.printf("Preço do %s:", mercados[i]);
            precos[i] = scanner.nextDouble();
        }

        double media = 0;
        for (int i = 0; i < precos.length; i++) {
            media += precos[i];
        }

        media /= precos.length;

        System.out.printf("O preço médio dos produtos em diferentes mercados é: R$%.2f", media);

        
    }
}
