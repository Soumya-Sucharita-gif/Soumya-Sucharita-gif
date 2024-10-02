
public class d3q4 {
	public static boolean power(int n) {
		if(n==1)
			return true;
		else
			power(n/2);
		if(n%2==0) {
			return true;}
		else
			return false;
	}

	public static void main(String[] args) {
		
System.out.println(power(64));
	}

}
