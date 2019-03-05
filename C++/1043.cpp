#include <iostream>
#include <iomanip>

using namespace std;
int main(){
	
	cout<<fixed<<setprecision(1);
	
	float a,b,c;
	cin>>a;
	cin>>b;
	cin>>c;
	
	if( (a+b>c) && (a+c>b) && (b+c>a)){
		cout<<"Perimetro = "<<a+b+c<<"\n";
	}
	else
		cout<<"Area = "<<((a+b)*c)/2<<"\n";
		
		return 0;
}
