#include <iostream>
using namespace std;
int main(){
	char frase[34] = {'L','I','F','E',' ','I','S',' ','N','O','T',' ','A',' ','P','R','O','B','L','E','M',' ','T','O',' ','B','E',' ','S','O','L','V','E','D'};
	int i,n;
	string saida;
	cin>>n;
	for(i=0;i<n;i++)
		saida += frase[i];		
	cout<<saida<<"\n";
	return 0;
}
