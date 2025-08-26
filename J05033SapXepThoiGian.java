import java.util.Scanner;

public class J05033SapXepThoiGian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ;i < n;i++) {
            int h = sc.nextInt(), m = sc.nextInt() , s = sc.nextInt();
            a[i] = (3600*h + m*60 + s);
        }
        
        for (int i = 0 ;i < n - 1;i++) {
            for (int j = i+1;j<n;j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for (int i = 0 ;i < n;i++) {
            int gio = a[i] /3600;
            int phut = (a[i] - gio*3600) / 60;
            int giay = (a[i] - 3600*gio - 60*phut);
            System.out.println(gio + " " + phut + " " + giay);
        }
    }
}
