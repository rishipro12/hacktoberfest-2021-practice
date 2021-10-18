#include<iostream>
using namespace std;
class Shop {
public:
  Shop(){
    cout<<"TOY SHOP"<<endl;
  }
  string ShopName = "Monami's Toy";
};
//This class inherits Shop class
class GToy: public Shop {
public:
  GToy(){
    cout<<"Girl's Toy"<<endl;
  }
  string Toy = "Doll";
  string name = "Alayna";
};
int main() {
  GToy obj;
  cout<<"Name: "<<obj.name<<endl;
  cout<<"Shop Name: "<<obj.ShopName<<endl;
  cout<<"Toy name: "<<obj.Toy<<endl;
  return 0;
}
