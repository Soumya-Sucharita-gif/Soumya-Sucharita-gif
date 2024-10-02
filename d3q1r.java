//first occurance of uppercase using recursion
public class d3q1r {
	public static char uppercase(String str,int i) {
		if(str.charAt(i)=='\0') {
			return 0;}
		if(Character.isUpperCase(str.charAt(i)))
			return str.charAt(i);
		else
		return uppercase(str,i+1);
	   
	}

	public static void main(String[] args) {
		
System.out.println(uppercase("geekS",0));
	}

}
