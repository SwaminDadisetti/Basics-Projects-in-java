

public class OddNumbers {
	public static void main(String[] args) {
		
		int n=100;
		int count=0;
		for(int i=1;i<=n;i++) {
		
		if (i%2!=0) {
			count=count+1;}
		}
		System.out.println("no of odd numbers between 1 and "+n +"is "+ count);
		
		}
}
