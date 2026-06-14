#include<iostream>
using namespace std;
int main(){
    int rows,columns;
    cin>>rows>>columns;
    int matrix[rows][columns];

    for(int row=0;row<rows;row++){
        cout<<"Enter the "<<row+1<<" row"<<endl;
        for(int column=0; column<columns; column++){
            cin>>matrix[row][column];
        }
    }
    for(int row=0;row<rows;row++){
        cout<<row+1<<" row : "<<endl;
        for(int column=0; column<columns; column++){
            cout<<matrix[row][column]<<"\t";
        }
        cout<<endl;
    }
    int largest = INT_MIN;

    for(int row=0;row<rows;row++){
        for(int column=0; column<columns; column++){
            if(matrix[row][column]>largest){
                largest = matrix[row][column];
            }
        }
    }
    cout<<"Largest is "<<largest;

}
