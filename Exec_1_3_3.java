
import java.util.Arrays;

public class Exec_1_3_3 {
    public static boolean checkSequence(int[] v){
        int n = v.length;
        Stack<Integer> s = new Stack<Integer>();
        int[] result = new int[n];
        int j = 0, i=0;
        while( i <n && j <= n){
            if (!s.isEmpty() && v[i] == s.peek()){
                int temp = s.pop();
                System.out.println("pop is" + temp);
                result[i] = temp;
                i++;
            }
            else {
                if (j < n) s.push(j);
                j++;
            }
        }
        System.out.println(result == v);
        return result == v;
    }

    public static void main(String[] args){
        int[] v = new int[10];
        int i = 0;
        for(String s: args){
            System.out.println(s);
            v[i] = Integer.parseInt(s);
            i++;
        }
        System.out.println(Arrays.toString(v));
        checkSequence(v);
    }
}