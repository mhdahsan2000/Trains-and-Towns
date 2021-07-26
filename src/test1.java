import java.util.Scanner; 


// Works only for one loop. 
public class test1 {


public static int n ; 
public static int i ; 



public static void main(String[]args) {
	
	Scanner input = new Scanner (System.in); 
	System.out.println("Enter the value of n") ; 
	n = input.nextInt(); 
	count(n);
	

	
	
}




public static void count(int val) {

	for (int i=0; i<val+1; i+=2) {
		System.out.println(i);
		if (i==n) {
			
			System.out.println("Do you want to continue") ; 
		}
		
		
	}
	
if (i==n) {
		
		System.out.println("Do you want to continue") ; 
	}
	
	
	
}



	
	
}