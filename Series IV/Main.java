import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      float prod=.5f;
       
      for(int i=1;i<=a;i++)
      {
        System.out.printf("%.1f ",prod);
          prod=prod*3f;
       }
      
	}
}