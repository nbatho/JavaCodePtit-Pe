import java.util.ArrayList;
import java.util.Scanner;

public class J05025SapXepDanhSachGiangVien {
    static class GV {
        String ten,bm,ma,tenDau;
        static String convert(String s) {
            String []tmp = s.trim().split(" ");      
            String xau = "";
            for (int i = 0; i < tmp.length; i++) {
                xau += tmp[i].toUpperCase().charAt(0);  
            }
            return xau;
        }
        static String getTen(String s) {
            String []tmp = s.trim().split(" ");

            return tmp[tmp.length -1];
        }
        GV(int stt,String ten,String bm) {
            this.ma = String.format("GV%02d", stt);
            
            this.ten = ten;
            this.bm = convert(bm);
            this.tenDau = getTen(this.ten);
        }
        void op() {
            System.out.printf("%s %s %s\n",ma,ten,bm);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        sc.nextLine();
        ArrayList <GV> ls = new ArrayList<>();

        for (int i = 0 ;i < tc ;i++) {
            String ten = sc.nextLine();
            String mon = sc.nextLine();

            ls.add(new GV(i+1,ten,mon));
        }
        for (int i = 0 ;i < tc - 1 ;i++) {
            for (int j = i+1 ;j < tc;j++) {
                if (ls.get(i).tenDau.compareTo(ls.get(j).tenDau) == 0 ) {
                    if (ls.get(i).ma.compareTo(ls.get(j).ma) > 0) {
                        GV tmp = ls.get(i);
                        ls.set(i,ls.get(j));
                        ls.set(j,tmp);
                    }
                }
                else if (ls.get(i).tenDau.compareTo(ls.get(j).tenDau) > 0) {
                    GV tmp = ls.get(i);
                    ls.set(i,ls.get(j));
                    ls.set(j,tmp);
                }
            }
        }
        for (GV i:ls) {
            i.op();
        }
    }
}