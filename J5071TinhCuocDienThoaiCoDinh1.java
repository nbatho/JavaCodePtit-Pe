
import java.util.ArrayList;
import java.util.Scanner;

public class J5071TinhCuocDienThoaiCoDinh1 {
    static class Vung{
        String ma;
        int cuoc;
        String tinh;
        Vung(String ma,String tinh,int cuoc) {
            this.ma = ma;
            this.tinh = tinh;
            this.cuoc = cuoc;
        }
    }
    static int convertTime(String s) {
        String tmp[] = s.split(":");
        int hh = Integer.parseInt(tmp[0]);
        int mm = Integer.parseInt(tmp[1]);

        return hh*60+mm;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int st = sc.nextInt();
        ArrayList <Vung> lsV = new ArrayList<>();
        for (int i = 0 ; i < st;i++) {
            sc.nextLine();
            String ma = sc.nextLine();
            String tinh = sc.nextLine();
            int cuoc = sc.nextInt();
            
            lsV.add(new Vung(ma,tinh,cuoc));
        }
        int slcg = sc.nextInt();
        sc.nextLine();
        for (int i = 0 ;i < slcg;i++) {
            String s = sc.nextLine();
            String tmp[] = s.split(" ");
            String goi = tmp[0];
            String bd = tmp[1];
            String kt = tmp[2];

            int tgGoi = (convertTime(kt) - convertTime(bd));
            if(goi.startsWith("0")) {
                for (Vung v:lsV) {
                        String tp = goi.substring(1,3);
                        int tien = tgGoi*v.cuoc;
                        if (tp.equals(v.ma)) {
                            System.out.printf("%s %s %d %d\n",goi,v.tinh,tgGoi,tien);

                        }
                    }
                }
            else {
                tgGoi = (int) Math.ceil(tgGoi / 3.0);
                int tien = tgGoi*800;
                System.out.printf("%s %s %d %d\n",goi,"Noi mang",tgGoi,tien);

            }
        }
    }
}
