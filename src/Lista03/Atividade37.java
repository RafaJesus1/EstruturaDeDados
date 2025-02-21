package Lista03;

//As empresas aéreas calculam o preço médio das suas bagagens considerando o peso médio das
//malas despachadas durante um ano. O valor de cada quilo corresponde a R$ 10,00. Você deve ler
//os pesos até que uma bagagem com peso zero seja informada. No final, exiba o peso médio das
//bagagens e o novo preço da bagagem.

//Cada quilo = 10 reais
//Ler os pesos até que uma bagagem com peso zero (do...while)
//Exibir o peso médio das bagagens e o novo preço (x quilo * 10 reais)

import java.util.Scanner;

public class Atividade37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double peso;
        double pesoMedio;
        double precoPorQuilo = 10.00;
        double pesoTotal = 0;
        int qntdBagagens = 0;

        do {
            qntdBagagens++;
            System.out.println("Digite o peso: ");
            peso = sc.nextDouble();
            System.out.printf("O peso da %d° bagagem: %.2f kg\n\n", qntdBagagens, peso);

            pesoTotal += peso;

        } while (peso != 0);

        pesoMedio = pesoTotal / qntdBagagens;
        double precoMedio = pesoMedio * precoPorQuilo;

        System.out.printf("O peso médio das bagagens: %.2f kg\nO preço será: R$%.2f reais.", pesoMedio, precoMedio);

    }
}
