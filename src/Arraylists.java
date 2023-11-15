import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylists {

	public static void main(String[] args) {
		//no predefined size
		ArrayList<String> a = new ArrayList<String>();
		a.add("rahul");
		a.add("Shetty");
		a.add("udemy");
		a.add("learn");
		a.add("selenium");
		
		//a.remove(0);//remove element from arraylist
		//System.out.println(a.get(0));//get the element in the 4th index
		//array length for arraylist size
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		//enhanced for loop
		for(String val:a) {
			System.out.println(val);
		}
		//a.contains(); this is not present in arrays
		System.out.println(a.contains("selenium"));	
		
		//Convert array to array lists
		String[] name= {"RAHUL","SHETTY","SELENIUM"};
		List<String> nameArrayList= Arrays.asList(name);
		System.out.println(nameArrayList.contains("SHETTY")); 
	}

}
