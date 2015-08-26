#include <iostream>
#include <iomanip>
using namespace std;
int main(){
	cout<<fixed<<setprecision(2);
	int a,b;	
	cin>>a;
	cin>>b;	
	switch(a){
		case 1:
			cout<<"Total: R$ "<<4.00*b<<"\n";
			break;
		case 2:
			cout<<"Total: R$ "<<4.50*b<<"\n";
			break;
		case 3:
			cout<<"Total: R$ "<<5.00*b<<"\n";
			break;
		case 4:
			cout<<"Total: R$ "<<2.00*b<<"\n";
			break;
		case 5:
			cout<<"Total: R$ "<<1.50*b<<"\n";
			break;
	}
	return 0;
}
