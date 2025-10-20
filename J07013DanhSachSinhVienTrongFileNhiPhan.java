danhsachsinhvien1/Danhsachsinhvien1.java

package danhsachsinhvien1;
import java.io.*;
import java.util.*;
public class Danhsachsinhvien1 {


    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList <SinhVien> a = (ArrayList<SinhVien>) ois.readObject();
        
        for (SinhVien x:a) {
            System.out.println(x);
        }
    }
    
}

danhsachsinhvien1/SinhVien.java

package danhsachsinhvien1;
import java.io.*;
import java.text.*;
import java.util.*;
public class SinhVien implements Serializable{
    private String ma, ten, lop;
    private Date ngaysinh;
    private float gpa;

    public SinhVien(int id, String ten, String lop, String ngaysinh, float gpa) throws ParseException{
        this.ma = String.format("B20DCCN%03d", id);
        this.ten = ten;
        this.lop = lop;
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        this.ngaysinh = f.parse(ngaysinh);
        this.gpa = gpa;
    }
    @Override 
    public String toString(){
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        return ma + " " + ten + " " + lop + " " + f.format(ngaysinh) + " " + String.format("%.2f", gpa);
    }
}

