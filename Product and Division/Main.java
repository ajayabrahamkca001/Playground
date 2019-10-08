import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int prod=a*b;
      int quo=a/b;
      int rem=a%b;
      System.out.printf("%d\n",prod);
      System.out.printf("%d\n",quo);
      System.out.printf("%d\n",rem);
                         
    }
}