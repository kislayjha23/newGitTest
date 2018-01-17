
import java.util.regex.*;
public class PatchMatch {

	public PatchMatch() {
		// TODO Auto-generated constructor stub
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "kislay is loving, kislay is caring";
		/*Pattern p =  Pattern.compile(" ");
		String arr[]=p.split(str);
		for (String i : arr){
			System.out.println(i);
		}*/
		/*Pattern p = Pattern.compile("am");
		Matcher m = p.matcher(str);
		if(m.find()){
			System.out.println("found");
		}
		else
			System.out.println(" not found");*/
		
		/*Pattern p = Pattern.compile("hi i am kislay jha");
		Matcher m =p.matcher(str);
		boolean mybool=m.matches();
		if(mybool=true)
			System.out.println("match");
		else
			System.out.println("not a match");*/
		
		Pattern p = Pattern.compile("kislay");
		Matcher m = p.matcher(str);
		
		String s=m.replaceAll("mrinal");
		System.out.println(s);
		
			

	}

}