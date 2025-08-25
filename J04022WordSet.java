import java.util.Scanner;
import java.util.TreeSet;

public class J04022WordSet {
    static class WordSet {
        public TreeSet<String> set;
        public WordSet(String s) {
            set = new TreeSet<>();
            String[] r = s.toLowerCase().trim().split("\\s+");
            for (int i = 0 ;i < r.length;i++) {
                set.add(r[i]);
            }
        }
        public WordSet() {
            set = new TreeSet<>();
        }

        public WordSet union(WordSet b) {
            WordSet res = new WordSet();
            res.set = new TreeSet<>(this.set); 
            res.set.addAll(b.set);             
            return res;
        }
        public WordSet intersection(WordSet b) {
            WordSet res = new WordSet();
            for (String x: this.set) {
                if (b.set.contains(x)) {
                    res.set.add(x);
                }
            }

            return res;
        }
        public String toString() {
            String res = "";
            for (String x : this.set) {
                res += x + " ";
            }
            return res;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
