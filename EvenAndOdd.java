package ownPractice.day3;

public class EvenAndOdd {

	public static void main(String[] args) {
		// even and odd number after
		
		
		int []arr1= {1,2,4,5,7,9,10,11};
		arrayevenodd(arr1);
		
	}


public static void arrayevenodd(int arr[]) {
	int[] a = new int[arr.length];
	int index =0;
	for (int i=0;i<arr.length;i++) {
		if (arr[i] % 2 == 0) {
			a[index]=arr[i];
			index++;
	}
}
	for (int i=0;i<arr.length;i++) {
		if (arr[i] % 2 != 0){
			a[index]=arr[i];
			index++;
}
		
	}
	for( int i=0;i<a.length;i++) {
		System.out.print(a[i]+ ", ");
	}
}
}