package Lista03;

public class Atividade29 {
    public static void main(String[] args) {

        int altura = 15;

        for (int i = 1; i <= altura; i++) {
            int espacos = altura - i;

            for (int j = 1; j <= espacos; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }

    }
}
