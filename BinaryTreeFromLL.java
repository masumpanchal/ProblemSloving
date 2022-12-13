import java.util.*;
import java.util.LinkedList;

public class BinaryTreeFromLL {
    public static void main (String[] args){

        //------------------Sorting a list by calling list.sort method instead of calling collection.sort() method ----------

        List<String> list = new LinkedList<>(Arrays.asList("beans", "oats", "avocados", "broccoli"));
        System.out.println("Before sorting : " + list);

        // reverse sorting
        list.sort(Comparator.reverseOrder());
        System.out.println("After sorting : " + list);

        //-----------Sorting list by calling collection.sort() method ----------------------------------
        // creating and initializing an LinkedList for sorting

        LinkedList<String> list1 = new LinkedList<>();

        list1.add("Eclipse");
        list1.add("NetBeans");
        list1.add("IntelliJ");
        list1.add("Resharper");
        list1.add("Visual Studio");
        list1.add("NotePad");

        System.out.println("Before sorting list1 : " + list1);

        //Sorting linkedlist with Collections.sort method in natural order
        Collections.sort(list1);
        System.out.println("LinkedList (After sorting in natural) : " + list1);

        //Sorting using Collection.sort() and comparator in java
        Collections.sort(list1, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });
        System.out.println("LinkedList (After sorting using Comparator) : " + list1);
    }
}
