class Minmax{
public static void main(String[] args)
{
int []arr={10,6,5,13};
int s=0,i,j,t,avg;
for(i=0;i<arr.length;i++)
{
for(j=0;j<arr.length;j++)
{

if(arr[i]<arr[j])
{
t=arr[i];
arr[i]=arr[j];
arr[j]=t;
}
}
}
for(i=0;i<arr.length;i++)
System.out.println(arr[i]);//ascending
for(i=arr.length-1;i>=0;i--)
System.out.println(arr[i]);//descending
System.out.println("min"+arr[0]);//min
System.out.println("max"+arr[arr.length-1]);//max
for(i=0;i<arr.length;i++)
{
s=s+arr[i];
}
System.out.println("sum"+s);
avg=(s/arr.length);
System.out.println("avg"+avg);
}
}
