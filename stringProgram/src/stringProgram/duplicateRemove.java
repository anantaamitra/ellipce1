 package stringProgram;

import java.util.ArrayList;
import java.util.List;

public class duplicateRemove {
	public static void main(String Args[]) {
		String input="abcdefabcgh";
		char[] arr=input.toCharArray();
		List<Character> arrR=new ArrayList<>();
		for(char c:arr) {
			if(!arrR.contains(c)) {
				arrR.add(c);
			}
		}
		System.out.println(arrR);
		
	}

}
