package hw1;
import edu.princeton.cs.algs4.StdOut;

public class Exec_1_1_6 {

    public static void main(String[] args){
        int f = 0;
        int g = 1;
        for (int i=0; i<=15; i++)
        {
            f = f+g;
            StdOut.println("f is:"+f);
            g = f-g;
        }
    }
}
