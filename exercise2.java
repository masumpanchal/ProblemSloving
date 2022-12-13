public class exercise2 {
    public static void main(String[] args) {
        int a[] = {3,6,9,1,5};
        int max = a[0];

        for (int i=1; i<a.length;i++){
            if (a[i]>max){
                max = a[i];
            }
        }
        System.out.println("Maximum Value is " + max);

        int min = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Minimum number is "+ min);

    }

}
