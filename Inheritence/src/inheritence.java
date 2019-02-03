//Parent Class
class Parent {
	//method of object or u can say property of object.
	void purchaseBike() {
		System.out.println("lets buy pulsar");
	}
	//method of class or u can say property of class
	static void purchaseCar() {
		System.out.println("lets buy honda city");
	}
}
//Child Class Which Inherited All The Properties Of The Parent Class.
//Extend Keyword Is Used For Inheritence
class Child extends Parent {
	//We are using the same method name as that of parent class
	//but with different inputs.
	
	//*********************************************
	//OVERRIDING:Parent And Child Class Data Will Be Collectively Read Out.
	//*********************************************
void purchaseBike() {
	System.out.println("Lets Buy Royal Enfield");
}
//**************************************************
//HIDING : Class To Class Inheritence Called Hiding.
//Class To Class Means Static To Static.
//**************************************************
 static void purchaseCar() {
	System.out.println("Lets Buy Swift Desire");
}
}

public class inheritence {

	public static void main(String[] args) {
        // new keyword is used for object construction.
		
		
		Child ch = new Child();
		
		
		ch.purchaseBike();
		//**********************************************************
		//Purchase Car is a static method i.e method of class.
		//That's why we call its method by using its class name.
		//We can also call it by using object.
		//but it will give u a warning message.
		//**********************************************************
		
		//We can call the methods by using their parent class
		//as well as child class.
		Parent.purchaseCar();
		Child.purchaseCar();

	}

}
