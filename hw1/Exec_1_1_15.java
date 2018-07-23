package hw1;
public class Exec_1_1_15 {
    public static void main(String[] args){
        int[] A = {1,3,3,1,6,8,5,5,3,2,1};
        int M = Integer.parseInt(args[0]);
        int[] N = new int[M];
        for(int i=0; i < M; i++){
            N[i] = 0;
            for(int j=0; j<M; j++){
                if(A[j]==i) N[i] += 1;
            }
        }
        for(int i=0; i < M; i++) {
            System.out.println(N[i]);
        }
    }
}