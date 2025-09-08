
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class J07055XepLoai {
    static class SV {
        String ten,xl,ma;
        double tong;
        SV(int i,String ten,double lt,double th,double thi) {
            ma = String.format("SV%02d",i);
            this.ten =chuanHoa(ten);
            tong = lt*0.25 + th*0.35 + thi*0.4;

            if (tong >= 8) xl = "GIOI";
            else if (tong >= 6.5) xl = "KHA";
            else if (tong >= 5) xl = "TRUNG BINH";
            else xl = "KEM";
        }
        static String chuanHoa(String s) {
            s = s.trim().toLowerCase().replaceAll("\\s+", " ");
            String[] parts = s.split(" ");
            StringBuilder sb = new StringBuilder();
            for (String x : parts) {
                sb.append(Character.toUpperCase(x.charAt(0)))
                  .append(x.substring(1))
                  .append(" ");
            }
            return sb.toString().trim();
        }
        void op() {
            System.out.printf("%s %s %.2f %s\n",ma,ten,tong,xl);
        }
        
    }
    public static void main(String[] args) {
        try {
            File f = new File("BANGDIEM.in");
            Scanner sc = new Scanner(f);

            int  tc = sc.nextInt();
            ArrayList <SV> ls = new ArrayList<>();
            for (int i = 0 ;i < tc;i++) {
                sc.nextLine();
                String ten = sc.nextLine();
                double d1 = sc.nextDouble(),d2 = sc.nextDouble(),d3 = sc.nextDouble();

                ls.add(new SV(i+1,ten,d1,d2,d3));
                
            }
            ls.sort((SV a,SV b) -> {
                return Double.compare(b.tong,a.tong);
            });
            for (SV a:ls) a.op();


        } catch (Exception e) {
        }
    }   
}
