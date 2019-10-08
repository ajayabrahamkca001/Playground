import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      int a[]=new int[10];
      int i=1,sum=0;
      while(i<=5)
      {
        a[i]=sc.nextInt();
        i++;
    }
      for(int j=1;j<=5;j++)
      {
        sum=sum+a[j];
      }
      double avg=sum/5.0;
      System.out.printf("%.2f",avg);
}
}