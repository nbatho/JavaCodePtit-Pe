import java.util.Scanner;

public class J04007KhaiBaoLopNhanVien {
    static class NV {
        String mnv = "00001";
        String ten,gt,ns,dc,mst,hd;

        public void get(Scanner sc) {
            ten = sc.nextLine();
            gt = sc.nextLine();
            ns = sc.nextLine();
            dc = sc.nextLine();
            mst = sc.nextLine();
            hd = sc.nextLine();
        }
        public void op() {
            System.out.printf("%s %s %s %s %s %s %s",mnv,ten,gt,ns,dc,mst,hd);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        NV a = new NV();
        a.get(sc);
        a.op();
    }   
}
