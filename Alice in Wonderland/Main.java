import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner sc=new Scanner(System.in);
      
      int num=sc.nextInt();
      int rem,sum=0;
      int num1=num;
      while(num1!=0)
      {
        rem=num1%10;
        sum=sum+rem;
        num1=num1/10;
      
	}
      System.out.println("Alice must go in path-"+sum);
}
}