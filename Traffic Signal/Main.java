import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner sc=new Scanner(System.in);
    Float speed=sc.nextFloat();
      Float dis=sc.nextFloat();
      Float time=sc.nextFloat();
      Float s=(speed/60)/60;
      Float p=s*time;
      if(p>dis)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
        
      
	}
}