package prjMatriz;

public class DobroMatriz {

    public static void main(String[] args) {

        final int LIN = 4;
        final int COL = 4;
        int m[][], i, j, valor = 2;
        m = new int[LIN][COL];

        for (i = 0; i < LIN; i++) {
            for (j = 0; j < COL; j++) {
                m[i][j] = valor;
                valor = valor * 2;
            }
        }

        System.out.println("Matriz:");
        for (i = 0; i < LIN; i++) {
            for (j = 0; j < COL; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
}