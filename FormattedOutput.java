import java.util.Scanner;
public class FormattedOutput {

    public static void main(String[] args)
 {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
	    {
                String s1=sc.next();
                int x=sc.nextInt();
		while(s1.length()<15)
		{
			s1=s1+" ";
		}
		String z = Integer.toString(x);
		while(z.length()<3)
		{
		z="0"+z;
		}
		System.out.println(s1 + z);
            }
            System.out.println("================================");

    }
}

// .length() is only used for Strings
// To convert Integer to Strings => Integet.toString()



