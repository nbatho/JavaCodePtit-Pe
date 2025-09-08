import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class J07072ChuanHoaSapXep {
    static class Name {
        String ten, ho, dem;

        Name(String s) {
            String tmp[] = chuanHoa(s).split(" ");
            ho = tmp[0];
            ten = tmp[tmp.length - 1];
            if (tmp.length > 2) {
                StringBuilder sb = new StringBuilder();
                for (int i = 1; i < tmp.length - 1; i++) {
                    sb.append(tmp[i]).append(" ");
                }
                dem = sb.toString().trim();
            } else {
                dem = "";
            }
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

        public String toString() {
            if (dem.isEmpty()) return ho + " " + ten;
            return ho + " " + dem + " " + ten;
        }
    }

    public static void main(String[] args) {
        try {
            File f = new File("DANHSACH.in");
            Scanner sc = new Scanner(f);

            ArrayList<Name> ls = new ArrayList<>();
            while (sc.hasNextLine()) {
                String x = sc.nextLine().trim();
                if (!x.isEmpty()) {
                    ls.add(new Name(x));
                }
            }

            ls.sort((Name a, Name b) -> {
                if (a.ten.equals(b.ten)) {
                    if (a.ho.equals(b.ho)) {
                        return a.dem.compareTo(b.dem);
                    }
                    return a.ho.compareTo(b.ho);
                }
                return a.ten.compareTo(b.ten);
            });

            for (Name a : ls) System.out.println(a);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
