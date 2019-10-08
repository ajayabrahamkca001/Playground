import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      float a=sc.nextFloat();
      float t=sc.nextFloat();
      float tt=0,ttt=0;
      if(a==2)
      {
        tt=t/2f;
        t=t+tt;
        System.out.println(t);
      }
      if(a==3)
      {
        ttt=t*2f;
        t=t+tt;
        System.out.println(t);
      }
      if(a>3)
      {
        System.out.println("Number of items is more");
      }
	}
}