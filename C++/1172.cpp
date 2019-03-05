#include <iostream>
using namespace std;
int main(){
	int X[10];
	for(int i =0;i<10;i++)
		cin>>X[i];
	for(int i=0;i<10;i++){
		if(X[i]<0 || X[i]==0)
		X[i]=1;
	}
	for(int i =0;i<10;i++)
		cout<<"X["<<i<<"] = "<<X[i]<<"\n";
	return 0;
}
