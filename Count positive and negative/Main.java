import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b,c=0,c1=0;
      //int a1[]=new int[a];
      for(int i=0;i<a;i++)
      {
        b=sc.nextInt();
        if(b>=0)
        {
          c++;
        }
        else
        {
          c1++;
        }
      }
      System.out.println("Number of positive numbers is "+c+" and the number of negative numbers is "+c1);
       
    }
}