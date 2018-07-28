package hw1;
import edu.princeton.cs.algs4.StdIn;
public class Exec_1_1_21 {
    // java hw1.Exec_1_1_21 < Exec_1_1_21.txt
    public static void main(String[] args) {

        System.out.printf("%8s %7s %7s %7s", "Names", "Number1", "Number2", "Result\n");

        while(StdIn.hasNextLine()) {
            String[] s = StdIn.readLine().split(" ");
            System.out.printf("%8s", s[0]);
            System.out.printf("%7s", s[1]);
            System.out.printf("%7s", s[2]);
            System.out.printf("%7.3f", Double.parseDouble(s[1]) / Double.parseDouble(s[2]));
            System.out.println();
        }

    }
}