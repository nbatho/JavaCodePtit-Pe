import java.util.Arrays;
import java.util.Scanner;

public class J03009TapTuRiengCuaHaiXau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        sc.nextLine();
        while (tc-- > 0) {
            String a = sc.nextLine();
            String b = sc.nextLine();

            int idx1 = 0, idx2 = 0;
            String[] c = new String[200];
            String[] d = new String[200];

            String tmp = "";
            for (int i = 0; i < a.length(); i++) {
                char chu = a.charAt(i);
                if (chu >= 'a' && chu <= 'z') {
                    tmp += chu;
                } else {
                    if (!tmp.isEmpty()) {
                        boolean exists = false;
                        for (int j = 0; j < idx1; j++) {
                            if (c[j].equals(tmp)) {
                                exists = true;
                                break;
                            }
                        }
                        if (!exists) {
                            c[idx1++] = tmp;
                        }
                        tmp = "";
                    }
                }
            }
            if (!tmp.isEmpty()) {
                boolean exists = false;
                for (int j = 0; j < idx1; j++) {
                    if (c[j].equals(tmp)) {
                        exists = true;
                        break;
                    }
                }
                if (!exists) {
                    c[idx1++] = tmp;
                }
            }

            String tmp2 = "";
            for (int i = 0; i < b.length(); i++) {
                char chu = b.charAt(i);
                if (chu >= 'a' && chu <= 'z') {
                    tmp2 += chu;
                } else {
                    if (!tmp2.isEmpty()) {
                        boolean exists = false;
                        for (int j = 0; j < idx2; j++) {   
                            if (d[j].equals(tmp2)) {
                                exists = true;
                                break;
                            }
                        }
                        if (!exists) {
                            d[idx2++] = tmp2;
                        }
                        tmp2 = "";
                    }
                }
            }
            if (!tmp2.isEmpty()) {
                boolean exists = false;
                for (int j = 0; j < idx2; j++) {
                    if (d[j].equals(tmp2)) {
                        exists = true;
                        break;
                    }
                }
                if (!exists) {
                    d[idx2++] = tmp2;
                }
            }

            Arrays.sort(c, 0, idx1);
            Arrays.sort(d, 0, idx2);

          
            for (int i = 0; i < idx1; i++) {
                boolean inB = false;
                for (int j = 0; j < idx2; j++) {
                    if (c[i].equals(d[j])) {
                        inB = true;
                        break;
                    }
                }
                if (!inB) {
                    System.out.print(c[i] + " ");
                }
            }
            System.out.println();
        }
    }
}
