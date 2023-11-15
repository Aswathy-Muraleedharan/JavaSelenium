
public class ChildSuperDemo extends ParentSuperDemo {
	public ChildSuperDemo() {
		super();//this should come in the first line
		//System.out.println("Child class constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildSuperDemo cd=new ChildSuperDemo();
		//cd.getData();
		
	}
	public void getData() {
		System.out.println("I m child class");
		super.getData();
	}
	

}
