import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
     int b=6;
     for(int i=1;i<=a;i++)  
      {
        System.out.printf("%d ",b);
        b=b+(5*i);
      }      
        
	}
}