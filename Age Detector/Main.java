import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      int birthyr=sc.nextInt();
      int curryr=sc.nextInt();
      if(birthyr==00)
      {
        int a=100 -curryr;
        System.out.println(a);
      }
      else if(birthyr>curryr)
      {
        int b=100-birthyr+curryr;
        
        System.out.println(b);
      }
      else if(birthyr<curryr)
      {
        int c=curryr-birthyr;
        System.out.println(c);
      }
      
    }
}