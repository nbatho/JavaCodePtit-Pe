import java.util.ArrayList;
import java.util.Scanner;

public class J050301BangDiemThanhPhan2 {
    static class SV {
        String msv,tsv,lop;
        double d1,d2,d3;
        SV(String msv,String tsv,String lop,double d1,double d2,double d3) {
            this.msv = msv;
            this.tsv = tsv;
            this.lop = lop;
            this.d1 = d1;
            this.d2 = d2;
            this.d3 = d3;
        }
        void op() {
            System.out.printf("%s %s %s %.1f %.1f %.1f\n",this.msv,this.tsv,this.lop,this.d1,this.d2,this.d3);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        ArrayList <SV> ls = new ArrayList<>();
        for (int i = 0 ;i < tc;i++) {
            sc.nextLine();

            ls.add(new SV(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble()));
        }
        ls.sort((SV a, SV b) -> {
            return a.tsv.compareTo(b.tsv);
        });
        for (int i = 0 ;i < ls.size();i++) {
            System.out.print(i+1 + " ");
            ls.get(i).op();
        }
    }
    
}
