package ownPractice.day3;

public class FactorialNumber {

	public static void main(String[] args) {
		// factorial of number 6!
		
		
		int n=5;
		int fact=1,i;
		
		for(i=2;i<=n;i++) {
			
		 fact=fact*i;
							
		}
       System.out.println(fact);
	}

}
