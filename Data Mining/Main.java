import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      int numbr=sc.nextInt();
      int sumeven=0,sumodd=0,rem=0;
      int num=numbr;
      while(num!=0)
      {
        rem=num%10;
        if(rem%2==0)
        {
          sumeven=sumeven+rem;
        }
        else
        {
          sumodd=sumodd+rem;
        }
        num=num/10;
      }
      if(sumodd==sumeven)
      {
        System.out.printf("yes");
      }
      else
      {
        System.out.printf("No");
      }
    }
}