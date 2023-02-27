import java.util.Scanner;

public class Addition {
	int x;
	int y;
	int Sum;
	public int Add(int x ,int y ) {
		
		Sum=(x+y);
		 return Sum;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Firstnumber");

		int x =sc.nextInt();
		System.out.println("enter Firstnumber");
		int y =sc.nextInt();
		Addition obj=new Addition();
		
		int Sum=obj.Add(x, y);
		 System.out.println(Sum);
	}

}
