
public class thisDemo {
	int a =2;
	public void getData() {
		int a=3;
		System.out.println(a);
		System.out.println(this.a);
		int b= a+this.a;
		System.out.println("Sum is"+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisDemo thisdemo = new thisDemo();
		thisdemo.getData();

	}

}
