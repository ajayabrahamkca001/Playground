import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      String str=sc.next();
              
     if(str.equals("L1")==true) 
     { 
        
       if(b<c)
      {
         System.out.println("L2");
       }
       else
       {
         System.out.println("L3");
       }
     }
     else  if(str.equals("L2")==true)
       {
         if(a<c)
         {
            System.out.println("L1");
         }
         else
         {
            System.out.println("L3");
         }
       }
  else   if(str.equals("L3")==true)
     {
       if(a<b)
       {
          System.out.println("L1");
       }
       else
       {
          System.out.println("L2");
       }
     }
    }
}