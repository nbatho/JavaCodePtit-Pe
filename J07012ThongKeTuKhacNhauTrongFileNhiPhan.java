import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class J07012ThongKeTuKhacNhauTrongFileNhiPhan {
     public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
       
        ArrayList <String> s = (ArrayList<String>) ois.readObject();

     
        HashMap<String, Integer> map = new HashMap<>();


        for (String line:s) {
            String[] words = line.toLowerCase().trim().split("[^a-z0-9]");
            for (String w : words) {
                if (!w.isEmpty()) { 
                    map.put(w, map.getOrDefault(w, 0) + 1);
                }
            }
        }


        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());


        Collections.sort(list, (a, b) -> {
            if (!a.getValue().equals(b.getValue())) {
                return b.getValue() - a.getValue();
            }
            return a.getKey().compareTo(b.getKey());
        });

      
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
