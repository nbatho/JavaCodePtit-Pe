import java.util.Scanner;

public class J04017TichMaTranVaChuyenViCuaNo {
    static class Matrix {
        int x,y;
        int[][] mtx;
        Matrix (int a, int b) {
            x = a;
            y = b;
            mtx = new int[x][y];
        }
        void nextMatrix(Scanner sc) {
            for (int i = 0 ;i < x;i++) {
                for (int j = 0 ;j < y;j++) {
                    mtx[i][j] = sc.nextInt();
                }
            }
        }
        Matrix trans() {
            Matrix b = new Matrix(this.y,this.x);
            for (int i = 0 ;i < x;i++) {
                for (int j = 0 ; j < y;j++) {
                    b.mtx[j][i] = this.mtx[i][j];
                }
            }

            return b;
        }
        public Matrix mul(Matrix b ) {
            Matrix c = new Matrix(this.x,b.y);

            for (int i = 0 ;i < this.x;i++) {
                for (int j = 0 ; j < b.y;j++) {
                    c.mtx[i][j] = 0;
                    for (int k = 0 ;k<this.y;k++) {
                        c.mtx[i][j] += this.mtx[i][k]*b.mtx[k][j];
                    }
                }
            }

            return c;
        }
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    sb.append(mtx[i][j]).append(" ");
                }
                sb.append("\n");
            }
            return sb.toString();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), m = sc.nextInt();
            Matrix a = new Matrix(n,m);
            a.nextMatrix(sc);
            Matrix b = a.trans();
            System.out.println(a.mul(b));
        }
    }
}
