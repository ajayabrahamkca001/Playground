import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int len=sc.nextInt();
    int b=sc.nextInt();
    int length=len+len+b+b;
    int sqrt=len*b;
    System.out.println(length+"m");
    System.out.println(sqrt+"sqm");
  }
}