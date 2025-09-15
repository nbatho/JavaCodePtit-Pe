import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.math.BigInteger;
import java.util.ArrayList;

public class J07085TongChuSo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("DATA.in");
        ObjectInputStream o = new ObjectInputStream(fis);

        ArrayList<String> a = (ArrayList<String>) o.readObject();

        for (String s : a) {
            int sum = 0;
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isDigit(c)) {
                    sb.append(c);
                    sum += c - '0';
                }
            }

            if (sb.length() > 0) {
                BigInteger number = new BigInteger(sb.toString());
                System.out.println(number + " " + sum);
            }
        }

        o.close();
    }
}
