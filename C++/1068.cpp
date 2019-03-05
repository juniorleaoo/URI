#include <iostream>
using namespace std;
int main(){
	string n;
	while(getline(cin,n)){	
	int cont1 = 0,cont2 = 0;
	for (int i = 0; i<n.length();i++){
		if( n[i] == '(' )
			cont1++;
		if( n[i] == ')' )
			cont2++;
	}
	if(cont1 == cont2)
		cout<<"correct"<<"\n";
	else (cont1 != cont2)
		cout<<"incorrect"<<"\n";
}
	return 0;
}
