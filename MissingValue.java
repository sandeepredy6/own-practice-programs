package ownPractice.day2;

public class MissingValue {

	public static void main(String[] args) {
		// missing value in array

		int [] a= {1,3,4,5};
		int sum=0;
		int n=5;
		int sumN= (n*(n+1))/2;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
				
		}
		int missval=sumN-sum;
		System.out.println(missval);
		
	}

}
