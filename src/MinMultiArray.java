
public class MinMultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			
			int abc[][]= {{2,2,3},{4,5,6},{7,8,9}};
			int minNumber=abc[0][0];
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(abc[i][j]<minNumber) {
						minNumber=abc[i][j];
						
					}
				}
			
				
				}
			System.out.println(minNumber);
		}


	}


