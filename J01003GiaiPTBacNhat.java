
import java.util.Scanner;

public class J01003GiaiPTBacNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();

        if (a == 0) {
            if (b != 0) System.out.print("VN");
            else if (b == 0) System.out.print("VSN");
        }
        else {
            float ans = -b / a;
            System.out.print(String.format("%.2f",ans));
        }
    }    
}
