package Lista03;

//O zoom é uma plataforma de busca dos preços mais baixos da web para um mesmo produto. Ele
//além de mostrar o menor valor encontrado, apresenta também o preço médio do produto nos
//últimos trinta dias. Para encontrar o menor preço, o programa lê 6 preços durante o mês e
//encontra o menor deles. Você deve encontrar o menor preço do produto durante o mês.


//FONTE: https://stackoverflow.com/questions/38317574/how-do-you-find-a-maximum-or-minimum-double-from-a-set

import java.util.Scanner;

public class Atividade39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double precoProduto;
        int qntdPrecos = 6;
        double menorValor = Double.MAX_VALUE;

        for (int i = 0; i < qntdPrecos; i++) {
            System.out.printf("Digite o valor do %d° produto: ", i + 1);
            precoProduto = sc.nextDouble();

            if (precoProduto < menorValor) {
                menorValor = precoProduto;
            }
        }

        System.out.printf("O menor valor entre os produtos é: R$%.2f reais.", menorValor);
    }
}
