//product of two numbers using recursion
public class d3q3 {
public static int product(int m,int n) {
	if(m==0 |n==0)
		return 0;

	


	else
		return m+product(m,n-1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println(product(5,6));
	}

}
