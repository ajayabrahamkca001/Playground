import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
      int age=sc.nextInt();
      float time=sc.nextFloat();
      float f=13.30f;
      if(age>13)
      {
        if(Float.compare(time,f)==0)
        {
          System.out.println("$5.00");
        }
        else
        {
           System.out.println("$8.00");
        }
      }
      else if(age<13)
      {
         if(Float.compare(time,f)==0)
        {
          System.out.println("$4.00");
        }
        else
        {
           System.out.println("$2.00");
        }
      }
	}
}