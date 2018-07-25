package hw1;
import java.lang.Math;
public class Exec_1_1_20 {
    public static void main(String[] args){
        int N = Integer.parseInt(args[0]);
        System.out.println(lg(N));
    }

    public static double lg(int N){
        if(N == 1) return 0;
        while (N > 1){

            return lg(N-1)+ln(N);
        }
        return -1;
    }

    public static double ln(int N){
        return Math.log(N) / Math.log(2);
    }
}