import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int numbr=sc.nextInt();
       int fact=1;
      int count=1;
      for(int i=1;i<=numbr;i++)
      {
        fact=fact*i;
        if(fact==numbr)
        {
          count=0;
         
        }
      }
       
        if(count==0)
        {
          System.out.println("Yes");
        }
        else
        {
           System.out.println("No");
        }
    
    }
}