#include<iostream>
using namespace std;
long long factorial(int n){
    if (n==0) return 1;
    return n*factorial(n-1);
}
int fibonacci(int n){
    if (n<=1) return 1;
    return fibonacci(n-1)+fibonacci(n-2);
}
int main(){
    int number = 5;
    cout<<factorial(5)<<endl;
    cin>>number;
    cout<<fibonacci(number-1)<<endl;

}
