import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class J07009LopIntSet2 {
    static class IntSet {
        public TreeSet<Integer> set;

        public IntSet(int[] arr) {
            set = new TreeSet<>();
            for (int i:arr) {
                set.add(i);
            }
        }
        public IntSet() {
            set = new TreeSet<>();
        }
        public IntSet intersection(IntSet b) {
            IntSet res = new IntSet();
            for (int x:this.set) {
                if (b.set.contains(x)) {
                    res.set.add(x);
                }
            }
            return res;
        }
        public String toString() {
            String res = "";
            for (int x : this.set) {
                res += x + " ";
            }
            return res;
        }
            
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}
