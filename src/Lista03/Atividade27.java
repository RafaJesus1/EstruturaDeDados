package Lista03;

//Par ou ímpar é uma forma tradicional de resolver alguns problemas quando você é criança, seja
//numa brincadeira ou em algum conflito. Como as duas mãos juntas temos dez dedos, como cada
//pessoa pode usar as duas mãos, vamos ter o máximo de 20 dedos. Então, vamos ensinar as
//crianças a contarem todos os números pares e ímpares entre 0 e 20.

public class Atividade27 {
    public static void main(String[] args) {

        for (int numerosDedos = 0; numerosDedos <= 20; numerosDedos++) {

            if ((numerosDedos) % 2 == 0) {
                System.out.printf("%d é par!\n", numerosDedos);
            } else {
                System.out.printf("%d é ímpar!\n", numerosDedos);
            }

        }
    }
}
