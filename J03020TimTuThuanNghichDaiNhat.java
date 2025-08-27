
import java.util.LinkedHashMap;
import java.util.Scanner;
public class J03020TimTuThuanNghichDaiNhat {
    static boolean tn(String s) {
        for (int i = 0 ;i < s.length() / 2 ;i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap <String,Integer> mp = new LinkedHashMap<>();
        int maxLength = 0;
        while (sc.hasNext()) {
            String s = sc.next();
            if (tn(s)) {
                maxLength = Math.max(maxLength,s.length());
                mp.put(s, mp.getOrDefault(s, 0) + 1);
            }
        }
        for (String i: mp.keySet()) {
            if (i.length() == maxLength) {
                System.out.println(i + " " + mp.get(i));
            }
            }
    }
    
}
