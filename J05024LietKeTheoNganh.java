import java.util.*;

public class J05024LietKeTheoNganh {
    static class SV {
        String msv, ten, lop, email;

        SV(String msv, String ten, String lop, String email) {
            this.msv = msv;
            this.ten = ten;
            this.lop = lop;
            this.email = email;
        }

        void print() {
            System.out.printf("%s %s %s %s\n", msv, ten, lop, email);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SV> ds = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String msv = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            ds.add(new SV(msv, ten, lop, email));
        }

        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String tenNganh = sc.nextLine().trim();
            String maNganh = "";

            String lower = tenNganh.toLowerCase();
            if (lower.equals("ke toan")) maNganh = "DCKT";
            else if (lower.equals("cong nghe thong tin")) maNganh = "DCCN";
            else if (lower.equals("an toan thong tin")) maNganh = "DCAT";
            else if (lower.equals("vien thong")) maNganh = "DCVT";
            else if (lower.equals("dien tu")) maNganh = "DCDT";

            System.out.println("DANH SACH SINH VIEN NGANH " + tenNganh.toUpperCase() + ":");

            for (SV sv : ds) {
                String msvSub = sv.msv.substring(3, 7);
                if (maNganh.equals("DCCN") || maNganh.equals("DCAT")) {
                    if (maNganh.equals(msvSub) && !sv.lop.startsWith("E")) {
                        sv.print();
                    }
                } else {
                    if (maNganh.equals(msvSub)) {
                        sv.print();
                    }
                }
            }
        }
    }
}