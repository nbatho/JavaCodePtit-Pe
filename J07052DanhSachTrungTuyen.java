import java.io.File;
import java.util.*;
public class J07052DanhSachTrungTuyen {
    static class SV{
        String mts,ten,tt;
        double tong,ut;
        SV(String mts,String ten, double diem) {
            this.mts = mts;
            this.ten = chuanHoa(ten);
            String kv = mts.substring(0,3);
            if (kv.equals("KV1")) ut =  0.5;
            else if (kv.equals("KV2")) ut =  1;
            else if (kv.equals("KV3")) ut =  2.5;
            tong = diem + ut;
            this.tt = "TRUOT";
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
        void Update() {
            this.tt = "TRUNG TUYEN";
        }
        void op() {
            String utStr;
            if (ut == (int)ut) utStr = String.format("%d", (int)ut);
            else utStr = String.format("%.1f", ut);

            if (tong == (int)tong) {
                System.out.printf("%s %s %s %d %s\n", mts, ten, utStr, (int)tong, tt);
            } else {
                System.out.printf("%s %s %s %.1f %s\n", mts, ten, utStr, tong, tt);
            }
        }
    }
    public static void main(String[] args) {
        try {
            File f = new File("THISINH.in");
            Scanner sc = new Scanner(f);

            int tc = sc.nextInt();
            ArrayList <SV> ls = new ArrayList<>();

            for (int i = 0 ;i < tc;i++) {
                sc.nextLine();
                String mts = sc.nextLine();
                String ten = sc.nextLine();
                double d1 = sc.nextDouble();
                double d2 = sc.nextDouble();
                double d3 = sc.nextDouble();

                double diem = (d1*2) + d2 + d3;

                ls.add(new SV(mts,ten,diem));
            }
            
            int chitieu = sc.nextInt();
            ls.sort((SV a,SV b) -> {
                return Double.compare(b.tong, a.tong);
            });
            double minV = ls.get(0).tong;
            int cnt = 0;
            for (SV a:ls) {
                if (cnt < chitieu) {
                    minV = Math.min(minV,a.tong);
                    cnt++;
                }
            }
            System.out.println(minV);
            for (SV a:ls) {
                if (a.tong >= minV) {
                    a.Update();
                    a.op();
                }
                else a.op();
            }
        } catch (Exception e) {
        }
        
    }
}
