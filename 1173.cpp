#include <iostream>
using namespace std;
int main(){
	int V,N[10];
	cin>>V;
	for(int i=0;i<10;i++){
		N[i]=V;		
		V=V+V;
		cout<<"N["<<i<<"] = "<<N[i]<<"\n";		
	}	
	return 0;
}
