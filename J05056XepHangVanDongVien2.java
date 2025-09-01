import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class J05056XepHangVanDongVien2 {
        static class VDV {
        String ma,ten;
        int ut,tuoi,thucTe,thanhTich,rank;

        static int convertTime(String s) {
            String t[] = s.split(":");
            int hh = Integer.parseInt(t[0]);
            int mm = Integer.parseInt(t[1]);
            int ss = Integer.parseInt(t[2]);

            return hh*3600 + mm*60 + ss;

        }
        static String formatTime(int t) {
            int hh = t /3600;
            int mm = t /60;
            int ss = t % 60;

            return String.format("%02d", hh) + ":" +  String.format("%02d", mm) + ":" +  String.format("%02d", ss);
        }
        VDV(int i,String ten,String ns,String xp,String dd) {
            ma = String.format("VDV%02d",i);
            this.ten = ten;
            String t[] = ns.split("/");

            tuoi = 2021 - Integer.parseInt(t[2]);

            if (tuoi >= 32) ut = 3;
            else if (tuoi >= 25) ut = 2;
            else if (tuoi >= 18) ut = 1;
            else ut = 0;
        
            int s = convertTime(xp);
            int e = convertTime(dd);
            thucTe = e - s;
            thanhTich = thucTe - ut;
        }
        void op() {
            System.out.printf("%s %s %s %s %s %d\n",ma,ten,formatTime(thucTe),formatTime(ut),formatTime(thanhTich),rank);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        sc.nextLine();
        ArrayList <VDV> b = new ArrayList<>();
        HashMap <Integer,Integer> mp = new HashMap<>();
        for (int i = 0 ;i < tc;i++) {
            String ten = sc.nextLine();
            String ns = sc.nextLine();
            String xp = sc.nextLine();
            String dd = sc.nextLine();
            b.add(new VDV(i+1,ten,ns,xp,dd));

        }
        b.sort((VDV x,VDV y) -> {
            return Integer.compare(x.thanhTich, y.thanhTich);
        });
        int rank = 1;
        for (int i = 0; i < b.size(); i++) {
            VDV v = b.get(i);
            if (!mp.containsKey(v.thanhTich)) {
                mp.put(v.thanhTich, rank);
            }
            rank = i + 2;
        }
        for (VDV i:b) {
            i.rank = mp.get(i.thanhTich);
            i.op();
        }
    }
}
