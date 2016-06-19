import java.util.HashMap;
import java.util.Arrays;


class IntArrayWrapper{
	int [] theArray = null;
	IntArrayWrapper(int [] _theArray){
		theArray = _theArray;
	}
	
	@Override
	public boolean equals(Object o){
		if ( (o instanceof IntArrayWrapper) 	&&
				java.util.Arrays.equals( ((IntArrayWrapper) o ).theArray, theArray)
			)  
		{
			return true;
		} else {
			return false;
		}
	}
	
	@Override public int hashCode() { 
		return (java.util.Arrays.hashCode(theArray) );
	}
}

public class java_map {
	public static void main(String[] args) {
		HashMap<IntArrayWrapper , String> theMap = new HashMap<IntArrayWrapper ,String>();
		int [] a = {1,3,4,5};
		int [] b = {1,3,4,5};
		int [] c = {1,3,5,5};
		theMap.put( new IntArrayWrapper(a) , "bye hi");
		
		
//		
		
//		theMap.put( , "bye hi");
		System.out.println(theMap.get(new IntArrayWrapper(c)));
	}
}
