public class ArrayAswin {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int indexOfThree =0;
		int indexOfFive=0;
		int i=0;
		int k=0;
		int difference=0;
		int array[]= {1,3,2,4,5,1};	
		//distance b/w 3 and 5
		for(i=0;i<array.length;i++) {
			if(array[i]==3) {
				indexOfThree=i;
				System.out.println("Index of 3 is "+ i);
				break;
			}	
		}
		for(k=0;k<array.length;k++) {	
			if(array[k]==5) {
				indexOfFive=k;
				System.out.println("Index of 5 is "+ k);
				break;
			}
		}
		System.out.println(k);
		 difference = k-i;
		System.out.println("Difference of index from 3 to 5 is "+difference);		
	}

}
