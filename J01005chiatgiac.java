import java.util.Scanner;
 
public class J01005chiatgiac{
    public static Scanner ip = new Scanner(System.in);
    public static void main(String[] args) {
        int t = ip.nextInt();
        while(t-- >0){
            int n = ip.nextInt();
            int h = ip.nextInt();
            for(double i=1d;i< n;i++) {
                double p = i/n;
                double ans = h*Math.sqrt(p);
                System.out.printf("%.6f ",ans);
            }
            System.out.println("");
        }
    }
}