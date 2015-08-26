#include <iostream>
#include <iomanip>
using namespace std;
int main(){
	double n,soma,cont = 0;
	for(int i=0;i<6;i++){
		cin>>n;
		if(n>0){
			soma = soma+n;
			cont++;			
		}
	}
	soma = soma/cont;
	cout<<cont<<" valores positivos\n";
	cout<<fixed<<setprecision(1)<<soma<<"\n";
	
	return 0;
}
