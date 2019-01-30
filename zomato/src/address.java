//model or bean or POJO(plain old java object)
public class address {
double latitude;
double longitude;
String addrsLine;
String city;
int Zipcode;
String label;
void setAddressDetails(double latitude,double longitude,String addrsLine,String city,int Zipcode,String label)
{
this.latitude=latitude;
this.longitude=longitude;
this.addrsLine=addrsLine;
this.city=city;
this.Zipcode=Zipcode;
this.label=label;
}
void showAddressDetails() {
	System.out.println("latitude is: "+latitude);
	System.out.println("longitude is: " +longitude);
	System.out.println("Address Line Is: " +addrsLine);
	System.out.println("City is: "+city);
	System.out.println("Zipcode Is: "+Zipcode);
    System.out.println("Label Is: "+label);
}
}
