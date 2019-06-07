import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n%2==1)
        {
            System.out.println("Weird");
        }
        else
        {
            if((n>=2)&&(n<=5))
            {
                System.out.println("Not Weird");
            }
            if((n>=6)&&(n<=20))
            {
                System.out.println("Weird");
            }
            if(n>20)
            {
                System.out.println("Not Weird");
            }
        }
        scanner.close();
    }
}
