import java.util.*;

public class J05054XepHangHocSinh {
    static class HS {
        String ma, ten, xl;
        double diem;
        int rank;

        HS(int i, String ten, double diem) {
            this.ma = String.format("HS%02d", i);
            this.ten = ten;
            this.diem = diem;
            if (diem >= 9) xl = "Gioi";
            else if (diem >= 7) xl = "Kha";
            else if (diem >= 5) xl = "Trung Binh";
            else xl = "Yeu";
        }

        void print() {
            System.out.printf("%s %s %.1f %s %d\n", ma, ten, diem, xl, rank);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<HS> ds = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String ten = sc.nextLine();
            double diem = Double.parseDouble(sc.nextLine());
            ds.add(new HS(i, ten, diem));
        }

        ArrayList<HS> sorted = new ArrayList<>(ds);
        sorted.sort((a, b) -> Double.compare(b.diem, a.diem));

 
        int rank = 1;
        sorted.get(0).rank = rank;
        for (int i = 1; i < sorted.size(); i++) {
            if (sorted.get(i).diem == sorted.get(i - 1).diem) {
                sorted.get(i).rank = rank;
            } else {
                rank = i + 1;
                sorted.get(i).rank = rank;
            }
        }

        for (HS s : ds) {
            for (HS t : sorted) {
                if (s.ma.equals(t.ma)) {
                    s.rank = t.rank;
                    break;
                }
            }
        }
        for (HS s : ds) s.print();
    }
}
