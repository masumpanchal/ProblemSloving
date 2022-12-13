import java.util.Arrays;

public class ReverseArrayInPlace {
    public static void main(String[] args){
        int a[] = {10, 20, 30, 40, 50};

        for (int i=4; i>=0; i--){
            System.out.print(a[i] + " " );
        }

        String [] name = {"John" , "Jammy" ,  "Luke"};

        System.out.println();
        reverse(name);
        System.out.println("Reverse String is :" + Arrays.toString(name));
    }

    public static void reverse(String[] array){
        if (array == null || array.length <2 ){
            return;
        }
        for (int i = 0; i < array.length/2; i++){
            String temp = array[i];
            array[i] = array[array.length - 1-i];
            array[array.length -1-i]= temp;
        }
    }
}
