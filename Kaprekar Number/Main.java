import java.util.Scanner;
import java.lang.Math;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
    int aa=a,count=0,s=1;
      int rem=0,sum=0,q;
      int sqr=a*a;
     // System.out.println("hai"); 
      while(aa>0)
      {
       
        count++;
        aa=aa/10;
      }
    for(int i=1;i<=count;i++)
    {
      s=s*10;
    }
      rem=sqr%s;
      q=sqr/s;
       //System.out.println(q );
      sum=rem+q;
     if(a==sum)
     {
     System.out.println("Kaprekar Number"); 
     }
      else
      { System.out.println("Not A Kaprekar Number");
      }
        
    }
}