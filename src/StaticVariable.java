
public class StaticVariable {
String name;
String address;
String city;

StaticVariable(String name,String address,String city){// constructor, the variables inside this constructor is local variable
	// we have to make it global variable like this;
	this.name=name;
	this.address=address;
	this.city=city;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable sv= new StaticVariable("bob","marthahalli","banglore");

	}

}
