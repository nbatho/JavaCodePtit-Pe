import java.io.*;
import java.util.*;

public class J07071TenVietTat {
    static class Name {
        String ho, dem, ten;
        String rgName;

        Name(String s) {
            String[] tmp = s.trim().split("\\s+");
            ho = tmp[0];
            ten = tmp[tmp.length - 1];

            StringBuilder demBuilder = new StringBuilder();
            StringBuilder rgBuilder = new StringBuilder();


            rgBuilder.append(Character.toUpperCase(ho.charAt(0))).append(".");


            for (int i = 1; i < tmp.length - 1; i++) {
                demBuilder.append(tmp[i]).append(" ");
                rgBuilder.append(Character.toUpperCase(tmp[i].charAt(0))).append(".");
            }

       
            rgBuilder.append(Character.toUpperCase(ten.charAt(0)));

            dem = demBuilder.toString().trim();
            rgName = rgBuilder.toString();
        }

        @Override
        public String toString() {
            if (dem.isEmpty()) return ho + " " + ten;
            return ho + " " + dem + " " + ten;
        }
    }

 
    static boolean match(String pattern, String target) {
        if (pattern.length() != target.length()) return false;
        int starCount = 0;
        for (int i = 0; i < pattern.length(); i++) {
            char pc = pattern.charAt(i);
            if (pc == '*') {
                starCount++;
                if (starCount > 1) return false;
            } else if (pc != target.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("DANHSACH.in"));

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Name> ls = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ls.add(new Name(sc.nextLine()));
        }

        int m = Integer.parseInt(sc.nextLine());
        while (m-- > 0) {
            String pattern = sc.nextLine().trim();
            ArrayList<Name> ans = new ArrayList<>();

            for (Name a : ls) {
                if (match(pattern, a.rgName)) {
                    ans.add(a);
                }
            }

            ans.sort((a, b) -> {
                if (a.ten.equals(b.ten)) return a.ho.compareTo(b.ho);
                return a.ten.compareTo(b.ten);
            });

            for (Name a : ans) {
                System.out.println(a);
            }
        }
    }
}
