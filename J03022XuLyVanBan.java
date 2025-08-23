
import java.util.Scanner;

public class J03022XuLyVanBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = "";
        String regex = "[.?!]";
        while (sc.hasNextLine()) {
            s += sc.nextLine();
        }
        String[] a = s.trim().toLowerCase().split(regex);
        
        for (String word:a) {
            word = word.trim();
            word = word.toUpperCase().charAt(0) + word.substring(1,word.length());
            for (String j: word.split("\\s+"))
                System.out.printf("%s ",j);
            System.out.println("");
        }
    }
}
