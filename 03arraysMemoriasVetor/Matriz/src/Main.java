import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Linha e colunas: ");
        int c = sc.nextInt();
        int l = sc.nextInt();

        int[][] mat = new int[c][l];

        System.out.println("Digite os valores: ");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < l; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Type a number: ");
        int n = sc.nextInt();

        int up, down, left, right;

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < l; j++) {
                if (mat[i][j] == n) {
                    System.out.println("Position: " + i + "," + j);
                    if (j > 0) {
                        left = mat[i][j-1];
                        System.out.println("left: " + left);
                    }
                    if (j < l-1) {
                        right = mat[i][j+1];
                        System.out.println("Right: " + right);
                    }
                    if (i > 0) {
                        up = mat[i-1][j];
                        System.out.println("Up: " + up);
                    }
                    if (i < c) {
                        down = mat[i+1][j];
                        System.out.println("Down: " + down);
                    }
                }
            }

        }

        sc.close();
    }
}