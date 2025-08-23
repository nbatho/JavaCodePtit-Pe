
import java.util.Scanner;

public class J04006KhaiBaoLopSinhVien {
    static class Sv {
        String ten,lop;
        float gpa;
        String msv = "B20DCCN001";
        String[] ns = new String[3];
        public void get(Scanner sc) {
            ten = sc.nextLine();
            lop = sc.nextLine();
            ns = sc.nextLine().split("/");
            gpa = sc.nextFloat();
        }
        
        public void op() {
            String dd = ns[0];
            String mm = ns[1];
            String yyyy = ns[2];

            if (dd.length() < 2) {
                dd = "0" + dd;
            }
            if (mm.length() < 2) {
                mm = "0" + mm;
            }

            System.out.printf("%s %s %s %s %.2f",msv,ten,lop,dd + "/" + mm + "/"+yyyy,gpa);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Sv a = new Sv();
        
        a.get(sc);
        a.op();

    }
}