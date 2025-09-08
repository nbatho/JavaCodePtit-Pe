import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class J07059DanhSachCaThi {
    static class CT {
        String ma, date, time, room;
        long total;

        CT(int i, String nt, String gt, String pt) {
            ma = String.format("C%03d", i);
            date = nt;
            time = gt;
            room = pt;

            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            try {
                total = f.parse(date + " " + time).getTime();
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        @Override
        public String toString() {
            return ma + " " + date + " " + time + " " + room;
        }
    }

    public static void main(String[] args) {
        try {
            File f = new File("CATHI.in");
            Scanner sc = new Scanner(f);

            int tc = Integer.parseInt(sc.nextLine());
            ArrayList<CT> ls = new ArrayList<>();
            for (int i = 0; i < tc; i++) {
                String ngay = sc.nextLine().trim();
                String gio = sc.nextLine().trim();
                String phong = sc.nextLine().trim();
                ls.add(new CT(i + 1, ngay, gio, phong));
            }

            ls.sort((CT a, CT b) -> {
                if (a.total == b.total) {
                    return a.ma.compareTo(b.ma);
                }
                return Long.compare(a.total, b.total);
            });

            for (CT x : ls) {
                System.out.println(x);
            }

        } catch (Exception e) {

        }
    }
}
