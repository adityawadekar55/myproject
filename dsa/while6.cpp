#include<iostream>
using namespace std;

int main(){
    int a;
    cout<<"Enter the value"<<endl;
    cin>>a;

    int i = 1;
    char count = 'A';
    while(i<=a){

        int j=1;
        while(j<=a){
            count = count + 1;
            cout<< count ; 
            j=j+1;
        }
        cout<<endl;
        i=i+1;
    }
}