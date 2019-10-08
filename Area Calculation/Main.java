import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      int sqa=sc.nextInt();
      int reca=sc.nextInt();
      int recb=sc.nextInt();
      float rad=sc.nextFloat();
      int sq=sqa*sqa;
      int rect=reca*recb;
      double cir=3.14*(rad*rad);
      System.out.printf("%d\n%d\n%.3f",sq,rect,cir);
    }
}