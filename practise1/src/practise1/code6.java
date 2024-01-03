package practise1;

public class code6 {

	public static void main(String[] args) {
		int num=12121;
		int rev=0;
		int numm=num;
		
		while(num!=0) {
			 int rem=num%10;
			rev= rev*10+rem;
			num=num/10;
			
		}
		System.out.println("the reverse is "+rev);
 if (numm==rev) {
	 System.out.println("pallindrome");
 }
 else {
	 System.out.println("not pallindrome");
 }
	}

}
