
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeMap;

public class J07015SoNguyenToTrongFileNhiPhan {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));

        ArrayList <Integer> list = (ArrayList<Integer>) ois.readObject();

        TreeMap<Integer, Integer> mp = new TreeMap<>();
        for (int x : list) {
            if (isPrime(x))
                mp.put(x, mp.getOrDefault(x, 0) + 1);
        }

        for (int key : mp.keySet()) {
            System.out.println(key + " " + mp.get(key));
        }
    }
}
