import java.util.Arrays ; 
import java.util.Scanner ; 


public class Solution {
    
    public static int n ; 
    public static int count  ; 
    public static int paircount ; 
    public static int finalanswer ; 
    

    public static void main (String[]args){
        
        Scanner in = new Scanner(System.in) ; 
        System.out.println("Enter the size of the array") ; 
        n = in.nextInt() ; 
        int arr1[] = new int[n] ; 
        
        System.out.println("Enter the array elements ");
        for (int i=0 ; i<n ; i++){
            
            arr1[i] = in.nextInt() ; 
        }
        
       for(int i=0 ; i < arr1.length-1 ; i++){ 
          for (int j=i+1 ; j < arr1.length ; j++){
            
            if (arr1[i] == arr1[j]){
              count ++ ;
            }
        }
       }
       
        
       
       
        System.out.println("Number of pairs is : ");
        System.out.println(count) ; 
        
    }
        
        
    
}