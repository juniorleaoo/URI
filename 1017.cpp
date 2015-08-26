#include <iostream>
#include <iomanip>

using namespace std;
int main(){
	
	cout<<fixed<<setprecision(3);
	double horas,velocidade;
	cin>>horas;
	cin>>velocidade;
	cout<<(horas*velocidade)/12<<"\n";
	
	return 0;
}
