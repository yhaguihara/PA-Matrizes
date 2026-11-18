package prjMatriz;

import java.util.Random;

public class MaiorMenorMatriz {

    public static void main(String[] args) {

        Random sorteio = new Random();
        final int LIN = 3;
        final int COL = 3;
        int m[][], i, j, maior, menor;
        int linMaior = 0, colMaior = 0, linMenor = 0, colMenor = 0;
        m = new int[LIN][COL];

        for (i = 0; i < LIN; i++) {
            for (j = 0; j < COL; j++) {
                m[i][j] = sorteio.nextInt(100);
            }
        }

        System.out.println("Matriz:");
        for (i = 0; i < LIN; i++) {
            for (j = 0; j < COL; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

        maior = m[0][0];
        menor = m[0][0];
        for (i = 0; i < LIN; i++) {
            for (j = 0; j < COL; j++) {
                if (m[i][j] > maior) {
                    maior = m[i][j];
                    linMaior = i;
                    colMaior = j;
                }
                if (m[i][j] < menor) {
                    menor = m[i][j];
                    linMenor = i;
                    colMenor = j;
                }
            }
        }

        System.out.println("\nMaior valor: " + maior + " - linha " + (linMaior + 1) + ", coluna " + (colMaior + 1));
        System.out.println("Menor valor: " + menor + " - linha " + (linMenor + 1) + ", coluna " + (colMenor + 1));
    }
}