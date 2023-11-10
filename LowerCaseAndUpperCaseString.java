package ownPractice.day3;

public class LowerCaseAndUpperCaseString {

	public static void main(String[] args) {
		// single string in two parts and make in lower case and upper
		
		
		String str="this is cloudtech this is cloudtech";
		int mid=str.length() / 2;
		String lowerCase ="";
		String upperCase ="";
		for (int i=0;i<str.length();i++) {
			if (i<mid) {
				lowerCase = lowerCase + Character.toLowerCase(str.charAt(i));
			}else {
				upperCase = upperCase + Character.toUpperCase(str.charAt(i));
			}
			
		}
		
		System.out.println(lowerCase+upperCase);
		
	}

}
