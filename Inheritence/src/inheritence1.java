// #Rule1 -> Before Object of Child, Parent Object is constructed in memory !!
		// #Rule2 -> Constructors are Not Inherited
		// #Rule3 -> Private is Not Inherited



class CA{

	int a;
	static int b;

	void show(){
		System.out.println("This is show of CA Object");
	}
//OVERLOADING:Parent And Child Class Data Are Write Out Collectively.
	void setDataForCA(int a) {
		this.a =a;
	}
	
	//*********************************************
//OVERRIDING:Parent And Child Class Data Will Be Collectively Read Out.
	//*********************************************
	void showDataForCA() {
		System.out.println("A Is:" +a);
	}
	static void hello(){
		System.out.println("This is hello of CA Class");
		System.out.println("b is:" +b);
	}

}

class CB extends CA{

}

public class inheritence1 {

	public static void main(String[] args) {


		CB cRef = new CB();
		cRef.show();
		CB.hello();
		
		
	//**********************************************************
	//hello() is a static method i.e method of class.
	//That's why we call its method by using its class name.
	//We can also call it by using object.
	//but it will give u a warning message.
	//**********************************************************
				
		cRef.setDataForCA(110);
		cRef.showDataForCA();
		CB.b = 200;
		CB.hello();

		
	}

}
