#include <iostream>
#include <math.h>
#include <iomanip>
using namespace std;
int main(){
	cout<<fixed<<setprecision(5);
	float A,B,C,delta,R1,R2;
	while(cin>>A>>B>>C){
	delta=pow(B,2)-4*A*C;
	if((delta<0) || (A==0)){
		cout<<"Impossivel calcular\n";
	}
	else{	
	R1=(-B+sqrt(delta))/(2*A);
	R2=(-B-sqrt(delta))/(2*A);
	cout<<"R1 = "<<R1<<endl<<"R2 = "<<R2<<endl;
	}
}
	return 0;
}
