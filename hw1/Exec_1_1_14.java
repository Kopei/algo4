package hw1;
public class Exec_1_1_14 {
    public static void main(String[] args){
        int N = Integer.parseInt(args[0]);
        int i = 0;
        while(N>1){
            N = N/2;
            if(N >=1){
                i++;
            }
        }
        System.out.println(i);
    }
}