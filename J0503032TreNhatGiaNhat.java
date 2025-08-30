
import java.util.ArrayList;
import java.util.Scanner;

public class J0503032TreNhatGiaNhat {
    static class P {
        String ten;
        String dd,mm,yyyy;

        P(String ten,String ns) {
            this.ten = ten;
            String[] tmp = ns.split("/");
            dd =tmp[0];
            mm =tmp[1];
            yyyy =tmp[2];
        }
        void op() {
            System.out.printf("%s\n",ten);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        ArrayList <P> ls= new ArrayList<>();  
        for (int i = 0 ;i < tc;i++) {
            ls.add(new P(sc.next(),sc.next()));
        }
        ls.sort((P a, P b) -> {
            if (a.yyyy.equals(b.yyyy)) {
                if (a.mm.equals(b.mm)) {
                    return a.dd.compareTo(b.dd);
                }
                return a.mm.compareTo(b.mm);
            }
            return a.yyyy.compareTo(b.yyyy);
        });
        ls.get(ls.size() - 1).op();
        ls.get(0).op();
    }
}
