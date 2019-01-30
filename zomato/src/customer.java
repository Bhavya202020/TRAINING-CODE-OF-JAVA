
public class customer {
String name;
String phone;
address[] addresses; // 1 to many
 //order[] orders; // 1 to many
 
 void setDetailsForCustomers(String name,String phone,address[] addresses) //orders[] orders)
 {
 this.name = name;
 this.phone= phone;
 this.addresses=addresses;
//this.orders = orders; 
}
 
 void showDetailsForCustomers() {
	 System.out.println("*********customers*************" +name);
	 
	 System.out.println("****phone****" +phone);
	 
	 System.out.println("****************ADDRESSES*************");
	 
	 for(address aRef : addresses){
			aRef.showAddressDetails();
		}
 
 }
}