#include<iostream>
using namespace std;
    

int sum(int a, int b);
void g();    
int main(){
    int num1,num2;

    cout<<"Enter the value of a= "<<endl;
    cin>>num1;

    cout<<"Enter the value of b= "<<endl;
    cin>>num2;

    cout<<"The sum of a and b "<<sum(num1,num2)<<endl;
    g();
    return 0;
}
int sum(int a, int b){
    int c= a+b;
    return c;
}
void g(){
    cout<<"Hello howdy";
}    