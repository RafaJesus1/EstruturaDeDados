import java.util.Scanner;

//Você trabalha em um supermercado e no caixa que você trabalha o consumidor só pode comprar
//um único produto, mesmo que várias unidades repetidas. Você deseja otimizar o seu trabalho e
//criar um programa que leia o preço do produto e a quantidade de itens comprados e informe o
//total da compra para o usuário.


// Deseja: otimizar
// Criar: um programa
// Leia: o preço do produto e a quantidade de itens comprados
// Informe: o total da compra para o usuário

public class Atividade01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double preco, total;
        int quantidade;

        System.out.println("Digite o preço do produto: ");
        preco = scanner.nextDouble();

        System.out.println("Digite a quantidade de itens comprados: ");
        quantidade = scanner.nextInt();

        total = preco * quantidade;
        System.out.printf("O total da compra é: R$%.2f", total);


    }

}
