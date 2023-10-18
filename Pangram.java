package java_programs;

public class Pangram {
	public static boolean check(String str) {
		if(str.length()<26) {
			return false;
		}
		for(char i='a';i<='z';i++) 
		{
			int c=0;
			for(int j=0;j<str.length();j++) 
			{
				if(i==str.charAt(j))
				{
					c++;
				}
				
			}
			if(c==0) {
				return false;
			}
			
		}
		return true;
}
public static void main(String[] args) {
	String str="abcdefghijklmnopqrstuvwxyz";
	check(str);
	if(check(str)) {
		System.out.println("string is pangram");
	}
	else {
		System.out.println("string is not an pangram");
	}

	
}
}
