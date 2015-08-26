#include <iostream>
using namespace std;
int main(){
	
	int T,N[1000];
	cin>>T;
	int i=0;
	for(int k =0; k<1000; k++){
		if(i == T)
			i=0;
		N[k]=i;			
		i++;	
		cout<<"N["<<k<<"] = "<<N[k]<<"\n";
		}
	
	return 0;
}

