package prjMatriz;

import java.util.Random;
import java.util.Scanner;

public class BingoMatriz {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random sorteio = new Random();
        final int LIN = 4;
        final int COL = 4;
        int cartela[][], i, j, numero, acertos = 0, rodadas = 0;
        boolean marcada[][], usado[], achou;
        cartela = new int[LIN][COL];
        marcada = new boolean[LIN][COL];
        usado = new boolean[76];

        for (i = 0; i < LIN; i++) {
            for (j = 0; j < COL; j++) {
                do {
                    numero = sorteio.nextInt(75) + 1;
                } while (usado[numero]);
                usado[numero] = true;
                cartela[i][j] = numero;
            }
        }

        System.out.println("Cartela de bingo:");
        for (i = 0; i < LIN; i++) {
            for (j = 0; j < COL; j++) {
                System.out.printf("%02d  ", cartela[i][j]);
            }
            System.out.println();
        }

        while (acertos < LIN * COL) {
            System.out.println("\nDigite o número cantado: ");
            numero = in.nextInt();
            rodadas++;
            achou = false;
            for (i = 0; i < LIN; i++) {
                for (j = 0; j < COL; j++) {
                    if (cartela[i][j] == numero) {
                        achou = true;
                        if (!marcada[i][j]) {
                            marcada[i][j] = true;
                            acertos++;
                        }
                    }
                }
            }
            if (achou) {
                System.out.println("A cartela tem o número " + numero);
            } else {
                System.out.println("A cartela não tem o número " + numero);
            }
        }

        System.out.println("\nBINGO!");
        System.out.println("Rodadas: " + rodadas);
    }
}