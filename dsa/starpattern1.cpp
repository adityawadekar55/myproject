#include<iostream>
using namespace std;

int main(){
    int row,col,space,a;

    cout<<"Enter the number of rows you want to print= "<<endl;
    cin>>row;

    for(int i =row;i>=1;i--){

        for(space=1;space<=row-i;space++){
            cout<<" ";
        }
        for (col=1;col<=2*i-1;col++){
            cout<<"*";
        }
        cout<<endl;
    }
}