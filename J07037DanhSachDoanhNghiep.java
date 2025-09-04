import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class J07037DanhSachDoanhNghiep {
    static class DN {
        String mdn,tdn;
        int ssv;
        DN(String mdn,String tdn,int ssv) {
            this.mdn = mdn;
            this.tdn = tdn;
            this.ssv = ssv;
        }

        public String toString() {
            return mdn + " " + tdn + " " + ssv;
        }
    }
    public static void main(String[] args) {
        try {
            File f = new File("DN.in");
            Scanner sc = new Scanner(f);
            int tc = sc.nextInt();
            ArrayList <DN> ls = new ArrayList<>();
            for (int i = 0 ;i < tc;i++) {
                sc.nextLine();
                String mdn = sc.nextLine();
                String tdn =sc.nextLine();
                int ssv = sc.nextInt();
                ls.add(new DN(mdn,tdn,ssv));
            }   

            ls.sort((DN a,DN b) -> {
                return a.mdn.compareTo(b.mdn);
            });

            for (DN a:ls) System.out.println(a);

            
        } catch (Exception e) {
        }
    }
}
