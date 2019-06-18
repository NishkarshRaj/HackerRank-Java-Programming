import java.util.Scanner;
class Forloop
{
public static void main(String args[])
{
int N,i;
Scanner reader = new Scanner(System.in);
N = reader.nextInt();
for(i=1;i<=10;i++)
{
System.out.println(N + " x " + i + " = " + N*i);
}
}
}