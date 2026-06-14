#include <iostream>
using namespace std;
int n=100;
bool inline isEven(int n){
    return (n%2==0);
}
bool isEven(double d){
    return ((int)d%2==0);
}
void isEven(const int [], int);//declaration
void isEven(const int [][10], int , int);//definition
void transpose( int [][10], int, int);//definition
void display(const int [][10], int, int);//definition

int main(){
    /*int n = 10;
    if(isEven(n)) cout<<"Even";
    else cout<<"Odd";
    double d = 10.7;
    if(isEven(d)) cout<<"Even";
    else cout<<"Odd";
    int size;
    cout<<"Enter size of the array"<<endl;
    cin>>size;
    int numbers[size];
    for(int i=0;i<=size-1;i++){
        cin>>numbers[i];
    }
    isEven(numbers,size);*/
    int rows,columns;
    cout<<"Enter rows,columns of the matrix"<<endl;
    cin>>rows>>columns;
    int matrix[rows][10];
    for(int i=0;i<=rows-1;i++)
        for(int j=0;j<=columns-1;j++)
            cin>>matrix[i][j];
    isEven(matrix,rows,columns);
    display(matrix,rows,columns);
    transpose(matrix,rows,columns);
    display(matrix,rows,columns);

}

void isEven(const int arr[], int size){//definition
    for(int i=0;i<=size-1;i++){
        if(isEven(arr[i])) cout<<"Even"<<endl;
        else cout<<"Odd"<<endl;
    }
    //arr[3]=99999;
}
void isEven(const int arr[][10], int rows, int columns){//definition
    for(int i=0;i<=rows-1;i++){
        for(int j=0;j<=columns-1;j++)
        if(isEven(arr[i][j])) cout<<"Even\t";
        else cout<<"Odd\t";
        cout<<"\n";
    }
    //arr[3]=99999;
}
void transpose( int arr[][10], int rows, int columns){//definition
    for(int i=0;i<=rows-1;i++)
        for(int j=0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

        }

}
void display(const int arr[][10], int rows, int columns){//definition
for(int i=0;i<=rows-1;i++){
        for(int j=0;j<=columns-1;j++)
            cout<<arr[i][j]<<"\t";
        cout<<"\n";
}}
