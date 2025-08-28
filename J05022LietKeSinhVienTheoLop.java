
import java.util.ArrayList;
import java.util.Scanner;

public class J05022LietKeSinhVienTheoLop {
    static class SV {
        String msv,ten,lop,email;

        SV(String msv,String ten,String lop,String email) {
            this.msv = msv;
            this.ten = ten;
            this.lop = lop;
            this.email = email;
        }
        void op() {
            System.out.printf("%s %s %s %s\n",this.msv,this.ten,this.lop,this.email);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        ArrayList <SV> ls = new ArrayList<>();
        sc.nextLine();
        for (int i = 0 ;i < tc;i++) {
            String msv = sc.nextLine();   
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();

            ls.add(new SV(msv,ten,lop,email));
        }
        int q = sc.nextInt();
        sc.nextLine();
        while (q --> 0) {
            String tenLop = sc.nextLine();
            System.out.print("DANH SACH SINH VIEN LOP " + tenLop  + ":\n");
            for (SV sv : ls) {
                if (sv.lop.equals(tenLop)) {
                    sv.op();
                }
            }
        }
    }
}   
