import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class J07054TinhDiemTrungBinh {
    static class Mon {
        String ma, ten;
        double diem;
        int rank;

        Mon(int i, String ten, double d1, double d2, double d3) {
            ma = String.format("SV%02d", i);
            this.ten = chuanHoa(ten);
            diem = (d1 * 3.0 + d2 * 3.0 + d3 * 2.0) / 8.0;
        }

        static String chuanHoa(String s) {
            s = s.trim().toLowerCase().replaceAll("\\s+", " ");
            String[] parts = s.split(" ");
            StringBuilder sb = new StringBuilder();
            for (String x : parts) {
                sb.append(Character.toUpperCase(x.charAt(0)))
                  .append(x.substring(1))
                  .append(" ");
            }
            return sb.toString().trim();
        }

        void update(int rank) {
            this.rank = rank;
        }

        void op() {
            System.out.printf("%s %s %.2f %d\n", ma, ten, diem, rank);
        }
    }

    public static void main(String[] args) {
        try {
            File f = new File("BANGDIEM.in");
            Scanner sc = new Scanner(f);
            ArrayList<Mon> ls = new ArrayList<>();
            int tc = sc.nextInt();
            for (int i = 0; i < tc; i++) {
                sc.nextLine();
                String ten = sc.nextLine();
                double d1 = sc.nextDouble();
                double d2 = sc.nextDouble();
                double d3 = sc.nextDouble();
                ls.add(new Mon(i + 1, ten, d1, d2, d3));
            }


            ls.sort((a, b) -> {
                if (Double.compare(b.diem, a.diem) == 0) {
                    return a.ma.compareTo(b.ma);
                }
                return Double.compare(b.diem, a.diem);
            });


            int rank = 1;
            ls.get(0).update(rank);
            for (int i = 1; i < ls.size(); i++) {
                if (Math.abs(ls.get(i).diem - ls.get(i - 1).diem) < 1e-6) {
                    ls.get(i).update(ls.get(i - 1).rank);
                } else {
                    ls.get(i).update(i + 1); 
                }
            }

            for (Mon a : ls) a.op();

        } catch (Exception e) {
          
        }
    }
}
