#include <iostream>
using namespace std;

int main(){
    cout<<"Rows?"<<endl;
    int rows=0;
    cin>>rows;
    cout<<"Columns?"<<endl;
    int columns=0;
    cin>>columns;
    int matrix[rows][columns];
    for(int row=0;row<rows;row++){
            cout<<"Row"<<row+1<<endl;
    for(int column=0;column<columns;column++){
        cin>>matrix[row][column];
    }
    }
    //Row-wise sum
    for(int row=0;row<rows;row++){
            cout<<"Row"<<row+1<<endl;
            int row_sum = 0;
    for(int column=0;column<columns;column++){
        row_sum+=matrix[row][column];
    }
    cout<<row_sum<<endl;
    }
    //Column-wise sum
    for(int column=0;column<columns;column++){
            cout<<"Column"<<column+1<<endl;
            int column_sum = 0;
    for(int row=0;row<rows;row++){
        column_sum+=matrix[row][column];
    }
    cout<<column_sum<<endl;
    }
}
