
public class d4q3 {
public static boolean power(int n) {
	if(n==1)
		return true;
	else
		power(n/4);
	if(n%4==0) {
		return true;}
	else
		return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(power(5));
	}

}
