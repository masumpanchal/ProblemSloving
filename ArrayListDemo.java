import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number for total Row");
        int n = sc.nextInt();

        ArrayList<ArrayList<Integer>> al1 = new ArrayList<ArrayList<Integer>>();
        for (int i =0; i< n; i++){
            int d= sc.nextInt();
            ArrayList<Integer> al = new ArrayList<Integer>();
            for (int j=0; j<d; j++){
                int num = sc.nextInt();
                al.add(num);
            }
            al1.add(al);
        }

        int q = sc.nextInt();
        for (int i=0; i<q; i++){
            int y= sc.nextInt(); //line
            int x= sc.nextInt(); //Position

            try {
                System.out.println(al1.get(y-1).get(x-1));
            }catch (Exception e){
                System.out.println("ERROR!");
            }

        }

    }
}
