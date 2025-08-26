import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

public class J07005SoKhacNhauTrongFile2 {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream f = new FileInputStream("DATA.IN");
            DataInputStream is = new DataInputStream(f);
            HashMap <Integer, Integer> mp = new HashMap <>();
            for (int i = 0 ;i < 100000;i++) {
                int x = is.readInt();
                if (mp.get(x) == null) mp.put(x, 1);
                else mp.put(x,mp.get(x) + 1);
            }
            for (int i: mp.keySet()) {
                System.out.println(i + " " + mp.get(i));
            }
        } catch (Exception e) {
        }
    }
}
