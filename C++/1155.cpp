#include <iostream>
#include <iomanip>
using namespace std;
int main(){
	cout<<fixed<<setprecision(2);
	double S=0;
	for(int i=1;i<=100;i++)
		S=S+(1.0/i);
	cout<<S<<"\n";
	return 0;
}
