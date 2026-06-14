#include<iostream>
using namespace std;
int main(){
    string name, address;
    getline(cin,name);
    getline (cin, address);
    cout<<name.length()<<endl;
    cout<<address.length()<<endl;
    string name_copy = name;
    cout<<name_copy<<endl;
    string gratified_name = "Excellent" + name+name;
    cout<<gratified_name<<endl;
    cout<<gratified_name.find(name);

}
