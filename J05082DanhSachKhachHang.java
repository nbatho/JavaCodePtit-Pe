import java.util.ArrayList;
import java.util.Scanner;

public class J05082DanhSachKhachHang {
    static class P {
        String ten,gt,ns,dc,ma;
        String dd,mm,yyyy;
        int d,m,y;
        P(int i,String ten,String gt,String ns,String dc) {
            ma = String.format("KH%03d", i);
            String[] tmp = ns.split("/");
            dd = tmp[0];
            mm = tmp[1];
            yyyy = tmp[2];
            d = Integer.valueOf(dd);
            m = Integer.valueOf(mm);
            y = Integer.valueOf(yyyy);
            this.ten = chuanhoaTen(ten);
            this.ns = chuanhoaNS(dd,mm,yyyy);
            this.dc = dc;
            this.gt = gt;
        }
        String chuanhoaTen(String s) {
            String ans = "";
            String tmp[] = s.toLowerCase().trim().split("\\s+");
            for (int i = 0 ;i < tmp.length;i++) {
                if (tmp[i] != " ") {
                    ans += tmp[i].toUpperCase().charAt(0) + tmp[i].substring(1) + " ";
                }
            }
            return ans;
        }
        String chuanhoaNS(String dd,String mm,String yyyy) {
            String a = "";
            String b = "";
            String c = yyyy;
            if (dd.length() < 2) {
                a += "0" + dd;
            }
            else a += dd;
            if (mm.length() < 2) {
                b += "0" + mm;
            }
            else b += mm;
            return a + "/" + b + "/" + c;
        }
        void op() {
            System.out.printf("%s %s%s %s %s\n",this.ma,this.ten,this.gt,this.dc,this.ns);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        sc.nextLine();
        ArrayList <P> ls = new ArrayList<>();
        for (int i = 0 ;i < tc;i++) {
            String ten = sc.nextLine();
            String gt = sc.nextLine();
            String ns = sc.nextLine();
            String dc = sc.nextLine();
            ls.add(new P(i+1,ten,gt,ns,dc));
        }
        ls.sort((P a, P b) -> {
            if (a.y == (b.y)) {
                if (a.m == (b.m)) {
                    return Integer.compare(a.d, b.d);
                }
                return Integer.compare(a.m, b.m);
            }
            return Integer.compare(a.y, b.y);

        });
        for (P i:ls) i.op();
    }
}