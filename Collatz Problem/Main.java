import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      int numbr=sc.nextInt();
      int n=numbr,c=0;
      System.out.println(n);
      while(n>1)
      {  
        if(n%2==0)
        {
          c++;
           n=n/2;
          System.out.println(n);
        }
       else if(n%2==1)
        {
          c++;
          n=3*n+1;
         System.out.println(n);
          
        }
       
      }
      
       System.out.println(c);   
    }
}