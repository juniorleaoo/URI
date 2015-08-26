#include <iostream>
using namespace std;
int main(){
	int numero,aux,horas,minutos,segundos;
	cin>>numero;
	horas   = numero/3600;	
	minutos = numero/60;
	minutos = minutos%60;			
	segundos=numero%60;	
	cout<<horas<<":"<<minutos<<":"<<segundos<<endl;	
	return 0;
}
