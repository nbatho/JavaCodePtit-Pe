
import java.util.ArrayList;
import java.util.Scanner;

public class J05073TinhToanGiaBan {
    static class Don {
        String ma;
        double thue, pvc, tong;

        Don(String ma,double dg,double sl) {
            this.ma = ma;
            if (ma.startsWith("T")) {
                thue = 0.29;
                pvc = 0.04;
            }
            else if (ma.startsWith("C")) {
                thue = 0.1;
                pvc = 0.03;
            }
            else if (ma.startsWith("D")) {
                thue = 0.08;
                pvc = 0.025;
            }
            else if (ma.startsWith("M")) {
                thue = 0.02;
                pvc = 0.005;
            }
            if (ma.endsWith("C")) {
               tong = sl*dg + sl*dg*(thue*0.95) + sl*dg*pvc;
                tong = (tong*1.2)/sl;
            }
            else {
                tong = sl*dg + sl*dg*(thue) + sl*dg*pvc;
                tong = (tong*1.2)/sl;

            }
        }

        void op() {
            System.out.printf("%s %.2f\n",ma,tong);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        sc.nextLine();
        ArrayList <Don> ls = new ArrayList<>();
        for (int i = 0 ;i < tc;i++) {
            String s = sc.nextLine();
            String tmp[] = s.split(" ");
            
            ls.add(new Don(tmp[0],Long.parseLong(tmp[1]),Long.parseLong(tmp[2])));
        }
        for (Don i:ls) i.op();
    }
}
