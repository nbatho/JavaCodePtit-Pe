
import java.util.ArrayList;
import java.util.Scanner;

public class J05015DuaXeDap {
    static class TS {
        String ten,dv,ma;
        double hh,mm,time,vt;
        String chuanHoa(String a,String b) {
            String s = "";
            String tmp[] = b.split(" ");
            for (int i = 0 ;i < tmp.length;i++) {
                s += tmp[i].toUpperCase().charAt(0);
            }
            String tmp1[] = a.split(" ");
            for (int i = 0 ;i < tmp1.length;i++) {
                s += tmp1[i].toUpperCase().charAt(0);
            }
            return s;
        }
        TS(String ten,String dv,String kt) {
            this.ten = ten;
            this.dv = dv;
            this.ma = chuanHoa(ten,dv);
            String tmp[] = kt.split(":");
            hh = Integer.valueOf(tmp[0]) - 6;
            mm = Integer.valueOf(tmp[1]);

            time = hh + mm/60;
            vt = Math.round(120/time);
        }
        void op() {
            System.out.printf("%s %s %s %d Km/h\n",ma,ten,dv,(int)vt);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        ArrayList <TS> ls = new ArrayList<>();
        sc.nextLine();
        for (int i = 0 ;i < tc;i++) {
            String ten = sc.nextLine();
            String dv = sc.nextLine();
            String kt = sc.nextLine();
            
            ls.add(new TS(ten,dv,kt));
        }
        ls.sort((TS a,TS b) -> {
            return Double.compare(a.time, b.time);
        });
        for (TS i:ls) i.op();
    }
}
