import java.util.Arrays;

public class coutiSort {
    public static void main(String[] args){
        int[] input = {10, 20, 30, 40, 20, 60, 50, 20, 30, 40, 60, 10};
        int k = 60;

        System.out.println("Input before sorting: " + Arrays.toString(input));

        countingSorting(input, k);
        System.out.println("Input after sorting: " + Arrays.toString(input));
    }

    public static void countingSorting(int[] input, int k){
        //create buckets
        int counter[] = new int[k+1];
        
        //fill bucket
        for (int i: input) {
            counter[i]++;
        }
        int ndx = 0;
        //Sort Array
        for (int i = 0; i < counter.length; i++){
            while ( 0 < counter[i]){
                input[ndx++] = i;
                counter[i]--;
            }
        }
    }
}
