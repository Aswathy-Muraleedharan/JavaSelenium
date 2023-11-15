
public class PatternOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		for(int i=0;i<4;i++) {
			System.out.println("");
			for(int j=1;j<=4-i;j++) {
				System.out.print(a +" ");
				a++;
				
			}
		}
	}

}
