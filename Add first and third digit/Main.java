import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
            Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int rem=a%10;
      int n=a/100;
      int sum=rem+n;
      System.out.println(sum);
      
	}
}