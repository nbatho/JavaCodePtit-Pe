import java.util.*;
public class J01008Phantichthuasonguyento {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 1 ;j <= t;j++) {
            int n = sc.nextInt();
            System.out.print("Test " + j +": ");
            for (int i = 2 ;i*i<= n;i++) {
                int cnt = 0;
                if (n % i == 0) {
                    while (n % i == 0) {
                        cnt += 1;
                        n/=i;
                    }
                }
                if (cnt > 0)
                    System.out.print(i + "(" + cnt + ") ");
            }
            if (n > 1) {
                System.out.print(n + "(" + 1 + ") ");
            }
            System.out.println("");
        } 
    }
    
}
