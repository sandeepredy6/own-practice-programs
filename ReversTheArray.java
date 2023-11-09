package ownPractice;

import java.util.*;

public class ReversTheArray {

	public static void main(String[] args) {
		// revers the array
		
		int a[]= {1,2,3,4,5,6};
		int i=0, temp;
		int j=a.length-1;
		while(i<j) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		i++;
		j--;
		
		}
			System.out.println(Arrays.toString(a));
	}

}
