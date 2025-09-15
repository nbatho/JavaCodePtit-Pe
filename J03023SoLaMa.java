import java.util.Scanner;

public class J03023SoLaMa {
    static int[] val = {1,5,10,50,100,500,1000};
    static String s = "IVXLCDM";

    static int findPos(char c) {
        for (int i = 0; i < 7; i++) {
            if (s.charAt(i) == c) return i;
        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        while (tc-- > 0) {
            String n = sc.next();
            int res = val[findPos(n.charAt(n.length() - 1))];

            for (int i = n.length() - 2; i >= 0; i--) {
                int pos1 = findPos(n.charAt(i + 1));
                int pos2 = findPos(n.charAt(i));
                if (val[pos2] < val[pos1]) {
                    res -= val[pos2];
                } else {
                    res += val[pos2];
                }
            }

            System.out.println(res);
        }
    }
}
