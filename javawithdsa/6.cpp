#include<iostream>
using namespace std;

int main(){
    int i,j,a;

    cout<<"enter the value of a"<<endl;
    cin>>a;
    int count = 1;
    for(i=9;i>=1;i++){
        
            for(j=1;j<=a;j++){
                cout<< count << " ";
                count= count -1;
                j=j+1;
            }
            cout<<endl;
    }   
}