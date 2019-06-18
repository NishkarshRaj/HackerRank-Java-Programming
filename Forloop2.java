import java.util.Scanner;
import java.lang.Math;
class Forloop2
{
public static void main(String args[])
{
int a,b,n,q,i,j,sum,k,p;
Scanner reader = new Scanner(System.in);
q = reader.nextInt();
for(i=0;i<q;i++)
{
a = reader.nextInt();
b = reader.nextInt();
n = reader.nextInt();
sum=a;
for(j=0;j<n;j++)
{  
p=1;
for(k=0;k<j;k++)
{
p=p*2;
}
sum = sum + (b*p);
System.out.print(sum + " ");
}
System.out.println("");
}
}
}