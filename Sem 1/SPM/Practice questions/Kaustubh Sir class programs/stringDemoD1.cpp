#include<iostream>
using namespace std;
int main(){
    string message;
   /* cout<<"Enter a message"<<endl;
    cin>>message;
    cout<<"You entered "<<message<<endl;*/
    //cout<<"Enter a message"<<endl;
    //getline(cin,message);
    //cout<<"You entered "<<message<<endl;;
    //int i;
    //for(i=0;message[i]!=0;i++);
    //cout<<"Length of the message is "<<i<<endl;
    //cout<<"Length of the message is "<<message.length()<<endl;
    //cout<<message.find("Friday")<<endl;
    //cout<<message.substr(9,6);
    //cout<<message.substr(message.find("Friday"),6);
    string name, branch;
    cout<<"Enter your name, and branch:"<<endl;
    cin>>name;
    getline(cin, branch);
    string greeting = "Welcome,"+name+" to the "+branch+" department.";
    cout<<greeting;


}
