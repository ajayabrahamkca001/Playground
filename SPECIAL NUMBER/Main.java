import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int a1=a;
      int b1,b2,quo,rem,b3;
      for(int i=a1;i<=b;i++)
      {
        rem=i%10;
        quo=i/10;
        b1=(rem+quo);
        b2=(rem*quo);
        b3=b1+b2;
         //System.out.printf("%d ",b2);
        //System.out.printf("\n%d",b1);
        if(i==b3)
        {
          System.out.printf("%d\n",i);
        }
      }
        
    }
}