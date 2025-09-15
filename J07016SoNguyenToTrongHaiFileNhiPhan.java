import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;

public class J07016SoNguyenToTrongHaiFileNhiPhan {
    static boolean[] prime = new boolean[1000001];

    static void sieve() {
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
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

        Map<Integer, Integer> mp1 = new HashMap<>();
        Map<Integer, Integer> mp2 = new HashMap<>();

        for (int a : ls1) {
            mp1.put(a, mp1.getOrDefault(a, 0) + 1);
        }
        for (int a : ls2) {
            mp2.put(a, mp2.getOrDefault(a, 0) + 1);
        }

        ArrayList<Integer> common = new ArrayList<>();
        for (int a : mp1.keySet()) {
            if (mp2.containsKey(a) && prime[a]) {
                common.add(a);
            }
        }

        Collections.sort(common);

        for (int a : common) {
            System.out.println(a + " " + mp1.get(a) + " " + mp2.get(a));
        }
    }
}
