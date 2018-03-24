package stringProgram;

public class StringPlindrome {
	public static void main(String[] args)
	{
		String input="121";
		int len=input.length();
		String temp1="";
		for(int i=len-1;i>=0;i--) {
			temp1=temp1+input.charAt(i);
		}
		if(input.equals(temp1)) {
			System.out.println("Entered string is a palindrome.");
		}
		
	}
}
	/*public static void main(String args[])
	   {
	      String original, reverse = ""; // Objects of String class
	      Scanner in = new Scanner(System.in);
	 
	      System.out.println("Enter a string to check if it is a palindrome");
	      original = in.nextLine();
	 
	      int length = original.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         reverse = reverse + original.charAt(i);
	 
	      if (original.equals(reverse))
	         System.out.println("Entered string is a palindrome.");
	      else
	         System.out.println("Entered string is not a palindrome.");
	 
	   }*/

