package ownPractice;

public class ReverseNum {

	public static void main(String[] args) {
		// num=987 op=789
		int n=4123, reverse=0, lastdigit;
		
   while (n>0){
  
	   lastdigit = n % 10;
        		n=n/10;
        		reverse = reverse * 10 + lastdigit;
}
System.out.println(reverse);
		
	
}

}

