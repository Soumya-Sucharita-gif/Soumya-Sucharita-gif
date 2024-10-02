//rev of string
public class d3q2 {
	public static char rev(String str,int i) {
		if(i==0)
			return str.charAt(0);
		else
			rev(str,i-1);
		
			return str.charAt(i-1);
		
	}

	public static void main(String[] args) {
		String str="Soumya";
		int j=6;
		
for(int i=6;i>0;i--) {
	System.out.println(rev(str,i));
}
	}

}
