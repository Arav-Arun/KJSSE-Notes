#include<iostream>
using namespace std;
int recursiveSum(int a, int b){
    if(b==a) return a;
    return b+recursiveSum(a,b-1);
}
int main(){
    int a=0, b=5;
    cout<<recursiveSum(a,b);
}
