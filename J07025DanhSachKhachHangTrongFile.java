import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class J07025DanhSachKhachHangTrongFile {
    static class KH {
        String ma,ten,ns,dc,gt;
        int dd,mm,yyyy;

        KH(int i ,String ten,String gt,String ns,String dc) {
            ma = String.format("KH%03d", i);
            this.ten = chuanHoa(ten);
            this.ns = chuanhoaTime(ns);
            String tmp[] = this.ns.split("/");
            this.dd = Integer.parseInt(tmp[0]);
            this.mm = Integer.parseInt(tmp[1]);
            this.yyyy = Integer.parseInt(tmp[2]);
            this.dc = dc;
            this.gt = gt;
        }
        static String chuanhoaTime(String ns) {
            String tmp[] = ns.split("/");
            String dd = tmp[0];
            if (dd.length() < 2) dd = "0" + dd;
            String mm = tmp[1];
            if (mm.length() < 2) mm = "0" + mm;
            String yyyy = tmp[2];

            return dd + "/" + mm + "/" + yyyy;
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
            return ma + " " + ten + " " + gt + " " + dc + " " + ns;
        }
    }
    public static void main(String[] args) {
        try {
            File f = new File("KHACHHANG.in");
            Scanner sc = new Scanner(f);

            int tc = sc.nextInt();
            sc.nextLine();
            ArrayList <KH> ls = new ArrayList<>();
            for (int i = 0 ;i < tc;i++) {
                String ten = sc.nextLine();
                String gt = sc.nextLine();
                String ns = sc.nextLine();
                String dc = sc.nextLine();

                ls.add(new KH(i+1,ten,gt,ns,dc));
            }
            ls.sort((KH a,KH b) -> {
                if (a.yyyy == b.yyyy) {
                    if (a.mm == b.mm) {
                        return Integer.compare(a.dd, b.dd);
                    }
                    return Integer.compare(a.mm, b.mm);
                }
                return Integer.compare(a.yyyy, b.yyyy);
            });
            for (KH a:ls) System.out.println(a);
        } catch (Exception e) {
        }
    }
}
