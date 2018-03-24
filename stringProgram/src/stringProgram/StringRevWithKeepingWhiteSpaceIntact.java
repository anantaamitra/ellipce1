 package stringProgram;

public class StringRevWithKeepingWhiteSpaceIntact {
	public static void main(String args[]) {
		String ipString="I Love You";
		char[] ipStringArray=ipString.toCharArray();
		char[] revIpStringArray=new char[ipStringArray.length];
 
		for(int i=0;i<ipStringArray.length;i++) {
			if(ipStringArray[i] == ' ') {
				revIpStringArray[i]=' ';
			}
		}
		int j = revIpStringArray.length-1;
		for(int i=0;i<ipStringArray.length;i++) {
			if(ipStringArray[i] !=' ') {
				if(revIpStringArray[j]==' ') {
					j--;
				}
				revIpStringArray[j]=ipStringArray[i];
				j--;
			}
		}
		System.out.println(revIpStringArray);
 }
}
