
public class d4q4 {
	public static boolean vowel(char ch) {
		return(ch=='a' ||ch=='e'||ch=='o'||ch=='i' ||ch=='j')==false;
		
	
	}
	public static int count(String str,int i) {
	if(i==1) {
		if(vowel(str.charAt(i))) 
      return 1;
      else
    	  return 0;}
		
	else
			if(vowel(str.charAt(i-1)))
				return  count(str,i-1)+1;
			else
				return count(str,i-1);
		
	
	}

	public static void main(String[] args) {
		System.out.println(count("lyalioderr",10));

	}

}
