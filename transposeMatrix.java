import java.util.Scanner;

public class transposeMatrix {
    public static void main(String[] args){

        System.out.println("Welcome to java program to transpose matrix:");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows");
        int r = sc.nextInt();

        System.out.println("Enter number of column");
        int c = sc.nextInt();

        int [][] matA = new int[r][c];
        System.out.println("Enter " + r*c + " values: ");
        for (int i =0; i<r; i++){
            for (int j=0; j<c; j++){
                matA[i][j]=sc.nextInt();
            }
        }

        System.out.println("Original Matrix is: ");
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                System.out.print(matA[i][j]+ "\t");
            }
            System.out.println();
        }


        System.out.println("Transpose Matrix is: ");
        for (int j=0; j<c; j++){
            for (int i=0; i<r; i++){
                System.out.print(matA[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}

