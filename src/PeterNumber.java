import java.util.Arrays ; 
import java.util.Scanner ; 
import java.lang.Math; 


/*
 * Assignment part 2 solution PETER NUMBER
 * 
 * */

public class PeterNumber {
	
	public static void main(String[]args) {
		
		try{
		 Scanner input = new Scanner(System.in); 
		 System.out.println("Enter the input number") ;
		 boolean complete = true  ;
		 Long input1 = input.nextLong(); 
		 if (input1 < 0 || input1 > Math.pow(10, 18)) {
			 System.out.println("Invalid Input") ; 
		 }
		 input.close();
		 //System.out.println(input1) ;
		 long [] intArray = compute(input1.toString()) ;
		 //System.out.println(isSorted(intArray)) ;
		
		if (isSorted(intArray)) {
			System.out.println("Input:"+input1+"    Output:"+input1) ;  
		}else {
			Long input2 = input1 ; 
			while(complete == true ) {
				 input1 = input1 - 1  ; 
				 long [] intArray2 = compute(input1.toString()) ;
				if (isSorted(intArray2)) {
					System.out.println("Input:"+input2+"    "+"Output:"+input1) ; 
					complete = false ;
				}
			}
		}
		}catch(Exception e) {
			System.out.println("Invalid Input") ; 
			
		}
	}
	
	static long[] compute(String input1) {
		
		String[] strArray = input1.split("");
		long[] intArray = new long[strArray.length];
		for(int i = 0; i < strArray.length; i++) {
		    intArray[i] = Integer.parseInt(strArray[i]);
		}
		return intArray ; 
	}
	
	
	static boolean isSorted(long[] array) 
	{ for (int i = 0; i < array.length - 1; i++) { if (array[i] > array[i + 1]) return false; } return true; }
	
}

