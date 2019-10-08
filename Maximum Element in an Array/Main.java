import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int a[]=new int[20];
        int big=a[0];
      for(int i=0;i<size;i++)
      {
        a[i]=sc.nextInt();
      }
      for(int i=1;i<size;i++)
      {
       
         if(a[i]>big)
         {
           big=a[i];
           continue;
         }
          
        }
      
      System.out.print(big+" is the maximum element in the array");
    }
}