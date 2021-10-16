#include<iostream>
#include<vector>
using namespace std;

void counting_sort(int arr[], int n){
	//largest element
	int largest=-1;
	for(int i=0 ; i<n; i++){
		largest= max(largest, arr[i]);
	}
	
	//create a count array
	vector<int> freq(largest+1, 0);
	
	//update frequency array
	for(int i=0; i<n; i++){
		freq[arr[i]]++;
	}
	
	//put back the elements from freq into right array
	int j=0;
	for(int i=0; i<=largest; i++){
		while(freq[i] >0){
			arr[j] = i;
			freq[i]--;
			j++;
		}
	}
	return;
}
int main(){
	int arr[] = {1,4,7,2,9,1,5,2,0};
	int n = sizeof(arr)/sizeof(int);
	
	counting_sort(arr, n);
	
	for(int x:arr){
		cout<<x<<" ";
	}
	return 0;
}
