import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class J07017LopPair {
    static class Pair<T,U>{
        T f;
        U s;
        Pair(T x,U y) {
            f = x;
            s = y;
        }
        private boolean isPrimeNumber(int n) {
            if (n < 2) return false;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) return false;
            }
            return true;
        }

        public boolean isPrime() {
            if (f instanceof Integer && s instanceof Integer) {
                int x = (Integer) f;
                int y = (Integer) s;
                return isPrimeNumber(x) && isPrimeNumber(y);
            }
            return false;
        }

        @Override
        public String toString() {
            return f + " " + s;
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
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
