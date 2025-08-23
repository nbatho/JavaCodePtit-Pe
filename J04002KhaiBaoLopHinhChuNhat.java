import java.util.Scanner;

public class J04002KhaiBaoLopHinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int h = sc.nextInt();
        String c = sc.next().toLowerCase();

        if (w > 0 && h > 0) {

            int cv = (w + h)*2;
            int area = w*h;
            System.out.print(cv + " " + area + " " + c.toUpperCase().charAt(0)+ c.substring(1, c.length()));
        }
        else {
            System.out.print("INVALID");
        }
    }
}
