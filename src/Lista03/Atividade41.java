package Lista03;

//O dólar, assim como qualquer outra moeda relativamente estável, tem o seu valor flutuante. Uma
//empresa de câmbio normalmente monitora os valores máximos da cotação do dólar comercial
//para realizar transações no final do dia. Você deve ler os valores de cotação que são liberados de
//30 em 30 minutos das 08h da manhã até às 17h. Esses dados serão informados de uma única vez
//no final do dia corrente. Você deve ao fim exibir o valor máximo de cotação.

//horas vai ser double 8h30 =  8,30; pra dar 9 soma os 30 minutos que equivalem a 0,30

// De 8 pra 17 são 9 horas


public class Atividade41 {
    public static void main(String[] args) {

        double real = 5.696;
        double min = -0.10;
        double max = 0.10;
        double segundos = 1800;
        double cotacaoMaxima = Double.MIN_VALUE;

        do {
            double variancia = min + (Math.random() * (max - min));
            segundos = segundos + 1800;

            if (real > cotacaoMaxima) {
                cotacaoMaxima = real;
            }

            System.out.printf("O dólar está em R$%.2f reais.\nVariou: %.2f\n", real, variancia);
            real = real + variancia;


        } while (segundos != 61200);

        System.out.printf("A cotação máxima entre o período de 8h até 17h foi de: R$%.2f reais\n", cotacaoMaxima);
    }
}
