import java.util.Scanner;

public class J02037DayUuThe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        sc.nextLine();
        while (tc != 0) {

            String s = sc.nextLine();

            int cnt = 0;
            String tmp = "";
            String[] a = new String[200];
            for (int i = 0 ;i < s.length();i++) {
                char c = s.charAt(i);
                if (c >= '0' && c <= '9') {
                    tmp += c;
                }
                else {
                    a[cnt++] = tmp;
                    tmp = "";
                }
            }
            a[cnt++] = tmp;
            int chan = 0, le = 0;
            for (int i = 0 ;i < cnt;i++) {
                int d = Integer.parseInt(a[i]);
                if (d % 2 ==0) chan+=1;
                else le+=1;
            }
            if ((cnt % 2== 0 && chan > le) || (cnt%2== 1 && le > chan)) System.out.println("YES");
            else System.out.println("NO");

            tc -=1;
        }
    }
}
