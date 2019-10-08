import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int x1=b*a;
      int x2=c*a;
      int x3=x1-x2-100;
      System.out.println("The profit obtained is Rs."+x3);
      
	}
}