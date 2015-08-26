#include <iostream>
using namespace std;
int main(){
	int n,aux,pos=0;
	for(int i = 1;i<101;i++){
		cin>>n;
		if(n>aux){
			aux = n;
			pos = i;
		}
	}
	cout<<aux<<"\n";
	cout<<pos<<"\n";	
	return 0;
}
