import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class J07057DiemTuyenSinh {
    static class TS {
        String ma, ten, tt;
        double ut, tong;

        TS(int i, String ten, double diem, String dt, int kv) {
            ma = String.format("TS%02d", i);
            this.ten = chuanHoa(ten);

            if (dt.equals("Kinh")) {
                if (kv == 1) ut = 1.5;
                else if (kv == 2) ut = 1.0;
                else ut = 0.0;
            } else {
                if (kv == 1) ut = 3.0; 
                else if (kv == 2) ut = 2.5;
                else ut = 1.5;           
            }

            tong = diem + ut;
            tt = (tong >= 20.5) ? "Do" : "Truot";
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
            System.out.printf("%s %s %.1f %s\n", ma, ten, tong, tt);
        }
    }

    public static void main(String[] args) {
        try {
            File f = new File("THISINH.in");
            Scanner sc = new Scanner(f);

            int tc = Integer.parseInt(sc.nextLine());
            ArrayList<TS> ls = new ArrayList<>();

            for (int i = 0; i < tc; i++) {
                String ten = sc.nextLine();
                double diem = Double.parseDouble(sc.nextLine());
                String dt = sc.nextLine();
                int kv = Integer.parseInt(sc.nextLine());

                ls.add(new TS(i + 1, ten, diem, dt, kv));
            }

            ls.sort((TS a, TS b) -> {
                if (a.tong == b.tong) return a.ma.compareTo(b.ma);
                return Double.compare(b.tong, a.tong);
            });

            for (TS a : ls) a.op();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
