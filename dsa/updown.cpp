#include<iostream>
using namespace std;

int main(){
    int row,col,space;

    cout<<"Enter the number of rows you want"<<endl;
    cin>>row;

    for(int i=1;i<=row;i++){

        for(space=1;space<=row-i;space++){
            cout<<" ";
        }

        for(col=1;col<=2*i-1;col++){
            cout<<"*";
        }
         cout<<endl;
    }
    
    for(int a=row;a>=1;a--){
         for(int jaga=1;jaga<=row-a;jaga++){
            cout<<" ";
        }

        for(int star=1;star<=2*a-1;star++){
            cout<<"*";
        }
         
         cout<<endl;
        
    }
   
}