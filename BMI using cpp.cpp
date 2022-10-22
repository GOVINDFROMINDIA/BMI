#include <bits/stdc++.h>
using namespace std;
int main()
{ 
    float h,m,index;
    cout<<"Enter the height(cm)";
    cin>>h;
    cout<<"Enter the Weight(kg)";
    cin>>m;
    index = m/(h*h/10000);
    cout<<"BMI is "<<index<<endl;
    if (index<18.5)
        cout<<"UNDERWEIGHT";
    else if (index>18.5 &&index<24.5)
        cout<<"HEALTHY!";
    else if (index>24.5 &&index<29.5)
        cout<<"OVERWEIGHT";
    else
        cout<<"OEXTREME OBESE";
    return(0);    
}