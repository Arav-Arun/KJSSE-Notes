#include<iostream>
using namespace std;
int number = 6;
int checkEvenOdd(int number){
    return number%2;
}
int checkEvenOddArray(int arr[],int size){
    for (int i=0;i<size;i++)
        cout<<checkEvenOdd(arr[i])<<endl;
}
void transpose(int matrix[][3], int rows, int columns)
{
    for(int i=0;i<rows;i++)
        for(int j=0;j<i;j++)
        matrix[i][j]=matrix[j][i];
}
void display(int matrix[][3], int rows, int columns){
    for(int row=0;row<rows;row++){
            cout<<"Row"<<row+1<<endl;
    for(int column=0;column<columns;column++){
        cout<<matrix[row][column];
    }
    }
}
int main(){
    //int number;
    //cin>>number;
    if(checkEvenOdd(number))
        cout<<"Odd"<<endl;
    else
        cout<<"Even"<<endl;
    int numbers[] = {1,2,-2,-3,5};
    checkEvenOddArray(numbers,5);
    int matrix[][3]={{1,2,3},{4,5,6},{7,8,9}};
    display(matrix,3,3);
    transpose(matrix,3,3);
    display(matrix,3,3);

}
