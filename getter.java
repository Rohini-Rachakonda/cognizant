import java.util.*;
class Fact{
int n,i, sum=1;
int  factorial(int n)
{
if(n==0||n==1)
return 1;
else 
return (n*factorial(n-1));
}

public static void main(String[] args){
Fact f=new Fact();

System.out.println(f.factorial(6));
}
}
