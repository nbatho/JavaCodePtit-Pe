import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class J07081SapXepDanhSachSinhVien {
    static class SV{
        String msv,sdt,email;
        String ten, ho, dem;
        SV(String msv,String s,String sdt,String email) {
            this.msv = msv;
            String tmp[] = chuanHoa(s).split(" ");
            ho = tmp[0];
            ten = tmp[tmp.length - 1];
            if (tmp.length > 2) {
                StringBuilder sb = new StringBuilder();
                for (int i = 1; i < tmp.length - 1; i++) {
                    sb.append(tmp[i]).append(" ");
                }
                dem = sb.toString().trim();
            } else {
                dem = "";
            }
            this.sdt = sdt;
            this.email = email;
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

        public String toString() {
            if (dem.isEmpty()) return msv + " " + ho + " " + ten + " " + sdt + " " + email;
            return msv + " " + ho + " " + dem + " " + ten + " " + sdt + " " + email;
        }
    }
    public static void main(String[] args) {
        try {
            File f = new File("SINHVIEN.in");

            Scanner sc = new Scanner(f);

            int tc = sc.nextInt();
            sc.nextLine();
            ArrayList <SV> ls = new ArrayList<>();
            for (int i = 0 ;i < tc;i++) {
                ls.add(new SV(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
            }
            ls.sort((SV a, SV b) -> {
                if (a.ten.equals(b.ten)) {
                    if (a.ho.equals(b.ho)) {
                        if (a.dem.equals(b.dem)) return a.msv.compareTo(b.msv);
                        return a.dem.compareTo(b.dem);
                    }
                    return a.ho.compareTo(b.ho);
                }
                return a.ten.compareTo(b.ten);
            });
            for (SV a:ls) System.out.println(a);
        } catch (Exception e) {
        }
    }
}
