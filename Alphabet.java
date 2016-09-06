package guvi;


import java.util.Scanner;

public class Alphabet 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		   System.out.println("Enter anything"); 
		   String line = in.nextLine();
		   char c = line.charAt(0);
		   if( Character.isDigit(c))
		   System.out.printf("%s is not an alphabet",c);
		   else if (Character.isLetter(c))
		   System.out.printf("\n %s It is an alphabet",c);
		
	}
}
