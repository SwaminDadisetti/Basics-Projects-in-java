import java.util.Scanner;

public class SumOfnNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many numbers you want to add");
		int n=sc.nextInt();
	int i;
		
		int z=0;
		for(i=1;i<=n;i++) {
			z=z+i;
			
		}
		System.out.println(" the sum of" + n + "numbers is");
		System.out.println(z);
	
	}
	

}
