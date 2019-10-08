import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int n=sc.nextInt();
      int count=0;
      if(a>=n)
      {
        count++;
      }
        if(b>=n)
      {
        count++;
      }
       if(c>=n)
      {
        count++;
      }
      System.out.println(count);
    }
}