import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    int sss = (n % 100) / 10;
		System.out.println(sss);
	}
}