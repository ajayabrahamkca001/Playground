import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      int numbr=sc.nextInt();
      int n=0,rem;
      int num=numbr;
      
     if(num/1000==0)
     {
       if(num>99&&num<1000)
       {
       rem=num%100;
       n=rem/10;
       if(n%3==0)
       {
         System.out.println("Trendy Number");
       }
       else
       {
         System.out.println("Not a Trendy Number");
       }
     }
      else
      {
        System.out.println("Not a Trendy Number");
      }
    }  
      else
      {
        System.out.println("Not a Trendy Number");
      }
    }

}