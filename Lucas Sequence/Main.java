import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      int numbr=sc.nextInt();
      int a=0,b=0,c=1,d;
      System.out.printf("%d %d %d",a,b,c);
      for(int i=4;i<=numbr;i++)
      {
        d=a+b+c;
        a=b;
        b=c;
        c=d;
        System.out.printf(" %d",d);
      }
         
    }
}