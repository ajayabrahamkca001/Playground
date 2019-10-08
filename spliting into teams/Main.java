import java.util.Scanner;
class Main
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
  int stu=sc.nextInt();
  int tem=sc.nextInt();
  int num=stu/tem;
  int num2=stu%tem;
  System.out.println("The number of students in each team is "+num+" and left out is "+num2);
  
}
}