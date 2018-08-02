package hw1;
import edu.princeton.cs.algs4.StdIn;

public class Exec_1_1_23 {
    public static void main(String[] args){
        int[] whitelist = {1,3,5,7,8,11,21,23,45,56,75,78};
        String flag = args[0];
        System.out.println(flag);
        int ret;
        while(!StdIn.isEmpty()){
            int key = StdIn.readInt();
            ret = BinarySearch(key, whitelist);
            if(ret < 0 && flag.equals("+")){
                System.out.println(key);
            }
            else if(ret > 0 && flag.equals("-")){
                System.out.println(key);
            }
        }

    }

    public static int BinarySearch(int key, int[] L){
        int lo = 0;
        int hi = L.length - 1;
        return BinarySearch(key, L, lo, hi);
    }
    public static int BinarySearch(int k, int[] L, int lo, int hi){
        if(lo > hi) return -1;
        int mid = (lo + hi)/2;
        if(L[mid] == k){
            return mid;
        }
        else if(L[mid] > k){
            hi = mid - 1;
            return BinarySearch(k, L, lo, hi);
        }
        else{
            lo = mid + 1;
            return BinarySearch(k, L, lo, hi);
        }
    }
}