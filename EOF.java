import java.util.Scanner;
class Solution
{
public static void main(String args[])
{
int i=1;
Scanner reader = new Scanner(System.in);
while(reader.hasNext())
{
System.out.println(i + " " + reader.nextLine());
i++;
}
}
}


//BCD!! Very Important Task!!
// Games and GUI always take input dont ask for them in infinite loop!!
// reader.hasNext() takes infinite loop until EOF
