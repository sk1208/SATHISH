package assignmentWeek1;
public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='n') {
				count++;
			}
			
		}
		
		System.out.println("the character n occurence:"+ count);
	}

}
