import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class J07014HopVaGiao2VanBan{
    static class WordSet {
        public TreeSet<String> set;

        public WordSet(String filename) throws IOException {
            set = new TreeSet<>();
            Scanner sc = new Scanner(new File(filename));
            while (sc.hasNext()) {
                set.add(sc.next().toLowerCase());
            }
            sc.close();
        }

        public WordSet() {
            set = new TreeSet<>();
        }

  
        public WordSet union(WordSet b) {
            WordSet res = new WordSet();
            res.set.addAll(this.set);
            res.set.addAll(b.set);
            return res;
        }
        public WordSet intersection(WordSet b) {
            WordSet res = new WordSet();
            res.set.addAll(this.set);
            res.set.retainAll(b.set);
            return res;
        }

        

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (String x : set) {
                sb.append(x).append(" ");
            }
            return sb.toString().trim();
        }
    }

    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
