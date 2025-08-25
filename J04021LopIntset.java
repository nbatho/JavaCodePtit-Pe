
import java.util.Scanner;
import java.util.TreeSet;

public class J04021LopIntset {
    static class IntSet {
        public TreeSet<Integer> set;

        public IntSet(int[] arr) {
            set = new TreeSet<>();
            for (int i:arr) {
                set.add(i);
            }
        }
        public IntSet union(IntSet b) {
            for (int i:b.set) {
                this.set.add(i);
            }

            return this;
        }
        public String toString() {
            String res = "";
            for (int x : this.set) {
                res += x + " ";
            }
            return res;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
