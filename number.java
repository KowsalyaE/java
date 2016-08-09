import java.util.*;
public class number
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
        if(a>0)
	{
	System.out.println("the number is positive");
	}
	else if(a<0)
	{
	System.out.println("the number is negative");
	}
	else if(a==0)
	{
	System.out.println("the number is zero");
	}
	
}
}