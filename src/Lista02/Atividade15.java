package Lista02;
import java.util.Scanner;

//The Asa’s Club é um clube da cidade e você está trabalhando na portaria dela. As regras para
//comprar ingressos para o clube são claramente machistas, mas elas são aplicadas. As mulheres
//que chegarem até as 22h não pagam a entrada, mas depois desse horário, elas pagam metade do
//valor do ingresso. Os homens que chegarem até as 22h pagam 70% do ingresso, enquanto depois
//desse horário pagam o valor integral. Você que não perdeu tempo, fez um programa para a
//portaria. Eu fico me perguntando porque tu se mete nessas coisas sem ganhar um centavo, mas
//tudo bem

// homem ou mulher
// até 22 ou depois das 22

public class Atividade15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String genero;
        int hora;

        System.out.println("Bem-vindo ao The Asa's Club!");
        System.out.println("Homem ou mulher?");
        genero = scanner.nextLine();
        System.out.println("Horário de chegada: ");
        hora = scanner.nextInt();

        if (genero.equalsIgnoreCase("Homem")) {
            if (hora > 22) {
                System.out.println("Como passou das 22h, você pagará valor integral");
            } else {
                System.out.println("Chegou no horário! Vai pagar somente 70% do valor do ingresso");
            }
        }

        if (genero.equalsIgnoreCase("Mulher")) {
                if (hora > 22) {
                    System.out.println("Pague somente metade do valor do ingresso");
                } else {
                    System.out.println("Mulher não paga nada aqui!");
                }
        }


    }
}
