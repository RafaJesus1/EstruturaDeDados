package Lista02;
import java.util.Scanner;

//Um baralho contém 52 cartas de 4 tipos (naipes) diferentes: paus, espadas, copas e ouro. Em cada
//naipe, que consiste de 13 cartas, 3 dessas cartas contêm as figuras do rei, da dama e do valete,
//respectivamente. Faça um programa que leia um número de 1 a 13 e informe qual carta o número
//representa por extenso. Lembrando que temos algumas cartas especiais: 1 (Ás), 11 (Jalete), 12
//(Rainha), 13 (Rei).

public class Atividade19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Digite um numero: ");
        numero = sc.nextInt();
        switch (numero) {
            case 1:
                System.out.print("Ás de paus\nÁs de espadas\nÁs de copas\nÁs de ouro");
                break;
            case 2:
                System.out.print("Dois de paus\nDois de espadas\nDois de copas\nDois de ouro");
                break;
            case 3:
                System.out.print("Três de paus\nTrês de espadas\nTrês de copas\nTrês de ouro");
                break;
            case 4:
                System.out.print("Quatro de paus\nQuatro de espadas\nQuatro de copas\nQuatro de ouro");
                break;
            case 5:
                System.out.print("Cinco de paus\nCinco de espadas\nCinco de copas\nCinco de ouro");
                break;
            case 6:
                System.out.print("Seis de paus\nSeis de espadas\nSeis de copas\nSeis de ouro");
                break;
            case 7:
                System.out.print("Sete de paus\nSete de espadas\nSete de copas\nSete de ouro");
                break;
            case 8:
                System.out.print("Oito de paus\nOito de espadas\nOito de copas\nOito de ouro");
                break;
            case 9:
                System.out.print("Nove de paus\nNove de espadas\nNove de copas\nNove de ouro");
                break;
            case 10:
                System.out.print("Dez de paus\nDez de espadas\nDez de copas\nDez de ouro");
                break;
            case 11:
                System.out.print("Jalete de paus\nJalete de espadas\nJalete de copas\nJalete de ouro");
                break;
            case 12:
                System.out.print("Rainha de paus\nRainha de espadas\nRainha de copas\nRainha de ouro");
                break;
            case 13:
                System.out.print("Rei de paus\nRei de espadas\nRei de copas\nRei de ouro");
                break;
        }

    }
}
