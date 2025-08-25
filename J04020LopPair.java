import java.util.Scanner;
public class J04020LopPair {
    static boolean prime(Integer n) {
        for (int i = 2; i*i <= n;i++) {
            if (n % i == 0 ) return false;
        }
        return n > 1;
    }
    static class Pair<U,V> {
        public Integer x;
        public Integer y;

        public Pair(Integer a,Integer b) {
            x = a;
            y = b;
        }
        public boolean isPrime() {
            return prime(x) && prime(y);
        }
        @Override
        public String toString() {
            return x + " " + y;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
