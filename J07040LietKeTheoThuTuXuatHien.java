import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class J07040LietKeTheoThuTuXuatHien {
    public static void main(String[] args) throws Exception {
        File vb = new File("VANBAN.in");
        Scanner s = new Scanner(vb);

        ObjectInputStream np = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));

        HashSet <String> b = new HashSet<>();
        ArrayList <String> a = (ArrayList<String>) np.readObject();
        for (String i:a) {
            for (String j : i.trim().split("\\s+")) {
                b.add(j.toLowerCase());
            }
        }

        LinkedHashSet <String> ans = new LinkedHashSet<>();
        while (s.hasNext()) {
            String token = s.next().toLowerCase();
            if (b.contains(token)) {
                ans.add(token);
            }
        }

        for (String i:ans) {
            if (b.contains(i)) {
                System.out.println(i);
            }
        }
        
        s.close();
        np.close();
        

    }
}