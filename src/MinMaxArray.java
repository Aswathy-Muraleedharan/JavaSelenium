
public class MinMaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int j=0;
		int minColumnNumber=0;
		int abc[][]= {{2,4,5},{3,5,7},{11,45,9}};
		int minNumber=abc[0][0];
		for(i=0;i<3;i++) {
			for(j=0;i<3;j++) {
				if(abc[i][j]<minNumber)
				{
					minNumber=abc[i][j];
					minColumnNumber=j;
				}
			}
		}
		System.out.println(minNumber);
		
		
	}

}
