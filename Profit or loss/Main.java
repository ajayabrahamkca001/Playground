import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      float a=sc.nextFloat();
      float b=sc.nextFloat();
      float c=b*12f;
      float d ;
      if(c==a)
      {
        System.out.println("No profit nor loss");
      } 
     else if(c<a)
      {
        d=a-c;
         System.out.printf("Loss : Rs.%.2f",d);
      }
      else if(c>a)
      {
       d=c-a;
         System.out.printf("Profit : Rs.%.2f",d);
      }
 
    }
  
}