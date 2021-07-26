import java.util.* ; 
import java.io.* ; 
import java.util.Scanner ; 
import java.lang.Math ; 



public class CatandMouse {
    
	
	/*
	 * This is the solution to the Cats and a Mouse program in Java.(Hackerrank) 
	 * 
	 * */
	
	
    public static int n ; 
    
    
    
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in) ; 
        n = input.nextInt() ; 
        int i = 0 ; 
        
        while (i<n){
       
        int x = input.nextInt() ; 
        int y = input.nextInt() ; 
        int z = input.nextInt() ; 
        
        if (Math.abs(x-z) < Math.abs(y-z)){
            System.out.println("Cat A") ; 
        }else if (Math.abs(x-z) > Math.abs(y-z)){
            System.out.println("Cat B") ; 
        } else {
            
            System.out.println("Mouse C") ; 
        }
        
        i++ ;     
        }
            
              
    }
    
    
    
    
    
    
    
    
    
    
    
}