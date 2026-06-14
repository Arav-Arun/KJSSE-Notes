#include<iostream>
using namespace std;
int main(){
    int n=0;
    cout<<"Enter the size of the array";
    cin>>n;
    int numbers[n];
    for(int i=0;i<=n-1;i++) cin>>numbers[i];
    for(int num:numbers){
        if (!(num%15)) cout<<"FizzBuzz"<<endl;
        else if (!(num%3)) cout<<"Fizz"<<endl;
        else if (!(num%5)) cout<<"Buzz"<<endl;
        else cout<<num<<endl;
    }
    int largest = INT_MIN, smallest = INT_MAX;
    for(int num:numbers){
            if(num>largest) largest=num;
            if(num<smallest) smallest=num;
    }
    cout<<"Largest is "<<largest<<" and smallest is "<<smallest;




}
