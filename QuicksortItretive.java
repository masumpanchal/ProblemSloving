import java.util.Stack;

public class QuicksortItretive {
    public static void main(String[] args){
        QuicksortItretive ob = new QuicksortItretive();
        int arr[] = {4, 3,5, 2, 1, 3, 2, 3};
        ob.Quicksort(arr, 0, arr.length-1);
        ob.printarr(arr, arr.length);
    }

    //--------------------------Swap Method-------------------------
    void swap (int arr[], int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    //-------------------------This function is same in both iterative and recursion method--------------------
    int partition(int arr[], int l, int h){
        int x = arr[h];
        int i = (l-1);

        for (int j = l; j <= h -1; j++){
            if (arr[j] <= x){
                i++;
                //swap arr[i] and arr[j]
                swap(arr, i, j);
            }
        }
        //swap arr[i+1] and arr[h]
        swap(arr, i+1, h);

        return (i+1);
    }
    // --------------------Sorts arr[l...h] using iterative Quicksort----------------------
    void Quicksort(int arr[], int l, int h){

        //create auxiliary stack
        int stack[] = new int[h-l +1];

        // initialize top of stack
        int top = -1;

        //push initial values in the stack
        stack[++top] = l;
        stack[++top] = h;

        // keep popping elements until stack is not empty
        while (top >= 0){
            // pop h and l
            h = stack[top--];
            l = stack[top--];

            //set pivot element at it's proper position
            int p = partition(arr, l, h);

            //if there are elements on left side of pivot, then push left side to stack
            if(p - 1 > l){
                stack[++top] = l;
                stack[++top] = p - 1;
            }

            // If there are elements on right side of pivot, then push right side to stack
            if (p + 1 > h){
                stack[++top] = p + 1;
                stack[++top] = h;
            }
        }
    }

    //function to print
    void printarr(int arr[], int n){
        for (int i = 0; i <n; i++){
            System.out.print(arr[i] + " ");
        }
    }


}


