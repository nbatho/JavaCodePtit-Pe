import java.util.ArrayList;
import java.util.Scanner;

public class J05007SapXepDanhSachDoiTuongNhanVien {
    static class NV {
        String mnv,ten,gt,dc,mst,hd,ns;
        int dd,mm,yyyy;
        NV(int stt, String mnv,String ten, String gt,String ns, String dc,String mst,String hd) {
            this.mnv = String.format("%05d", stt);
            this.ten = ten;
            this.gt = gt;
            this.dc = dc;
            this.mst = mst;
            this.hd = hd;
            this.ns = ns;
            String s[] = ns.trim().split("/");
            this.dd = Integer.parseInt(s[0]);
            this.mm = Integer.parseInt(s[1]);
            this.yyyy = Integer.parseInt(s[2]);
        }
        void op() {
            System.out.printf("%s %s %s %s %s %s %s\n",mnv,ten,gt,ns,dc,mst,hd);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        sc.nextLine();
        ArrayList <NV> ls = new ArrayList<>();
        for (int i = 0 ;i < tc;i++) {
            String ten = sc.nextLine();
            String gt = sc.nextLine();
            String ns = sc.nextLine();
            String dc = sc.nextLine();
            String mst = sc.nextLine();
            String hd = sc.nextLine();

            NV a = new NV(i+1,"",ten,gt,ns,dc,mst,hd);
            ls.add(a);
        }
        for (int i = 0 ;i < tc - 1 ;i++) {
            for (int j = i+1 ;j < tc;j++) {
                if (ls.get(i).yyyy == ls.get(j).yyyy) {
                    if (ls.get(i).mm == ls.get(j).mm) {
                        if (ls.get(i).mm > ls.get(j).mm) {
                            NV tmp = ls.get(i);
                            ls.set(i,ls.get(j));
                            ls.set(j,tmp);
                        }
                    }
                    else if (ls.get(i).mm > ls.get(j).mm) {
                        NV tmp = ls.get(i);
                        ls.set(i,ls.get(j));
                        ls.set(j,tmp);
                    }
                }
                else if (ls.get(i).yyyy > ls.get(j).yyyy) {
                    NV tmp = ls.get(i);
                    ls.set(i,ls.get(j));
                    ls.set(j,tmp);
                }
            }
        }
        for (NV i:ls) {
            i.op();
        }
    }
}
