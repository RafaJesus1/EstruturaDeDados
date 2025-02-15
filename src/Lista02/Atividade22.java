package Lista02;
import java.util.Scanner;

//Parabéns! Esse é o seu primeiro dia no estágio na rede de hotéis: DOM. O seu supervisor de
//estágio passou uma demanda que eles estão tendo em produção. As datas não estão sendo
//validadas corretamente pela função da API, então, ele resolveu pedir a você que desenvolvesse
//um programa que validasse a data. Você deve ler o dia, o mês e o ano e ao fim imprimir se a data é
//válida ou não. Não esqueça de verificar se o ano é bissexto ou não (se for bissexto, o mês de
//fevereiro terá 29 dias).
                    //  1       3       5      7      8       10        12
//Meses com 31 dias - Janeiro, Março, Maio, Julho, Agosto, Outubro e Dezembro
                    //  4      6        9         11
//Meses com 30 dias - Abril, Junho, Setembro e Novembro

public class Atividade22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia, mes, ano;
        boolean anoBissexto, dataValida;

        System.out.println("Digite o dia: ");
        dia = sc.nextInt();
        System.out.println("Digite o mês: ");
        mes = sc.nextInt();
        System.out.println("Digite o ano: ");
        ano = sc.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0 ) || (ano % 400 == 0)) {
            System.out.printf("O ano %d é bissexto.\n", ano);
            anoBissexto = true;
        } else {
            System.out.printf("O ano %d não é bissexto.\n", ano);
            anoBissexto = false;
        }

        if (dia < 1 || dia > 31) {
            dataValida = false;
        } else if (mes < 1 || mes > 12) {
            dataValida = false;
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia < 31) {
            dataValida = true;
        } else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)) {
            dataValida = true;
        } else if ((mes == 2 && anoBissexto && dia <= 29) || (mes == 2 && !anoBissexto && dia <= 28 )) {
            dataValida = true;
        } else {
            dataValida = false;
        }

        if (dataValida) {
            System.out.printf("%d/%d/%d é um ano válido!\n", dia, mes, ano);
        } else {
            System.out.printf("%d/%d/%d não é um ano válido!\n", dia, mes, ano);
        }

    }
}
