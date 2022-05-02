#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;

int main() {

	int n,t;
	cin>>t;
	for(int i=1;i<=t;i++)
	{
	cin>>n;
	if(n%2==1)
	{
		cout<<0<<endl;continue;
	}
	long x=sqrt(n);
	int cnt=0;
	for(long long i=1;i<=x;i++)
	{
		if(!(n%i))
		{
			if(!(i%2))
			{
				cnt++;
			}
			if(i*i!=n)
			{
				if(!(n/i%2))
				{
					cnt++;
				}
			}
		}
	}
	cout<<cnt<<endl;
	}
}
