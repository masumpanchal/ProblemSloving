import java.util.*;
public class exercise4 {
    public static void main(String[] args) {
        String[] a = new String[]{"Joe", "Harish", "Joe", "Mani", "Joe", "Rahul"};

        HashMap<String, Integer> hm = new HashMap<>();
        for (int i=0; i< a.length; i++){
            if (hm.containsKey(a[i])){
                hm.put(a[i], hm.get(a[i])+1);
            }
            else{
                hm.put(a[i], 1);
            }
        }
        System.out.println(hm);
    }
}


