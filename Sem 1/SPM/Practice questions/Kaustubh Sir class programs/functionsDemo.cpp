#include <iostream>
using namespace std;
inline bool isEven(int);
bool isEven(double);
void isEven (int [],int);
void isEven (int [][10],int, int);

int main(){
    int n;double d;
    cout<<"Enter a number"<<endl;
    cin>>n;
    cout<<isEven(n);
    cout<<"Enter a real number"<<endl;
    cin>>d;
    cout<<isEven(d);
    int size;
    cout<<"Enter the size of the array"<<endl;
    cin>>size;
    int numbers[size];
    for(int i=0;i<size;i++) cin>>numbers[i];
    /*for(int i:numbers){
        if(isEven(i)) cout<<"Even number";
        else cout<<"Odd number";
    }*/
    isEven(numbers,size);
    int rows,columns;
    cout<<"Enter the rows, columns of the array"<<endl;
    cin>>rows>>columns;
    int matrix[rows][10];
     for(int i=0;i<rows;i++)
            for(int j=0;j<columns;j++)
                cin>>matrix[i][j];
    isEven(matrix,rows,columns);
}

inline bool isEven(int n){
    return (n%2==0);
}
bool isEven(double d){
    return ((int)d%2 ==0);
}
void isEven (int arr[],int size){
    for(int i=0;i<size;i++){
        if(isEven(arr[i])) cout<<"Even"<<endl;
        else cout<<"Odd"<<endl;
    }
}
void isEven (int matrix[][10],int rows, int columns){
    for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++)
        if(isEven(matrix[i][j])) cout<<"Even"<<endl;
        else cout<<"Odd"<<endl;
    }
}
