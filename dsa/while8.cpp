#include<iostream>
using namespace std;

int main(){
    int a;
    cout<<"Enter the value"<<endl;
    cin>>a;

   int i =1;
   while(i<=a){
       char ch = 'A' +i -1;
       int j  = 1;
       while(j<=i){
           
           cout<< ch << " ";
           j= j+1;
       }
       i=i+1;
       cout<<endl;
   }
}