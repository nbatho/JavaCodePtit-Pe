import java.util.*;

public class J08011LietKeVaDem {
    static class Pair {
        String k;
        int v;
        int pos;

        Pair(String x, int y, int p) {
            k = x;
            v = y;
            pos = p;
        }
        void update(int y) {
            v = y;
        }
        public String toString() {
            return k + " " + v;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Pair> mp = new LinkedHashMap<>();
        int idx = 0; 

        while (sc.hasNext()) {
            String x = sc.next();
            boolean valid = true;
            for (int i = 0; i < x.length() - 1; i++) {
                if (x.charAt(i) > x.charAt(i + 1)) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                if (!mp.containsKey(x)) {
                    mp.put(x, new Pair(x, 1, idx++));
                } else {
                    Pair a = mp.get(x);
                    a.update(a.v + 1);
                }
            }
        }

        ArrayList<Pair> list = new ArrayList<>(mp.values());
        list.sort((a, b) -> {
            if (a.v != b.v) return Integer.compare(b.v, a.v);
            return Integer.compare(a.pos, b.pos);
        });

        for (Pair a : list) {
            System.out.println(a);
        }
    }
}
