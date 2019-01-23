package arrays;

public class array {
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


	public static void main(String[] args) {
     
		int matrix[][] = {
				{1,0,1,0,1},
				{0,0,1,0,1},
				{1,1,1,0,1},
				{1,1,1,0,1},
				{0,0,0,0,1}
		};
	int row , column;
	for(row = 0; row < 5; row++) {
		for(column = 0; column < 5; column++)
			System.out.print( " " + matrix[row][column]);
		System.out.println();
		
		
	}
System.out.println("Decimal of 10101 is: "+getDecimal(10101));
System.out.println("Decimal of 10110 is: "+getDecimal(10110)); 
System.out.println();
int a = 21;
int b = 22;
int c = a + b;
System.out.println("The value of c is: "+c);
    System.out.println();


	}

}

