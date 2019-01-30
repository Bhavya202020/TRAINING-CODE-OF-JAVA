
public class zomatoapp {

	public static void main(String[] args) {
		
		address[] arr = new address[2];
		
		for(int i=0; i<arr.length; i++ ) {
		arr[i] = new address();
		
		
	}
 arr[0].setAddressDetails(32.220,45.542,"redhood shores","ldh",141002,"home");
 
 arr[1].setAddressDetails(32.2410,45.1442,"redhood1 shores","asr",141402,"home2");
 
 customer c1 = new customer();
 c1.setDetailsForCustomers("John", "+91 99999 88888", arr);
 
	c1.showDetailsForCustomers();
	System.out.println();

 
	}

}
