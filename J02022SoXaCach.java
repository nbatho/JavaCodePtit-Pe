import java.util.Scanner;
public class J02022SoXaCach {

    public static int Power(int n, int k) {
        if (k == 0) return 1;
        if (k == 1) return n;
        int x = Power(n,k/2);
        x *=x;

        if (k % 2 == 0) return x;
        else return x*n;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
    int tc = sc.nextInt();

    for (int t=  0 ; t < tc ;t++) {
        int n = sc.nextInt();

        int l = Power(10,n-1);
        int r = Power(10,n) - 1;

        for (int i = l ; i <= r;i++) {
            String s = String.valueOf(i);
            int valid = 1;
            int[] d = new int[10];
            for (int j = 0 ;j < s.length();j++) {
                int digit = s.charAt(j) - '0';
                d[digit] +=1;
            }
            for (int k = 0 ; k < s.length();k++) {
                System.out.println(d[s.charAt(i)]);
            }
        }
    }
}}
