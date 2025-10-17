import java.io.File;
import java.util.*;

public class J07011ThongKeTuKhacNhauTrongFileVanBan {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(new File("VANBAN.in"));

        int n = Integer.parseInt(sc.nextLine()); 
        HashMap<String, Integer> map = new HashMap<>();


        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().toLowerCase();
            String[] words = line.trim().split("[^a-z0-9]");
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

        sc.close();
    }
}
