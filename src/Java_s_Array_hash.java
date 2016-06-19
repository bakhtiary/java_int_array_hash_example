import java.util.Arrays;

public class Java_s_Array_hash {
	public static void main(String[] args) {

		    
	   // initializing int array
	   int[] ival = new int[] { 3, 5 ,12 };
	   
	   // hashcode for value1
	   //int retval = ival.hashCode();
	   int retval = java.util.Arrays.hashCode(ival);
	   
	   // printing hash code value
	   System.out.println("The hash code of value1 is: " + retval);
	   
	   // value2 for double array
	   ival=new int[] { 3, 5, 13, 1 };
	    
	   // hashcode for value2
//	   retval=ival.hashCode();
	   retval = java.util.Arrays.hashCode(ival);

	   // printing hash code value
	   System.out.println("The hash code of value2 is: " + retval);
	   
	}
}
