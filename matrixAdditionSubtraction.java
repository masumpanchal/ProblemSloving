import java.util.Scanner;

public class matrixAdditionSubtraction {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter a number of column: ");
        int column = sc.nextInt();
        System.out.println();

        System.out.println("Enter First matrix: ");
        int [][] a = read(sc, rows, column);
        System.out.println();

        System.out.println("Enter Second matrix: ");
        int[][] b = read(sc, rows, column);

        sc.close();

        //add two matrix
        int[][] sum = add(a, b);

        //subtracting two matrix
        int[][] differance1 = subtract(a, b);
        int[][] differance2 = subtract(b, a);

        System.out.println("Sum of two matrix is:"+ "A + B");
        printMatrix(sum);

        System.out.println("Subtraction of two matrix is: " + "A - B");
        printMatrix(differance1);

        System.out.println("Subtraction of two matrix is: " + "B - A");
        printMatrix(differance2);
     }

    //----------------------------For Input Taking---------------------
    public static int[][] read (Scanner sc, int rows, int column){
        int[][] result = new int[rows][column];
        for (int i=0; i<rows; i++){
            for (int j = 0; j <column; j++){
                System.out.println("Enter value of ["+ (i+1)+ "][" + (j+1) +"]");
                result[i][j]= sc.nextInt();
            }
        }

        return result;
    }
//----------------------------------Addition-----------------------------
    public static int[][] add(int[][] a, int[][]b){
        int rows = a.length;
        int column = a[0].length;
        int result [][] = new int[rows][column];
        for (int i=0; i<rows; i++){
            for (int j=0; j<column; j++){
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }
//-----------------------------Subtraction------------------------------
    public static int[][] subtract(int a[][], int b[][]){
        int rows = a.length;
        int column = b.length;
        int result [][] = new int[rows][column];
        for (int i=0; i <rows; i++){
            for (int j=0; j<column; j++){
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

//--------------------------------Print in a matrix format--------------------
    public static void printMatrix(int[][] matrix){
        int rows = matrix.length;
        int column = matrix[0].length;
        for (int i=0; i<rows; i++){
            for (int j =0; j<column; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
