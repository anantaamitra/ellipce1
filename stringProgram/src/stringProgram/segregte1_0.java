package stringProgram;

import java.util.ArrayList;
import java.util.List;

public class segregte1_0 {
	public static void main(String[] args)
	{
		 int[] intArray = new int[]{ 1,0,1,0,0,0,1};
		 List<Integer> arrlist=new ArrayList<>();
		 for(int i=0;i<intArray.length;i++) {
			 if(intArray[i]==0) {
				 arrlist.add(0);
			 }
		 }
		 for(int i=0;i<intArray.length;i++) {
			 if(intArray[i]==1) {
				 arrlist.add(1);
			 }
		 }
		 System.out.println(arrlist);
	}
}
