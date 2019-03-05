#include <iostream>
using namespace std;
int main(){
	int numero;
	cin>>numero;
		cout<<numero<<"\n";
		cout<<numero/100<<" nota(s) de R$ 100,00\n";
		numero=numero%100;
		cout<<numero/50<<" nota(s) de R$ 50,00\n";
		numero=numero%50;
		cout<<numero/20<<" nota(s) de R$ 20,00\n";
		numero=numero%20;
		cout<<numero/10<<" nota(s) de R$ 10,00\n";
		numero=numero%10;
		cout<<numero/5<<" nota(s) de R$ 5,00\n";
		numero=numero%5;
		cout<<numero/2<<" nota(s) de R$ 2,00\n";
		numero=numero%2;
		cout<<numero/1<<" nota(s) de R$ 1,00\n";	
	return 0;
}
