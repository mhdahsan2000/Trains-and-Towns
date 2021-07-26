import java.util.Scanner ; 
import java.lang.Math ; 

/*
 * Program designed for the audiocc assesment 
 * author : Mohammed ahsan 
 * created on : 12/02/2021
 * 
 * */
public class termcalculator {
	
	public static void main(String[]args) {
	
	double number1= 0.0 , number2 = 0.0 ; 
	char operator1 = '\0' ; 
	
	
	// Creating a scanner class object 
	
	Scanner input = new Scanner(System.in) ; 
	System.out.println("Enter the two numbers to start COMPUTATION : ") ; 
	
	number1 = input.nextDouble() ; 
	number2 = input.nextDouble() ; 
	
    // OPERATORS AVAILABLE 
	
	System.out.println("The Avaialable operators are :: (+ - * / % ^)");
	System.out.println("ENTER THE MATHEMATICAL OPERATION TO BE CARRIED OUT: ") ;
	
	
	operator1 = input.next().charAt(0) ; 
	
	switch(operator1) {
	
	case '+': 
		System.out.println("FINAL OUTPUT = "+ (number1+number2)) ;
		 break ; 
		
	
	case '-' : 
		System.out.println("FINAL OUTPUT = "+ (number1-number2)) ;
		break ; 
	
		
	case '*' : 
		System.out.println("FINAL OUTPUT = "+ (number1*number2)) ;
		break ; 
	
		
	case '/' : 
		System.out.println("FINAL OUTPUT = "+ (number1/number2)) ;
		break ; 
		
	
	case '%' : 
		System.out.println("FINAL OUTPUT = "+ (number1%number2)) ;
		break ; 
		
		
	case '^' : 
		System.out.println("FINAL OUTPUT = "+ Math.pow(number1,number2)) ;
		break ; 	
		
	default : 
		System.out.println("Invalid Operator or command") ; 
		
	}
	
	
	input.close() ; 
	}
}
