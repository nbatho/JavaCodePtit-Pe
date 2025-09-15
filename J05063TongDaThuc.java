import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class J05063TongDaThuc {
    static class DaThuc {
        String a,ans;
        DaThuc(String x) {
            a = x;
        }
        public TreeMap<Integer,Integer> parse(String s) {
            TreeMap<Integer,Integer> mp = new TreeMap<>();
            String tmp = "";
            int idx = 0;
            ArrayList<Integer> hs = new ArrayList<>();
            ArrayList<Integer> mu = new ArrayList<>();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isDigit(c)) {
                    tmp += c;
                } else {
                    if (!tmp.equals("")) {
                        if (idx % 2 == 0) hs.add(Integer.parseInt(tmp));
                        else mu.add(Integer.parseInt(tmp));
                        idx++;
                    }
                    tmp = "";
                }
            }
            if (!tmp.equals("")) {
                if (idx % 2 == 0) hs.add(Integer.parseInt(tmp));
                else mu.add(Integer.parseInt(tmp));
            }

            for (int i = 0; i < mu.size(); i++) {
                int m = mu.get(i);
                int h = hs.get(i);
                mp.put(m, mp.getOrDefault(m, 0) + h);
            }
            return mp;
        }
        public DaThuc cong(DaThuc b) {
            String ans = "";
            TreeMap <Integer,Integer> mp1 = parse(a);
            TreeMap <Integer,Integer> mp2 = parse(b.a);
            TreeMap <Integer,Integer> mp = new TreeMap<>();
            for (Map.Entry<Integer, Integer> e : mp1.entrySet()) {
                int mu = e.getKey();      
                int hs = e.getValue();    
                if (mp.get(mu) == null) mp.put(mu,hs);
                else mp.put(mu,mp.get(mu) + hs);
            }
            for (Map.Entry<Integer, Integer> e : mp2.entrySet()) {
                int mu = e.getKey();      
                int hs = e.getValue();    
                if (mp.get(mu) == null) mp.put(mu,hs);
                else mp.put(mu,mp.get(mu) + hs);
            }
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<Integer,Integer> e : mp.descendingMap().entrySet()) {
                sb.append(e.getValue()).append("*x^").append(e.getKey()).append(" + ");
            }
            if (sb.length() >= 3) sb.setLength(sb.length() - 3);
            
            
            return new DaThuc(sb.toString());
        }

        @Override
        public String toString() {
            return a;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            DaThuc p = new DaThuc(sc.nextLine());
            DaThuc q = new DaThuc(sc.nextLine());
            DaThuc r = p.cong(q);
            System.out.println(r);
        }
    }
}
