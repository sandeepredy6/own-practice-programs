package ownPractice.day3;

public class FindSpecialChar {

	public static void main(String[] args) {
		// Find Special Charcter in string 
		
		
		 String s="cloud@#!*";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i)))
			{
				count++;
			}
		}
		if (count==0){
		System.out.println("not a special charater");
		}else {
			System.out.println("is a special char"+ count);
	}
	}

}
