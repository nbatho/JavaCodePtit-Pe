package test;
import java.io.*;
import java.util.*;

public class J070402LietKeCapSo2 {
    static int gcd(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b ;
            a = temp;
        }
        return a;
    }

    static boolean check(int a, int b){
        if(a>=b) return false;
        return gcd(a, b) == 1;
    }
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> a = (ArrayList<Pair>) ois.readObject();
        ois.close();

        Collections.sort(a);

        HashSet <String> ans = new HashSet<>();
        for (Pair i : a) {
            if (i.getFirst() < i.getSecond() && !ans.contains(i.toString()) && check(i.getFirst(), i.getSecond())) {
                ans.add(i.toString());
                System.out.println(i);
            }
        }

        
    }
}