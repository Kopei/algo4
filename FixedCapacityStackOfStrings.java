package edu.princeton.cs.algs4;
public class FixedCapacityStackOfStrings{
    private String[] s;
    private int n;
    public FixedCapacityStackOfStrings(int cap){
        s = new String[cap];
    }
    public boolean isEmpty(){ return n == 0;}
    public int size() {return n;}
    public void push(String item){
        s[n++] = item;
    }
    public String pop(){
        return s[--n];
    }

    public static void main(String[] args){
        FixedCapacityStackOfStrings s = new FixedCapacityStackOfStrings(100);
        while(!StdIn.isEmpty()){
            String item = StdIn.readString();
            StdOut.println("string item is "+ item);
            if(!item.equals("-")) s.push(item);
            else if (!s.isEmpty()) StdOut.print(s.pop() + " ");

        }
        StdOut.println("("+s.size()+" left on stack");
    }
}