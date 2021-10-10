public static int[] implementMergeSort(int arr[], int start, int end)
    {

      if( start < end )
      {
      
        int mid = start + ( end - start )/2;

        int[] leftSort = implementMergeSort(arr, start, mid);
        int[] rightSort = implementMergeSort(arr, mid + 1, end);

        int[] result = merge(leftSort, rightSort);
        return result;

      } 
     return arr;  
    }

public static int[] merge(int[] leftSort, int[] rightSort){

    int leftLength = leftSort.length();
    int rightLength = rightSort.length();

    int[] result = new int[leftLength + rightLength];

    int i=0, j=0, z=0;

    while( i < leftLength && j < rightLength ){

      if(leftSort[i] < rightSort[j]){
        result[z] = leftSort[i];
        i++;
      }
      else{
        result[z] = rightSort[j];
        j++;
      }
      z++;
    }


    while( i < leftLength){
      result[z] = leftSort[i];
      i++;
      z++;
      }

     while( j < rightLength){
      result[z] = rightSort[j];
      j++;
      z++;
      }   

      return result; 
}
