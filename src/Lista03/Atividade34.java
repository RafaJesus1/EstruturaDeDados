package Lista03;
import java.util.Scanner;

//A professora Alice precisa fazer o mesmo cálculo de médias de
//seus alunos, porém, ela precisa fazer isso para todos os seus 25 alunos.
//Calcule a média final para todos os 25 alunos.


public class Atividade34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int notasBimestre = 4;
        int qntdAluno = 1;
        double notas;
        double media = 0;

        do {
            for (int i = 1; i < notasBimestre; i++) {
                System.out.printf("Digite a %d° nota do aluno: ", i + 1);
                notas = sc.nextDouble();
                notas /= notasBimestre;
                media += notas;
        }
            System.out.printf("Média do %d° aluno: %.2f\n", qntdAluno, media);
            qntdAluno++;
        } while (qntdAluno < 25);
    }
}
