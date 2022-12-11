#include<iostream>
using namespace std;

int main(){
    int a;
    cout<<"Enter the value"<<endl;
    cin>>a;
    
    int i = 1;
    while(i<=a){
        char ch = 'A' +i -1;

        int j=1;
        while(j<=a){
          
            cout<< ch<< " ";
            ch=ch+1;
            j=j+1;
        }
        cout<<endl;
        i=i+1;
    }
    return 0;
}