package stringProgram;

import org.apache.commons.lang3.StringUtils;

public class SubSrting {
	

	public static void main (String Args[]) {
		
	String str = "caabccaabcccasrcaabc";
	String findStr = "caabc";
	int lastIndex = 0;
	int count = 0;

	while(lastIndex != -1){

	    lastIndex = str.indexOf(findStr,lastIndex);

	    if(lastIndex != -1){
	        count ++;
	        lastIndex += findStr.length();
	    }
	}
	System.out.println(count);
	System.out.println(StringUtils.countMatches(str, findStr));

	}
}