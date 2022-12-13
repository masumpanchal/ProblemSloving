import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class permutation {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printPermutation(str,"");
    }

    //Recursive method
    public static void printPermutation(String ques, String asf){
        //ques--Question,
        //asf--Answer so far
        if (ques.length() == 0){
            System.out.println(asf);
            return;
        }
        for (int i=0; i<ques.length(); i++){
            char ch= ques.charAt(i);
            String qLPart = ques.substring(0, i);
            String qRPart = ques.substring(i+1);
            String roq = qLPart+qRPart;
            printPermutation(roq, asf+ch);
        }

    }
}
