package Lista03;

//A professora Alice precisa calcular a média das notas dos seus alunos. Os alunos possuem quatro
//notas bimestrais. A média final do aluno é a média aritmética das notas. Calcule e imprima a
//média de um aluno

import java.util.Scanner;

public class Atividade33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int notasBimestre = 4;
        double notas;
        double media = 0;

        for (int i = 1; i < notasBimestre; i++) {
            System.out.printf("Digite a %d° nota do aluno: ", i + 1);
            notas = sc.nextDouble();
            notas /= notasBimestre;
            media += notas;
        }

        System.out.printf("Media do aluno: %.2f", media);
    }
}
