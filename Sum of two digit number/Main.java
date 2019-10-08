import java.util.*;
class Main {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int rem=a%10;
      int n=a/10;
      System.out.println(rem+n);
	}
}