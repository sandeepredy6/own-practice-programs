package ownPractice.day2;

public class VowelsCount {

	public static void main(String[] args) {
//		// VOWELS COUNT IN STRING
//		// HI EVERYONE
//		
//		String S="Hi EveryOne grand father";
//		int count=0;
//		S= S.toLowerCase();
//		for (int i=0;i<S.length();i++){
//		 char ch= S.charAt(i);
//		    if (ch =='a'|| ch =='e'|| ch=='i'|| ch == 'o'|| ch=='u'){
//			count++;
//			
//		 }
//		 
//		}
//		
//		System.out.println(count);
//	}
//
//}


String  S="HI EVERY ONE ARE YOU HAPPY FACES";
 S =S.toLowerCase();
int  count=0;
for (int i=0;i<S.length();i++){
char ch=S.charAt(i);
if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
count++;
}
}
 System.out.println(count);
}
}