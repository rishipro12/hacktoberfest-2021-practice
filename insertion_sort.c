#include<stdio.h>

void insertionSort(int arr[], int n)
{
    int i,j,key;
    for(i=1;i<n;i++)
    {
        key = arr[i];
        j = i - 1;
        while(j>=0 && arr[j]>key)
        {
            arr[j+1] = arr[j];
            j = j - 1;
        }
        arr[j+1] = key;
    }
}

int main()
{
    int n,i;

    printf("Enter the size of array:");
    scanf("%d",&n);

    int arr[n];
    printf("Enter %d elements:\n",n);
    for(i=0;i<n;i++)
        scanf("%d",&arr[i]);
    printf("\nUnsorted array:");
    for(i=0;i<n;i++)
        printf("%d ",arr[i]);

    insertionSort(arr,n);
    printf("\nSorted array:");
    for(i=0;i<n;i++)
        printf("%d ",arr[i]);
    return 0;
}

