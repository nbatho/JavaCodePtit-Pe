
import java.util.*;

public class J01001HinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a <= 0 || b <= 0) {
            System.out.print(0);
        }
        else {
             int cv = (a + b) * 2;
            int dt = a*b;

            System.out.print(cv + " " + dt);
        }
       
    }
}
