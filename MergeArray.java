package ownPractice;
import java.util.*;
public class MergeArray {
	public static void main(String[] args) {
		//a  arry{2,5,8,76}
		//b arry{37,5,9,4}
		
		int[] a = {2,5,8,76};
	           
		int ci=0;
		int[] b = {37,5,9,4};
		int[] c = new int[a.length +b.length];
		for(int i=0;i<a.length;i++)
		{
		c[ci]=a[i];
		ci++;
		}
		for(int i=0;i<b.length;i++)
		{
			c[ci]=b[i];
			ci++; 
		}
    System.out.println(Arrays.toString(c));
	}

}
