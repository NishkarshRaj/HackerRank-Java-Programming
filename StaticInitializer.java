import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
static int B,H;
static boolean flag;
//static block initialization
static
{   
    Scanner reader = new Scanner(System.in);
    try
    {
        B = reader.nextInt();
        H = reader.nextInt();
        if((B<=0)||(H<=0))
        {
            throw new Exception("Breadth and height must be positive");
        }
        flag=true;
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
public static void main(String[] args){
		if(flag){ //unline c/cpp integer not acceptable like 1 is true only boolean conditions
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

