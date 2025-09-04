import java.util.*;

public class J05019LuongMuaTrungBinh {
    static class Info {
        int time, lg;
        Info(int time,int lg) {
            this.time = time;
            this.lg = lg;
        }
        void Update(int a,int b) {
            this.time += a;
            this.lg += b;
        }
    }
    static class Rain {
        String ten, ma;
        double time;
        double tbLuongMua;

        Rain(int i,String ten,int time,int lg) {
            ma = String.format("T%02d", i);
            this.ten = ten;
            this.time = time/60.0;
            this.tbLuongMua = lg / this.time;
        }
        void op() {
            System.out.printf("%s %s %.2f\n",ma,ten,tbLuongMua);
        }
    }
    static int convertTime(String bd,String kt) {
        String[] a = bd.split(":");
        String[] b = kt.split(":");

        int hhA = Integer.parseInt(a[0]);
        int mmA = Integer.parseInt(a[1]);
        int hhB = Integer.parseInt(b[0]);
        int mmB = Integer.parseInt(b[1]);

        return Math.abs((hhA*60 + mmA) - (hhB*60 + mmB));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        LinkedHashMap<String,Info> mp = new LinkedHashMap<>();
        ArrayList<Rain> ls = new ArrayList<>();

        for (int i = 0; i < tc; i++) {
            sc.nextLine();
            String ten = sc.nextLine();
            String bd = sc.nextLine();
            String kt = sc.nextLine();
            int lg = sc.nextInt();
            int time = convertTime(bd,kt);
            if (!mp.containsKey(ten)) {
                mp.put(ten,new Info(time,lg));
            } else {
                mp.get(ten).Update(time, lg);
            }
        }

        int idx = 1;
        for (Map.Entry<String,Info> entry : mp.entrySet()) {
            String ten = entry.getKey();
            Info val = entry.getValue();
            ls.add(new Rain(idx,ten,val.time,val.lg));
            idx++;
        }

        for (Rain r : ls) r.op();
    }
}
