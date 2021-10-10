#include<iostream>
using  namespace std;

class Pair{ // creating a class which contains 2 variables: min and max
    public:
    int max, min;
};

Pair maxmin(int arr[], int n){
    Pair c1;
    // setting max and min variable equal to first element of array.
    c1.max=arr[0]; 
    c1.min = arr[0];
    for(int i=1; i<n;i++){
        if (arr[i]>c1.max){ // checking for maximum value
            c1.max=arr[i];
        }
        if(arr[i]<c1.min){
            c1.min=arr[i]; // checking for minimum value
        }
    }
    return c1; // returning max and min variable pair.
}
int main(){
    int arr[5]={15,26,13,44,52};
    Pair p= maxmin(arr, 5);
    cout<<p.max<<" "<<p.min;
}