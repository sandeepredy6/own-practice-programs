package ownPractice.day3;

public class RotationOfString {

	public static void main(String[] args) {
		// Rotation of strings
		
		String str1="ABCD";
		String str2="CDAB";
		if(isRotation(str1,str2)) {
			System.out.println("Rotation of string present");
		}else {
			System.out.println("Rotation of string not found");
	}

}
public static boolean isRotation(String str1,String str2) {
	return (str1.length()	==	str2.length())	&&((str1+str1).indexOf(str2)!=-1);
	
}
}