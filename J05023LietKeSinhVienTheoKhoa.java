import java.util.ArrayList;
import java.util.Scanner;

public class J05023LietKeSinhVienTheoKhoa {
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

        int q = sc.nextInt();
        while (q-- > 0) {
            String khoa = sc.next();
            
            System.out.println("DANH SACH SINH VIEN KHOA " + khoa + ":");
            for (SV sv : ds) {
               String s = sv.lop.substring(1,3);
               
                if (s.equals(khoa.substring(2))) {
                    sv.print();
                }
            }
        }
    }
}
