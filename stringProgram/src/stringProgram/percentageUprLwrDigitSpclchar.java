package stringProgram;

public class percentageUprLwrDigitSpclchar {
	public static void main(String args[]) {
		String ipString="I@# Love14* You2458";
		int lower=0,upper=0,spcl=0,digit=0;
		for(int i=0;i<ipString.length();i++)
		{
			char ch=ipString.charAt(i);
			if(Character.isLowerCase(ch)) {
				lower++;
			}
			else if(Character.isUpperCase(ch)) {
				upper++;
			}
			else if(Character.isDigit(ch)) {
				digit++;
			}
			else {
				spcl++;
			}
		}
		System.out.println(lower);
		System.out.println(upper);
		System.out.println(digit);
		System.out.println(spcl);
		
	}

}
