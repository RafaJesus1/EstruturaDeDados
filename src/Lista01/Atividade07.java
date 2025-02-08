package Lista01;

import java.util.Scanner;

//Você saiu com seus amigos para ir ao cinema. Depois de assistirem o filme, vocês foram para um
//restaurante comemorar o aniversário de sua amiga, Alice. Na hora de pagar a conta, como sempre,
//foi aquele furdunço, divide daqui, divide dali. Então, você pensou: vou fazer um programa para
//calcular a conta por pessoa em um aniversário. Claro que a aniversariante não conta. Deste modo,
//você faria um programa que lesse o total da conta, divide-a pelo número de pessoas na mesa,
//menos o aniversariante. Depois, você só precisa exibir quanto cada um tem que pagar.

//Calcular: a conta por pessoa em um aniversário
//Ler: o total da conta
//Dividir: pelo número de pessoas na mesa, menos o aniversariante
//exibir: quanto cada um tem que pagar

public class Atividade07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aniversariante, quantidadePessoas;
        double totalConta, contaPorPessoa;
        aniversariante = 1;

        System.out.println("Digite o total da compra: ");
        totalConta = scanner.nextDouble();

        System.out.println("Digite o total de pessoas na mesa: ");
        quantidadePessoas = scanner.nextInt();

        contaPorPessoa = totalConta / (quantidadePessoas - aniversariante);
        System.out.printf("O total da compra é: R$%.2f\nPor pessoa ficará: R$%.2f", totalConta, contaPorPessoa);

    }
}
