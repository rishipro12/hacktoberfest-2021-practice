/*
Information about the arguments given in function
arr[]: input array
start: starting index of array
end: ending index of array
*/

public static int[] quickSort(int arr[], int start, int end)
{
      if( start < end){

            int pi = partition(arr, start, end);

            quickSort(arr, start, pi - 1);
            quickSort(arr, pi + 1, end);
      }
      return arr;
}

public static int partition(int arr[], int start, int end){

      int pivot = arr[end];
      int i = start - 1;

      for(int j = start; j < end ; j++){

            if(arr[j] < pivot){
                  i++;
                  swap(arr, i, j);
            }
      }

      swap(arr, i+1, end);
      return (i+1);
      
}


public static void swap(int arr[], int i, int j){

        int temp = arr[j];
        arr[j] =arr[i];
        arr[i] = temp;
}
