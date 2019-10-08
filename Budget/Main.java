import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int d=sc.nextInt();
      int e=sc.nextInt();
      Float aa=a*350.34f;
      Float bb=b*230.90f;
      Float cc=c*190.55f;
      Float dd=d*125.30f;
      Float ee=e*180.90f;
      Float ww=aa+bb+cc+dd+ee;
      if(ww<15000)
      {
      System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      
      }
	}
}