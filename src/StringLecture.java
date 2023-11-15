
public class StringLecture {

	public static void main(String[] args) {
		//String is an object in terms of java
//		String s= "RAHUL SHETTY ACADEMY";
//		String s1="RAHUL SHETTY ACADEMY";
		//Here no new obj is created first checks whether the value is stored in any variable 
		//then only creates new obj.
		
		//*****************************//
		
		String s2=new String("WELCOME");
		String s3=new String("WELCOME");
		//here explicitly saying to create new object
		
		//********************************************//
		// HOW TO SPLIT AND STORE VALUES IN AN ARRAY OF A STRING
		
		String s= "RAHUL SHETTY ACADEMY";
		String[] splittedString=s.split(" ");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);
		
		//splitting with shetty
		String[] splittedString2=s.split("SHETTY");
		System.out.println(splittedString2[0]);
		System.out.println(splittedString2[1]);
		
		//trim to remove white spaces
		System.out.println(splittedString2[1].trim());
		//
		for(int i=0;i<s.length();i++) {//s.length just consider string as array of characters.
			System.out.println(s.charAt(i));	
		}
		// to print in reverse order
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));	
		}
		
	}

}
