#include <iostream>
using namespace std;
class AbstractionEx{
private:
   int num;
   char ch;

public:
   void setMyValues(int n, char c) {
      num = n; ch = c;
   }
   void getMyValues() {
      cout<<"Numbers is: "<<num<< endl;
      cout<<"Character is: "<<ch<<endl;
   }
};
int main(){
    int Value; char chr;
   AbstractionEx obj;
   cout<<"Enter Value: "<<endl;
   cin>>Value;
   cout<<"Enter character :"<<endl;
   cin>>chr;
   obj.setMyValues(Value, chr);
   obj.getMyValues();
   return 0;
}
