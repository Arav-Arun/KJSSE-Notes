#include<iostream>
using namespace std;
int main(){
    int vowels,consonants;
    string input;
    cin>>input;
    int length;
    for(length=0;input[length]!=0;length++);
    cout<<"String length is"<<length<<endl;
    cout<<"String length is"<<input.length()<<endl;

    for(char c:input){
       switch(c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                vowels++; break;
            }
    }
    cout<<"It has"<<vowels<<" vowels and "<<length-vowels<<" consonants";

}
