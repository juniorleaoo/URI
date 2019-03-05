#include <iostream>
using namespace std;
int main(){
	string vet[13] = {"\0","January","February","March","April","May","June","July","August","September","October","November","December"};
	int a;
	while(cin>>a)
		cout<<vet[a]<<endl;	
	return 0;
}
