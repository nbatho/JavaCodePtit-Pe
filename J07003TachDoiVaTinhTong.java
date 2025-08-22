
import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;

public class J07003TachDoiVaTinhTong {
    public static void main(String[] args) {
        File f = new File("DATA.in");
        try {
            Scanner sc = new Scanner(f);
            BigInteger s = sc.nextBigInteger();
            while (s.toString().length() > 1) {
                int size = s.toString().length();
                BigInteger a = new BigInteger(s.toString().substring(0,size/2));
                BigInteger b = new BigInteger(s.toString().substring(size/2,size));
                
                s = a.add(b);
                System.out.println(s);
            }


        } catch (Exception e) {
        }
    }
    
}
