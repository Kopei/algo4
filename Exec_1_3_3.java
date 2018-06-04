package edu.princeton.cs.algs4;

public class Exec_1_3_3 {
    public static boolean checkSequence(int[] v){
        int n = v.length;
        Stack<Integer> s = new Stack<Integer>();
        int[] result = new int[n];
        int j = 0, i=0;
        while( i <n && j <= n){
            if (v[i] == s.peek() && !s.isEmpty()){
                int temp = s.pop();
                System.out.println("pop is" + temp);
                result[i] = temp;
                i++;
            }
            else {
                if (j < n)s.push(j);
                j++;
            }
        }
        System.out.println(result == v);
        return result == v;
    }

    public static void main(String[] args){
        String[] a = StdIn.readAll().split("\\s+");
        System.out.println(a);
        int[] v = new int[a.length];
        for(int i=0; i<a.length; i++){
            v[i] = Integer.parseInt(a[i]);
        }
        checkSequence(v);
    }
}