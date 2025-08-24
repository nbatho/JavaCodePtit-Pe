
import java.util.Scanner;

public class J04013BaiToanTuyenSInh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String mts = sc.nextLine();
        String ten = sc.nextLine();
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double d3 = sc.nextDouble();
        String kv = mts.substring(0,3);
        double ut = 0;
        if (kv.equals("KV1")) {
            ut = 0.5;
        }
        else if (kv.equals("KV2")) {
            ut = 1;
        }
        else ut = 2.5;
        double tong = d1*2+d2+d3;
        String tt = "";
        if ((ut + tong ) >= 24) tt = "TRUNG TUYEN";
        else tt = "TRUOT";
        System.out.printf("%s %s ",mts,ten);
        if ((int) ut == ut) System.out.printf("%.0f ",ut);
        else System.out.printf("%.1f ",ut);

        if ((int) tong == tong) System.out.printf("%.0f ",tong);
        else  System.out.printf("%.1f ",tong);

        System.out.printf("%s",tt);

    }
    
}
