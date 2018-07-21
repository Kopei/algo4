
import edu.princeton.cs.algs4.StdOut;

public class Exec_1_1_3 {

    public static void main(String[] args){
        if (Integer.parseInt(args[0]) == Integer.parseInt(args[1]) && Integer.parseInt(args[1]) == Integer.parseInt(args[2]))
        {
            StdOut.println("equal");
        }
        else{
            StdOut.println("not equal");
        }
    }
}