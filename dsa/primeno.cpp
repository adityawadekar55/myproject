#include<iostream>
using namespace std;

int main(){
    int a;
    cout<<"Enter the number"<<endl;
    cin>>a;
    
    for(int i =2;i<=a;i++){
        if(a%i==0){
            cout<<"Is  is not a prime number"<<endl;
            break;
        }
        else{
            cout<<"it is a prime number";
        }
    }
}