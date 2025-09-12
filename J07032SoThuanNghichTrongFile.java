import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class J07032SoThuanNghichTrongFile {
    static boolean checkTN(int n) {
        String s = String.valueOf(n);

        if (s.length() % 2 == 0 || s.length() == 1) return false;

        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) - '0') % 2 == 0) return false;
        }

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {

        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> ls1 = (ArrayList<Integer>) ois1.readObject();
        ois1.close();

        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> ls2 = (ArrayList<Integer>) ois2.readObject();
        ois2.close();

   
        HashMap<Integer,Integer> freq = new HashMap<>();
        for (int v : ls1) freq.put(v, freq.getOrDefault(v, 0) + 1);
        for (int v : ls2) freq.put(v, freq.getOrDefault(v, 0) + 1);

        TreeSet<Integer> set1 = new TreeSet<>(ls1);
        HashSet<Integer> set2 = new HashSet<>(ls2);

        int cnt = 0;
        for (int n : set1) {
            if (set2.contains(n) && checkTN(n)) {
                System.out.println(n + " " + freq.get(n));
                cnt++;
                if (cnt == 10) break; 
            }
        }
    }
}
