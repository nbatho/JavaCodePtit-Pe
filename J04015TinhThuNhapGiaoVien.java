
import java.util.Scanner;

public class J04015TinhThuNhapGiaoVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ma = sc.nextLine();
        String ten = sc.nextLine();
        long lcb = sc.nextLong();
        long pc = 0;
        String cv = ma.substring(0,2);
        String hs = ma.substring(2,ma.length());
        long bl = Long.parseLong(hs);

        if (cv.equals("HT")) pc += 2000000;
        else if (cv.equals("HP")) pc += 900000;
        else pc += 500000;
        System.out.print(ma + " " + ten + " " + bl + " " + pc + " " + (pc+lcb*bl));
    }
}
