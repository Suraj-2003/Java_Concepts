#include<iostream>
using namespace std;

int main()
{
    int iCnt = 0;
   int Arr[] = new int[5];

   Arr[0] = 10;
   Arr[1] = 20;
   Arr[2] = 30;
   Arr[3] = 40;
   Arr[4] = 50;
  
  for(iCnt = 0; iCnt<Arr.strlen; iCnt++)
  {
      cout<<Arr[iCnt];
  }
   
    return 0;
}