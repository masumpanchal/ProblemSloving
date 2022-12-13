import java.util.Arrays;

public class exercise3 {
    public static void main(String[] args) {
        int a[] = new int[]{3, 4, 5, 6};
        int b[] = new int[]{1, 2, 3, 4};
        int c[] = new int[a.length + b.length];
        int n[] = new int[a.length * b.length];
        int sum0 = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;


        int j = 0, k = 0;

        for (int i = 0; i < c.length; i++) {
            if (i % 2 == 0)
                c[i] = a[j++];
            else
                c[i] = b[k++];
        }
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < a.length; i++) {
            sum0 = a[i] + b[0];
            sum1 = a[i] + b[1];
            sum2 = a[i] + b[2];
            sum3 = a[i] + b[3];

            System.out.print(sum0 + " "+ sum1 + " "+sum2 + " "+sum3 + " ");
            }
        }
    }

