package hw1;
import java.util.Random;

public class Exec_1_1_11 {
    public static void main(String[] args){
        String T = "*";
        String F = "";
        Boolean[][] A;
        int N =10, M = 10;
        A = new Boolean[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                A[i][j] = getRandomBoolean();
                if (A[i][j]){
                    System.out.println(T);
                }
                else System.out.println(F);
            }
        }


    }

    public static boolean getRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }
}