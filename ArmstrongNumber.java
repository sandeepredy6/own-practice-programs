package ownPractice;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		// 371 armstrong number 
		int n=371,id,sum=0,
		t=n;
		while(n!=0);
		id= n % 10;
		n= n / 10;
		sum = sum+id*id*id;
		if (sum == t) {
			System.out.println("true");
		
		}
		else {
			System.out.println("false");
		
	}
	}
}
