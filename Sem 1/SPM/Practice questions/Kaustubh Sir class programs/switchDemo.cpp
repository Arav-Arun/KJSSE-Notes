#include<iostream>
using namespace std;

int main(){

    int number;
    cin>>number;

    switch(number*number%2){
    case 0:
        cout<<"Even number"<<endl;
        break;
    case 1:
        cout<<"Odd number";
    }

    char c;
    cin>>c;
    switch(c){
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
        cout<<"Its a vowel"<<endl;

    default:
        if(c>='a' && c<='z')
            cout<<"Its a consonant";
    }

    int bill=0;
    int choice;

    do{
        cout<<"Enter your choice"<<endl;
        cout<<" \
                1.Cookies\n\
                2. Cake\n\
                3. Tea\n\
                4. Coffee\n\
                0. Exit"<<endl;
        cin>>choice;
        switch(choice){
        case 1:
            //int x=0;
            cout<<"Cookies ";
            bill+=200;
            break;
        case 2:
            cout<<"Cake ";
            bill+=600;
            break;
        case 3:
            cout<<"Tea ";
            bill+=50;
            break;
        case 4:
            cout<<"Coffee";
            bill+=100;
            break;
        case 0:
            cout<<"Your total bill is"<<bill<<endl;
            break;
        default: cout<<"Enter a proper choice";
        }
        }while(choice);


    }

