import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      int rows=sc.nextInt();
      int col=sc.nextInt();
      int numbr=sc.nextInt();
      if(numbr%col==0)
      {
        System.out.println("Yes");
      }
      else if(numbr%col==1)
      {
         System.out.println("Yes");
      }
      else if(numbr>=1 && numbr<=col)
      {
         System.out.println("Yes");
      }
     else
     { System.out.println("No");
      
     }  
     }
}