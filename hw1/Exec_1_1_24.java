package hw1;

public class Exec_1_1_24 {
    public static void main(String[] args) {
        int p = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);
        System.out.println(Euclid(p,q));
    }
    public static int Euclid(int p, int q){
        System.out.println(p+","+q);
        if(q == 0 || p == 0) return 1;
        if(p < q){
            int t = p;
            p = q;
            q = t;
        }
        if ( p % q == 0){
            return q;
        }
        else{
            return Euclid(q, p%q);
        }
    }
}