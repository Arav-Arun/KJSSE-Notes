#include <iostream>
using namespace std;
int add(int , int );
int main(){
    int x = 100, y=200;
    cout<<add(x,y);
}
int add(int a, int b){
    return a+b;
}
