package test;
import java.io.*;
import java.util.*;

public class J070401LietKeCapSo1 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> a = (ArrayList<Pair>) ois.readObject();
        ois.close();

        Collections.sort(a);

        HashSet <String> ans = new HashSet<>();
        for (Pair i : a) {
            if (i.getFirst() < i.getSecond() && !ans.contains(i)) {
                ans.add(i.toString());
                System.out.println(i);
            }
        }

        
    }
}
