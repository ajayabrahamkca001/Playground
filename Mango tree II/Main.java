import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      int rows=sc.nextInt();
      int col=sc.nextInt();
      int numbr=sc.nextInt();
      if(numbr%rows==0)
      {
        System.out.println("Yes");
      }
      else if(numbr%rows==1)
      {
         System.out.println("Yes");
      }
      else if(numbr>=1 && numbr<=rows)
      {
         System.out.println("Yes");
      }
     else
     { System.out.println("No");
      
     }  
     }
}