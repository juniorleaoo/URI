#include <iostream>
using namespace std;
int main(){
	int idade,ano,mes,dia,aux;
	cin>>idade;
	
	ano = idade/365;
	aux = idade%365;
	mes = aux/30;
	dia = aux%30;
	
	cout<<ano<<" ano(s)\n";
	cout<<mes<<" mes(es)\n";
	cout<<dia<<" dia(s)\n";
	
	return 0;
}
