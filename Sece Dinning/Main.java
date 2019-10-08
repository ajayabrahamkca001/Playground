import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      int a=sc.nextInt();
      if(str.equals("front")==true)
      {
        if(a==1)
        {
          System.out.println("Left Handed");
        }
        else// if(a==2)
        {
          System.out.println("Right Handed");
        }
      }
    else //if(str.equals("rear")==true) 
     {
       if(a==1)
       {
         System.out.println("Right Handed");
       }
      else //if(a==2)
      {
        System.out.println("Left Handed");
      }
     } 
	}
}