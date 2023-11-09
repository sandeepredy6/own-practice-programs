package ownPractice.day2;

import java.util.Arrays;

public class AnaagramPrgm {

	public static void main(String[] args) {
		// Anagrams of strings

		String str1 = "SILENT";
		String str2 = "LISTEN";

		char C1[] = str1.toCharArray();
		char C2[] = str2.toCharArray();
            if (C1.length!=C2.length){
            System.out.println("Not Anagram");
           System.exit(0); 
            } 		
          Arrays.sort(C1);
         Arrays.sort(C2);
          for (int i=0; i < C1.length;i++){
          if (C1[i]!=C2[i])
          {
          System.out.println("Not Anagram");
          System.exit(0); 
          }//if
          
            }//for
         System.out.println("Anagram");  
	}//if

}//class
	
	

