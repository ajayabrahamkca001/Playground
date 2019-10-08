import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int borrowed=sc.nextInt();
      int year=sc.nextInt();
      float rate=sc.nextFloat();
      float inte=(borrowed*year*rate)/100;
      System.out.printf("%f",inte);
    }
}