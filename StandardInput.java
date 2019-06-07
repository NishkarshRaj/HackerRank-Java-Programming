import java.util.*;

public class StandardInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
	
	scan.close(); //Always close every Scanner object for better Computer performance
	//BCD!! not necessary to use nextLine for strings next is enough because default input is always String
    }
}

