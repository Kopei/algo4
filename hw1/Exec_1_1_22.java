package hw1;
import edu.princeton.cs.algs4.StdIn;

public class Exec_1_1_22 {
    public static void main(String[] args){
        int k = Integer.parseInt(args[0]);
        rank(k);
    }

    public static int rank(int k){
        int[] L = {1,3,4,6,7,8,9,11,12,14,15,16,19};
        return rank(L, k ,0, L.length-1, 0);
    }

    public static int rank(int[] L, int k, int lo, int hi, int depth){
        int mid = (hi+lo)/2;
        if(lo > hi) return -1;

        if(L[mid] == k) return mid;
        else if(k > L[mid]) {
            depth++;
            String format = "%s %" + depth + "s"+" %" + depth + "s";
            System.out.printf(format, depth, lo, hi);
            System.out.println();
            return rank(L, k, mid+1, hi, depth);
        }
        else {
            depth++;
            String format = "%s %" + depth + "s"+" %" + depth + "s";
            System.out.printf(format, depth, lo, hi);
            System.out.println();
            return rank(L, k, lo, mid-1, depth++);
        }
    }


}