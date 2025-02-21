package Lista03;

public class Tabuleiro {
    public static void main(String[] args) {
        int tamanho = 6;
        String reset = "\u001B[0m";
        String fundoAzul = "\u001B[41m";

        System.out.print("  ");
        for (int i = 1; i <= tamanho; i++) {
            System.out.print(" " + i + "   ");
        }
        System.out.println();

        for (int i = 1; i <= tamanho; i++) {
            System.out.print(i + " ");
            for (int j = 1; j <= tamanho; j++) {
                System.out.print(fundoAzul + " 7F " + reset + " ");
            }
            System.out.println();
        }
    }
}
