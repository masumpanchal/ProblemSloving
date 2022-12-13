import java.util.LinkedHashSet;
import java.util.Scanner;

public class ArrayListDuplicateDemo {
    public static void main(String[] args){
        int n;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Array size");
        n=sc.nextInt();

        int[] array = new int[n];
        System.out.println("Enter element of array");

        for (int i=0; i<n; i++){
            array[i]=sc.nextInt();
        }


        int length = array.length;
        length = removeDuplicates(array,length);

        System.out.println("ArrayList without Duplicates");
        for (int i=0; i<length; i++){
            System.out.print(array[i]+ " ");
        }


        System.out.println();


        int length2= array.length;
        System.out.println("ArrayList Without Duplicates using Hashset");
        length2=removeDuplicates2(array);
        for (int i= 0; i<length2; i++){
            System.out.print(array[i]+" ");
        }
        
    }


    // Java Program to Remove Duplicate Elements From the Array for sorted array

    public static int removeDuplicates(int array[], int n){
        if (n==0 || n==1)
            return n;

        int[] temp = new int[n];
        int j=0;

        for (int i=0; i<n-1; i++){
            if (array[i] != array[i+1]){
                temp[j++]=array[i];
            }
        }
        temp[j++] = array[n-1];

        // Changing original array
        for (int i=0; i<j; i++){
            array[i] = temp[i];
        }

        return j;
    }
    public static int removeDuplicates2(int[] array){
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

        // adding elements to LinkedHashSet

        for (int i=0; i<array.length; i++)
            set.add(array[i]);

        System.out.println(set);

        return 0;
    }


}

