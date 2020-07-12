#include <iostream>
using namespace std;


int gcd(int a,int b,int& x,int& y){
    if(b==0){
        y=0;x=1;
        return a;
    }
    int x1,y1;
    int d=gcd(b,a%b,x1,y1);
    x=y1;
    y=x1-y1*(a/b);
 
    return d;
}

int main()
{
   
long long t,a,b,c,gc;
cin>>t;
for (int i = 1; i <= t; ++i)
{
cin>>a>>b>>c;
int x,y;
gc=gcd(a,b,x,y);
if(c%gc==0)
cout<<"Case "<<i<<": Yes"<<endl;
else
cout<<"Case "<<i<<": No"<<endl;

}
return 0;
}