import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class J07033DanhSachSinhVienTrongFile1 {
    static class SV{
        String ma,ten,lop,email;
        String chuanhoaTen(String s) {
            String tmp[] = s.toLowerCase().trim().split("\\s+");
            StringBuilder ans = new StringBuilder();
            for (String word : tmp) {
                ans.append(Character.toUpperCase(word.charAt(0)))
                .append(word.substring(1))
                .append(" ");
            }
            return ans.toString().trim();
        }
        SV(String ma,String ten,String lop,String email) {
            this.ma =ma;
            this.ten = chuanhoaTen(ten);
            this.lop = lop;
            this.email = email;
        }
        void op() {
            System.out.printf("%s %s %s %s\n",ma,ten,lop,email);
        }
    }
    public static void main(String[] args) {
        try {
            File f = new File("SINHVIEN.in");
    
            Scanner sc = new Scanner(f);
    
            int t = sc.nextInt();
            sc.nextLine();
            ArrayList <SV> ls = new ArrayList<>();
            for (int i = 0 ;i < t;i++) {
                String ma = sc.nextLine();
                String ten = sc.nextLine();
                String lop = sc.nextLine();
                String email = sc.nextLine();

                ls.add(new SV(ma,ten,lop,email));
            }
            ls.sort((SV a,SV b) -> {
                return a.ma.compareTo(b.ma);
            });
            for (SV i:ls) i.op();
            
        } catch (Exception e) {
        }
    }
}
