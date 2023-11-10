package ownPractice.day3;

public class RemoveParticularCharacter {

//	public static void main(String[] args) {
//		// Remove Particular Character string
//		
//		String str= "tcoucht";
//		char ch='t';
//		removechar(str,ch);
//	}
//
//
//    public static void removechar(String str, char t){
//	
//	int n= str.length();
//	String finalstr="";
//	
//	for(int i=0;i<n;i++) {
//		if(str.charAt(i)!=t) {
//			
//		finalstr=finalstr+str.charAt(i);
//	}
//	}
//System.out.println(finalstr);	
//}
//}

		public static void main(String[] args) {
		String str1= "laptop";
		
		char ch='p';
		removechar(str1,ch);
		
	}

		
   public static void removechar(String str1,char p) {
	
	   int n=str1.length();
	   String finalstr1="";
	   
	   for(int i=0;i<n;i++) {
		  
		   if(str1.charAt(i)!=p) {
			   finalstr1=finalstr1+str1.charAt(i);
			   
		   }
	   }
	System.out.println(finalstr1);   

}

}




		
		 
		
		
		
		