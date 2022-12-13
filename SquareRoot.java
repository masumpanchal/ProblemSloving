import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double Num = sc.nextInt();
        double temp;
        double sr= Num/2;

        /*double squareRoot = Math.sqrt(Num);

        System.out.println(squareRoot);*/


        //2nd method without using sqrt

        do {
            temp = sr; // 8, 5
            sr=(temp+(Num/temp))/2;
        }
        while (temp - sr !=0);
            System.out.println(sr);

    }

}
