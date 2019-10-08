import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int p=0;
      for(int i=1;i<=a;i++)
      {
        if(i%2==0)
        {
          p=(i*i)-2;
        }
        else
        {
          p=(i*i)-1;
        }
        System.out.printf("%d ",p);
      }
	}
}