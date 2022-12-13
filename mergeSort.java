public class mergeSort {
    int[] array;
    int[] tempArray;
    int length;
    public static void main(String[] args){
        int[] arr = {10, 35, 56, 78, 98, 44, 3};
         mergeSort ms = new mergeSort();
         ms.sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public void sort(int arr[]){
        this.array = arr;
        this.length = arr.length;
        this.tempArray = new int[length];
        divideArray(0, length-1);
    }

    public void divideArray(int lowerIndex, int higherIndex){
        if (lowerIndex < higherIndex){

            int middle = lowerIndex+(higherIndex - lowerIndex)/2;

            //it will sort array from left side
            divideArray(lowerIndex, middle);

            //it will sort array from right side
            divideArray(middle+1, higherIndex);

            mergeArray(lowerIndex, middle, higherIndex);
        }
    }

    public void mergeArray(int lowerIndex, int middle, int higherIndex){
        for (int i = lowerIndex; i <= higherIndex; i++){
            tempArray[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle+1;
        int k = lowerIndex;

        while (i <= middle && j<= higherIndex){
            if (tempArray[i] <= tempArray[j]){
                array[k] = tempArray[i];
                i++;
            }
            else{
                array[k] = tempArray[j];
                j++;
            }
            k++;
        }
        while (i <= middle){
            array[k] = tempArray[i];
            k++;
            i++;
        }
    }
}
