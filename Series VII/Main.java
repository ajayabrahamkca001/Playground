import java.util.Scanner;
import java.lang.Math;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
      double p=0;
      int k=1;
      double aa[]=new double[a];
      
      aa[1]=2.0;
      for(int i=2;i<a;i+=2)
      {
        aa[i]=Math.pow(3,k);
        k++;
      }
      for(int i=3;i<a;i+=2)
      {
        aa[i]=aa[i-2]*3;
      }
      System.out.print("1");
      for(int i=1;i<a;i++)
      	System.out.print(" "+aa[i]);
    }
}
          