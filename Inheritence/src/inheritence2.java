
public class inheritence2 {

	inheritence2() {
		System.out.println(">> Blocks Object Constructed");
	}

	// Property of Object
	// Block or Initialization Block
	{
		System.out.println(">> This is Block1");
	}

	{
		System.out.println(">> This is Block2");
	}

	// Property of Class
	static{
		System.out.println(">> This is static Block");
	}
	
	public static void main(String[] args) {

		System.out.println(">> Main Started");

		inheritence2 iRef1 = new inheritence2();
		inheritence2 iRef2 = new inheritence2();

		System.out.println(">> Main Finished");

		
	}

}
