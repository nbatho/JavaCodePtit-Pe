import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeMap;

public class J07006SoKhacNhauTrongFile3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
        ois.close();

        TreeMap<Integer, Integer> mp = new TreeMap<>();
        for (int x : list) {
            mp.put(x, mp.getOrDefault(x, 0) + 1);
        }

        for (int key : mp.keySet()) {
            System.out.println(key + " " + mp.get(key));
        }
    }
}
