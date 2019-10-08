import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int n=11,p;
      for(int j=1;j<=a; j++)
      {
        p=n*n;
        System.out.printf("%d ",p);
        n=n+4;
      }
	}
}