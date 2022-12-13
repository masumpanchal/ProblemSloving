import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class bucketSorts {
    public static void main(String[] args){
        int[] input = {10, 20, 30 ,50, 40, 70, 60, 90, 80, 1, 110};

        System.out.println("Input before sorting: " + Arrays.toString(input));

        bucketsort(input);
        System.out.println("Input after sorting: " + Arrays.toString(input));

    }

    //bucketSort implementation

    public static void bucketsort(int[] input){
        //get hash code
        final int[] code = hash(input);

        //create and initialization buckets to ArrayLists: 0(n)
        List<Integer>[] buckets = new List[code[1]];
        for (int i =0; i < code[1]; i++){
            buckets[i] = new ArrayList();
        }

        //Distribute data into Buckets
        for (int i: input) {
            buckets[hash(i, code)].add(i);
        }
        //Sort each bucket 0(n)
        for (List bucket: buckets) {
            Collections.sort(bucket);
        }
        int ndx = 0;
        //merge the buckets
        for (int b = 0; b < buckets.length; b++){
            for ( int v : buckets[b]) {
                input[ndx++] = v;
            }
        }
    }

    private static int[] hash(int[] input){
        int m = input[0];
        for (int i = 1; i < input.length; i++){
            if (m < input[i]){
                m = input[i];
            }
        }
        return new int[] {m, (int) Math.sqrt(input.length) };
    }

    private static int hash(int i, int[] code){
        return (int)((double) i / code[0] * code[1] -1);
    }
}
