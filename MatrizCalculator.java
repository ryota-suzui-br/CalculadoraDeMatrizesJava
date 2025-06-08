public class MatrizCalculator {

    public static void main(String[] args) {
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{5, 6}, {7, 8}};

        System.out.println("Soma:");
        imprimirMatriz(somar(A, B));

        System.out.println("Multiplicação:");
        imprimirMatriz(multiplicar(A, B));

        System.out.println("Determinante de A:");
        System.out.println(determinante2x2(A));
    }

    public static int[][] somar(int[][] m1, int[][] m2) {
        int[][] res = new int[2][2];
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                res[i][j] = m1[i][j] + m2[i][j];
        return res;
    }

    public static int[][] multiplicar(int[][] m1, int[][] m2) {
        int[][] res = new int[2][2];
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                res[i][j] = m1[i][0]*m2[0][j] + m1[i][1]*m2[1][j];
        return res;
    }

    public static int determinante2x2(int[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    public static void imprimirMatriz(int[][] m) {
        for (int[] linha : m) {
            for (int val : linha) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
} 
