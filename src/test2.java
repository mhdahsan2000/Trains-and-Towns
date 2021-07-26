import java.io.* ; 
import java.util.Scanner ; 
import java.util.Arrays  ; 

public class test2{
    
    public static int b ;
    public static int n ; 
    public static int m ; 
    public static int max = 0  ; 
    public static int max2 = 0  ; 
    public static int mixedmax = 0 ; 
    public static int mixedsum = 0 ;
    
    
    public static void main (String[] args){
        
        Scanner input = new Scanner (System.in) ; 
        b = input.nextInt ()  ;   // budget 
        n = input.nextInt ()  ;   // number of keyboards 
        m = input.nextInt ()  ;   // number of mouse
        
         
        int  [] keyboard = new int[n] ; 
        int [] drives = new int[m]  ;
        int [] resultsum = new int [10] ; 
        
        
        for (int i = 0 ; i<keyboard.length ; i++){
            
            keyboard[i] = input.nextInt()  ; 
            
        }
        
        for (int j=0 ; j<drives.length ; j++){
            
            drives[j] = input.nextInt() ; 
            
        }
        
        
        for (int i=0; i<keyboard.length ; i++){

                max = keyboard[i]   ;
        }
        
        for (int i=0; i<drives.length ; i++){
            
                max2 = drives[i]   ;
        }
        
        mixedsum = max + max2 ; 
        
        for (int i=0 ; i<resultsum.length ; i++){
            
            resultsum[i] = mixedsum ; 
            
            
        }
        
        
        if (mixedsum < b){
           System.out.println(mixedsum) ; 
        }
        
        
        
        if (mixedsum > b){
            
            System.out.print("-1") ;
            
        } 
        
        
    }
    
    
    
    
    
} 
