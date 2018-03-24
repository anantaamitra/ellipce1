
package stringProgram;

import java.util.HashMap;

public class DuplicateWordCountmap {
	public static void main(String[] args)
	{
		String input="Welcome to Java welcome Session Session"; 		//Input String	
		String[] words=input.split(" ");	//Split the word from String
		//int wrc=1;							//Variable for getting Repeated word count
		HashMap<String, Integer> charCountMap = new HashMap<String, Integer>();
		for (String c : words)
        {
			if(charCountMap.containsKey(c.toLowerCase()))
			{
				charCountMap.put(c.toLowerCase(), charCountMap.get(c.toLowerCase())+1);
				
			}
			else
			{
				//If char is not present in charCountMap,
				//putting this char to charCountMap with 1 as it's value

				charCountMap.put(c.toLowerCase(), 1);
			}
		
		}
		System.out.println(charCountMap);
			
	}
}
	



