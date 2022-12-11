#include<iostream>
using namespace std;

void swapAlternate(int arr[], int size){
    for(int i=0;i<size;i+=2){
        if(i+1<size){
            swap(arr[i],arr[i+1]);
        }
    }
}

int main(){
    int even[6] ={3,4,6,5,7,8};
     swapAlternate(even,6);
}