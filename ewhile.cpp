#include<iostream>
using namespace std;

int main(){
    int a;
    cout<<"Enter the value"<<endl;
    cin>>a;

    int i = 1;
    while(i<=a){
       
       int j = 1;
       while(j<=a){
           cout<<j;
           j=j+1;
       }
       cout<<endl;
       i=i+1;
    }
}