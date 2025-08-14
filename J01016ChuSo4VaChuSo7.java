
import java.util.Scanner;

public class J01016ChuSo4VaChuSo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int four = 0;
        int seven = 0;
        for (int i = 0 ;i < s.length();i++) {
            if (s.charAt(i) == '4') four +=1;
            else if (s.charAt(i) == '7') seven +=1;
        }
        if (four + seven == 4 || four + seven == 7) System.out.println("YES");
        else System.out.println("NO");
    }
}
