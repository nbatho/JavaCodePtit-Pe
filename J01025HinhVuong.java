
import java.util.Scanner;

public class J01025HinhVuong {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt() , y1 = sc.nextInt(), x2 = sc.nextInt(),y2 = sc.nextInt();
        int x3 = sc.nextInt(), y3 = sc.nextInt(),x4 = sc.nextInt(),y4 = sc.nextInt();
    
        int maxx = Math.max(Math.max(Math.max(x1,x2),x3),x4);
        int maxy = Math.max(Math.max(Math.max(y1,y2),y3),y4);
        int minx = Math.min(Math.min(Math.min(x1,x2),x3),x4);
        int miny = Math.min(Math.min(Math.min(y1,y2),y3),y4);
    
        int ans = Math.max(maxx - minx , maxy - miny);
        System.out.println(ans*ans);
    }
    
}
