#include <iostream>
using namespace std;
int main(){
	int vet[3];
	int vet2[3];
	int aux;
	for(int i=0;i<3;i++)
		cin>>vet[i];
	for(int i=0;i<3;i++)		
		vet2[i]=vet[i];
	for(int i=0;i<3;i++){
		for(int j=i+1;j<3;j++){
			if(vet2[i]>vet2[j]){
				aux = vet2[i];
				vet2[i]=vet2[j];
				vet2[j]=aux;
			}
		}
	}
	for(int i=0;i<3;i++)
		cout<<vet2[i]<<endl;
	cout<<endl;
	for(int i=0;i<3;i++)
		cout<<vet[i]<<endl;
	return 0;
}
