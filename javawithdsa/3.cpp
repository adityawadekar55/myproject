#include<iostream>
using namespace std;

void update(int arr[], int n){
   for(int i = 0; i<3;i++){
        cout<< arr[i]<<endl;
    }
    cout<<"in the function";
}

int main(){
    int arr[]={1,2,3};
    for(int i = 0; i<3;i++){
        cout<< arr[i]<<endl;
    }
    update(arr, 3);
}