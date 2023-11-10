package ownPractice.day3;

public class CountNumber {

	public static void main(String[] args) {
		// count the number 
		
		int i= 12345;
		int count=0;
		while(i>0) {
			
		
		count++;
		
	i=i/10;
	}
		System.out.println(count);
	}

}
