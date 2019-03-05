#include <iostream>
#include <iomanip>
using namespace std;
int main(){
	float X[100];
	cout<<fixed<<setprecision(1);
	for(int i =0;i<100;i++)
		cin>>X[i];
	for(int i =0;i<100;i++){
		if(X[i]<11)
			cout<<"A["<<i<<"] = "<<X[i]<<"\n";
	}
	return 0;
}
