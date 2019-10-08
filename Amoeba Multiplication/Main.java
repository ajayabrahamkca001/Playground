import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int a=0,b=1,c=0;
      for(int i=3;i<=size;i++)
      {
        c=a+b;
        a=b;
        b=c;
      }
      System.out.println(c);
      
        
      
      
    }
}