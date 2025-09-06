import java.util.*;

public class JKT015GoBanPhim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Deque<Character> left = new ArrayDeque<>();
        Deque<Character> right = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '-') {
                if (!left.isEmpty()) left.pollLast();
            } else if (c == '<') {
                if (!left.isEmpty()) right.addFirst(left.pollLast());
            } else if (c == '>') {
                if (!right.isEmpty()) left.addLast(right.pollFirst());
            } else {
                left.addLast(c);
            }
        }

        StringBuilder ans = new StringBuilder();
        for (char ch : left) ans.append(ch);
        for (char ch : right) ans.append(ch);

        System.out.println(ans.toString());
    }
}
