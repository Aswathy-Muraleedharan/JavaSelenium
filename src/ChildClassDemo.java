
public class ChildClassDemo extends ParentClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClassDemo childclassdemo= new ChildClassDemo();
		childclassdemo.colour();
		childclassdemo.brek();
		childclassdemo.audioSystem();
	}
	public void engine() {
		System.out.println("new engine");
	}
	public void colour() {
		System.out.println("new colour");
	}
	public void audioSystem() {
		System.out.println("audio of child");
	}
}
