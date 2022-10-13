import java.util.Scanner;

public class subString {
    public static String getSmallestAndLargest(String s, int k){
        String str = s.substring(0, k);
        String smallest = str;
        String largest = str;

        for (int i=1; i<=s.length()-k; i++){
            str=s.substring(i, i+k);
            if (str.compareTo(smallest)<0){
                smallest=str;
            }
            if (str.compareTo(largest)>0){
                largest=str;
            }

        }
        return smallest+ "\n" + largest;

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        //Taking input of string from user
        System.out.println("Enter String");
        String s= sc.next();

        //Input of Number 'k'
        System.out.println("Enter Number");
        int k= sc.nextInt();


        sc.close();
        System.out.println("The Output is: ");
        System.out.println(getSmallestAndLargest(s,k));
    }

}
