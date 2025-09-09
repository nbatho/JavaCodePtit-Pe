import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class J07030CapSoNguyenToTrongFile1 {
    static boolean[] prime = new boolean[1000001];

    static void sieve() {
        for (int i = 2; i <= 1000000; i++) prime[i] = true;
        for (int i = 2; i * i <= 1000000; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= 1000000; j += i) {
                    prime[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        sieve();

        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> ls1 = (ArrayList<Integer>) ois1.readObject();
        ois1.close();

        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> ls2 = (ArrayList<Integer>) ois2.readObject();
        ois2.close();


        TreeSet<Integer> set1 = new TreeSet<>(ls1);

        HashSet<Integer> set2 = new HashSet<>(ls2);

        for (int n : set1) {
            int m = 1000000 - n;
            if (n < m && prime[n] && prime[m] && set2.contains(m)) {
                System.out.println(n + " " + m);
            }
        }
    }
}
