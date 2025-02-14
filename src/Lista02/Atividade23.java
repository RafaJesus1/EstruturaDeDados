package Lista02;
import java.util.Scanner;

//Esse desafio vai exigir de você um pouco de curiosidade, eu já lhe aviso. Como eu sou generoso,
//vou lhe deixar uma dica aqui. Bem, nesse desafio, você deve informar se a data do dia faz parte
//da primavera ou do outono. Um dia está na primavera se estiver entre 22/09 à 21/12 e o outono de
//datas entre 20/03 à 21/06.

public class Atividade23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia, mes;

        System.out.println("Digite o dia: ");
        dia = sc.nextInt();
        System.out.println("Digite o mês: ");
        mes = sc.nextInt();



        if (dia < 1 || dia > 31) {
            System.out.println("Data inválida!");
        } else if (mes < 1 || mes > 12) {
            System.out.println("Data inválida!");
        } else if ((dia >= 22 && mes == 9) || mes == 10 || mes == 11 || (mes == 12 && dia <= 21) ) {
            System.out.printf("A data %d/%d está na primavera!", dia, mes);
        } else if ((dia >= 20 && mes == 3) || mes == 4 || mes == 5 || (mes == 6 && dia <= 21)) {
            System.out.printf("A data %d/%d está no outono!", dia, mes);
        } else {
            System.out.println("A data está em outra estação!");
        }


    }
}


