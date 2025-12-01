import java.util.Scanner;

public class J03029ChuanHoaCau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String[] x = sc.nextLine().toLowerCase().split("\\s+");
            if (x.length > 1) {
                if (x[x.length - 1].contains(".") || x[x.length - 1].contains("!") || x[x.length - 1].contains("?")) {
                    if (x[x.length -1].length() > 1) {

                        System.out.print(x[0].toUpperCase().charAt(0) + x[0].substring(1));
                        for (int i = 1 ;i < x.length;i++) {
                            System.out.print(" " + x[i]);
                        }
                        System.out.println();
                    }
                    else {
                        System.out.print(x[0].toUpperCase().charAt(0) + x[0].substring(1));
                        for (int i = 1 ;i < x.length - 1;i++) {
                            System.out.print(" " + x[i]);
                        }
                        System.out.println(x[x.length - 1]);
                    }

                } else {
                    System.out.print(x[0].toUpperCase().charAt(0) + x[0].substring(1));
                    for (int i = 1 ;i < x.length ;i++) {
                        System.out.print(" " + x[i]);
                    }
                    System.out.println(".");
                }
            }
        }
       
    }
    
}
