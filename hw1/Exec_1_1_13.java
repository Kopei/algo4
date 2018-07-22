package hw1;
import java.util.Random;
public class Exec_1_1_13 {
    public static void main(String[] args){
        int n=5, m=10;
        int[][] B = new int[n][m];
        int[][] B2 = new int[m][n];
        B = A(n,m);
        for(int i=0; i<n; i++){
            for(int j=0;j<m; j++){
                B2[j][i] = B[i][j];
            }
            System.out.println("");
        }
        for(int i=0; i<m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%s ", B2[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] A(int N, int M){
        Random r = new Random();
        int[][] A = new int[N][M];
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                A[i][j] = r.nextInt(3);
                System.out.printf("%s ", A[i][j]);
            }
            System.out.println();
        }
        return A;
    }
}