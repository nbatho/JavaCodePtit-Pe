import java.util.*;

public class J08025QuayHinhVuong {
    static class Pair {
        String s;
        int step;
        Pair(String xau, int cnt) {
            s = xau;
            step = cnt;
        }
    }

    static String trai(String a) {
        char[] res = a.toCharArray();
        res[0] = a.charAt(3);
        res[1] = a.charAt(0);
        res[2] = a.charAt(2);
        res[3] = a.charAt(4);
        res[4] = a.charAt(1);
        res[5] = a.charAt(5);
        return new String(res);
    }

    static String phai(String a) {
        char[] res = a.toCharArray();
        res[0] = a.charAt(0);
        res[1] = a.charAt(4);
        res[2] = a.charAt(1);
        res[3] = a.charAt(3);
        res[4] = a.charAt(5);
        res[5] = a.charAt(2);
        return new String(res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        sc.nextLine();
        while (tc-- > 0) {
            StringBuilder sb1 = new StringBuilder();
            for (int i = 0; i < 6; i++) sb1.append(sc.nextInt());
            String s = sb1.toString();

            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < 6; i++) sb2.append(sc.nextInt());
            String e = sb2.toString();

            Queue<Pair> q = new ArrayDeque<>();
            Set<String> vs = new HashSet<>();
            q.add(new Pair(s, 0));
            vs.add(s);

            while (!q.isEmpty()) {
                Pair top = q.poll();

                if (top.s.equals(e)) {
                    System.out.println(top.step);
                    break;
                }

                String left = trai(top.s);
                String right = phai(top.s);

                if (!vs.contains(left)) {
                    vs.add(left);
                    q.add(new Pair(left, top.step + 1));
                }
                if (!vs.contains(right)) {
                    vs.add(right);
                    q.add(new Pair(right, top.step + 1));
                }
            }
        }
    }
}
