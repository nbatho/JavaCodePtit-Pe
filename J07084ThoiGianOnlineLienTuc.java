
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
public class J07084ThoiGianOnlineLienTuc {
    static class ON {
        String ten,bd,kt;
        long time;
        ON(String ten,String bd,String kt) throws Exception {
            this.ten = ten;

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date start = sdf.parse(bd);
            Date end = sdf.parse(kt);

            long diff = Math.abs(end.getTime() - start.getTime());
            time = TimeUnit.MILLISECONDS.toMinutes(diff);
        }
        public String toString() {
            return ten + " " + time;
        }

    }
    public static void main(String[] args) throws Exception{
        File f = new File("ONLINE.in");
        Scanner sc = new Scanner(f);

        int tc = sc.nextInt();
        sc.nextLine();
        ArrayList <ON> ls = new ArrayList<>();
        for (int i = 0 ;i < tc;i++) {
            String ten = sc.nextLine();
            String bd =sc.nextLine();
            String kt = sc.nextLine();

            ls.add(new ON(ten,bd,kt));
        }
        ls.sort((ON a,ON b) -> {
            return Long.compare(b.time, a.time);
        });
        for (ON a:ls) System.out.println(a);
    }
}
