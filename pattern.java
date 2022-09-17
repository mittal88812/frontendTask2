import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner y = new Scanner(System.in);
		int n = y.nextInt();
		
		utils(n);
	}
	
	public static void utils(int n){
	    
	    for(int i=1; i<=n; i++){
	        
	        for(int j=i; j<n; j++)
	            System.out.print("  ");
	        
	        int num = 1;
	        for(int j=1; j<=i; j++){
	            System.out.print(num + " ");
	            num += 2;
	        }
	        
	        int ch = 65;
	        for(int j=1; j<i; j++){
	         
	            System.out.print((char)(ch) + " ");
	            ch += 1;
	        }
	        
	        System.out.println();
	    }
	    
	    for(int i=1; i<n; i++){
	        
	        for(int j=n-i; j<n; j++)
	            System.out.print("  ");
	            
	        int num = 1;
	        for(int j=1; j<= n-i; j++){
	            
	            System.out.print(num + " ");
	            num += 2;
	        }
	        
	        int ch = 65;
	        for(int j=1; j< n-i; j++){
	            
	            System.out.print((char)(ch) + " ");
	            ch += 1;
	        }
	        
	        System.out.println();
	    }
	}
}

