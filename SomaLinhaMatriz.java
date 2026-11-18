package prjMatriz;

import java.util.Scanner;

public class SomaLinhaMatriz {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int LIN = 3;
        final int COL = 4;
        int m[][], i, j, soma;
        m = new int[LIN][COL];

        for (i = 0; i < LIN; i++) {
            soma = 0;
            for (j = 0; j < COL - 1; j++) {
                System.out.println("Digite o valor da linha " + (i + 1) + " e coluna " + (j + 1) + ": ");
                m[i][j] = in.nextInt();
                soma = soma + m[i][j];
            }
            m[i][COL - 1] = soma;
        }

        System.out.println("\nMatriz:");
        for (i = 0; i < LIN; i++) {
            for (j = 0; j < COL; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
}