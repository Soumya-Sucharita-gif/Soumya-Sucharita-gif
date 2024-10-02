
public class d4q1 {
	public static boolean iseven(int n) {
		if(n%2==0)
			return true;
		else
			return false;
	
	}
	public static int stepcount(int num) {
		if(num==0)
			return 0;
		else
			if(iseven(num))
				return 1+stepcount(num/2);
			else
				return 1+stepcount(num-1);
		
		
			
		
		
		
	}

	public static void main(String[] args) {
		
      System.out.println(stepcount(15));
	}

}
