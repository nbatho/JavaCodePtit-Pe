
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class J07045LoaiPhong {
    static class LoaiPhong implements Comparable<LoaiPhong> {
        String loai,ten,gia,dv;

        LoaiPhong(String s) {
            String tmp[] = s.split(" ");
            loai = tmp[0];
            ten = tmp[1];
            gia = tmp[2];
            dv = tmp[3];
        }
        public int compareTo(LoaiPhong o) {
            return this.ten.compareTo(o.ten); 
        }
        
        @Override
        public String toString() {
            return loai + " " + ten + " " + gia + " " + dv;
        }
    }
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
