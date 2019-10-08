import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
       int y=sc.nextInt();
       int z=sc.nextInt();
       int n=sc.nextInt();
      int a=x-n;
      int b=y-n;
      int c=z-n;
      if(a<0)
      {
        a=1000;
      }
       if(b<0)
      {
        b=1000;
      }
       if(c<0)
      {
        c=1000;
      }
      if(a>=0)
      {
        if(a<=b&&a<=c)
        {
          System.out.println("L1");
        }
      }
        if(b>=0)
      {  
        if(b<=a&&b<=c)
        {
          System.out.println("L2");
        }
      }
        if(c>=0)
      { 
        if(c<=a&&c<=b)
        {
          System.out.println("L3");
        }
      }
    }
}
          
        
      

