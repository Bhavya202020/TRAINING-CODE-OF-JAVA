
public class numerical2 {

	public static int getDecimal(int binary){  
	    int decimal = 0;  
	    int n = 0;  
	    int sum = 0;
	    while(true){  
	      if(binary == 0){  
	        break;  
	      } else {  
	          int temp = binary%10;  
	          decimal += temp*Math.pow(2, n);  
	          binary = binary/10;  
	          n++;  
	          sum = sum + n;
	          
	          
	       }  
	    }  
	    return decimal;  
	}  
	public static void main(String args[]){    
	System.out.println("Decimal of 1 is: "+getDecimal(1));  
	System.out.println("Decimal of 10 is: "+getDecimal(10));  
	System.out.println("Decimal of 101 is: "+getDecimal(101));  
	System.out.println("Decimal of 1010 is: "+getDecimal(1010)); 
	System.out.println("Decimal of 10101 is: "+getDecimal(10101)); 
	System.out.println("sum = "+getDecimal(100111));
	
	
	}}    

