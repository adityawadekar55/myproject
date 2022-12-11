#include<iostream>
using namespace std;

int factorial(int n){
    int factorial = 1;

    for(int i=1;i<=n;i++){
        factorial = factorial * i;
    }
    return factorial;
}

int nCr(int n , int r){
       int ans = factorial(n);
       
       int den = factorial(r) + factorial(n-r);

       return ans/den;
}

int main(){
    int n,r;
    cout<<"Enter the value of n = "<<endl;
    cin>>n;
    cout<<"Enter the value of r ="<<endl;
    cin>>r;

    cout << "The nCr is here" <<  nCr(n,r);
    return 0;
}