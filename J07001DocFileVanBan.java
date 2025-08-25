import java.io.File;
import java.util.Scanner;

public class J07001DocFileVanBan {
    public static void main(String[] args) {
        try {
            File f = new File("DATA.in");

            Scanner sc = new Scanner(f);

            while (sc.hasNextLine()) {
                String s = sc.nextLine();
                System.out.printf("%s\n",s);
            }
        } catch (Exception e) {
        }
    }
}
