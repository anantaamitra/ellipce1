package stringProgram;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class charOccuranceInString {
	
	  public static void main(String[] args)
		{
			
			String inputString="abbba";

			//Creating a HashMap containing char as a key and occurrences as  a value

			HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

			//Converting given string to char arrayS

	        char[] strArray = inputString.replaceAll("\\s+","").toLowerCase().toCharArray();

	        //checking each char of strArray

	        for (char c : strArray) 
	        {
				if(charCountMap.containsKey(c))
				{
					//If char is present in charCountMap, incrementing it's count by 1

					charCountMap.put(c, charCountMap.get(c)+1);
				}
				else
				{
					//If char is not present in charCountMap,
					//putting this char to charCountMap with 1 as it's value

					charCountMap.put(c, 1);
				}
			}
	        int max=0;
	        Set<Entry<Character, Integer>> entryset=charCountMap.entrySet(); 
	        Object ch=null;
	        for (Entry<Character, Integer> entry: entryset )
	        {
	        	if (entry.getValue()>max) {
					max=entry.getValue(); 
					ch=entry.getKey();
	        	}
			}
	        
	        System.out.println("The most repeated word in input file is : "+ch);
            
            System.out.println("Number Of Occurrences : "+max);
	        System.out.println(charCountMap);
	        for (char c : strArray)
	        {
	            if (charCountMap.get(c) == 1)
	            {
	                System.out.println("First Non-Repeated Character In '"+inputString+"' is '"+c+"'");
	                 
	                break;
	            }
	        }
	         
	        //checking for first repeated character
	         
	        for (char c : strArray)
	        {
	            if (charCountMap.get(c) > 1)
	            {
	                System.out.println("First Repeated Character In '"+inputString+"' is '"+c+"'");
	                 
	                break;
	            }
	        }
//	        Map<Character, Integer> map = new TreeMap<Character, Integer>(charCountMap); 
//	        //Printing the charCountMap
//
//	        System.out.println(map);
		}

}


