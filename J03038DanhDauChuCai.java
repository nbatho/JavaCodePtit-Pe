
import java.util.HashMap;
import java.util.Scanner;

public class J03038DanhDauChuCai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0 ;i < s.length();i++) {
            char c = s.charAt(i);
            mp.put(c,1);
        }
        System.out.println(mp.size());

    }
}
