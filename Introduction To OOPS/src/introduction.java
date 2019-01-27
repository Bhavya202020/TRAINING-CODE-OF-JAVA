// Textual Representation of an Object
// Whatever you will write in class, will be property of Object !!
class User{

	// Attributes
	// Property of Object and Not of Class
	// Here we consider PHOTO as an Object
	//and the given details of photo are its attributes.
	String PhotoTakenOn;
	String FileInfo;
	String LocalPath;
	String AppName;
	long pixel;
}


public class introduction {

	public static void main(String[] args) {

		// Object Construction Statement
		User uRef1 = new User();	// MVC
		// uRef1 are not Objects !!
		// uRef1 are Reference Variables !!

				// Write Data in Object !!
		uRef1.PhotoTakenOn = "January 27,2019";
		uRef1.FileInfo = "Jpg File";
		uRef1.LocalPath = "Whatsapp Images";
		uRef1.AppName = "Whatsapp";
		uRef1.pixel = 748_1024;
		
				// Read Data from Object
		System.out.println("Photo Taken On: "+uRef1.PhotoTakenOn);
		System.out.println("File Info Is: " +uRef1.FileInfo );
		System.out.println("Local Path Is: " +uRef1.LocalPath );
		System.out.println("App Name Is: " +uRef1.AppName );
		System.out.println("Pixel Value Is: " +uRef1.pixel+"px");
		
		// Delete Object
		// -> This is taken care by Garbage Collector !!
		//System.gc(); // Execute GC


	}

}
