import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
      int month=sc.nextInt();
      Float roomrnt=sc.nextFloat();
      int days=sc.nextInt();
      Float romrt=roomrnt;
     Float v=roomrnt*days; 
      
    
      switch(month)
      {
        case 4:
        case 6:
        case 11:
        case 12:
          
          Float hig=(romrt/10)*2;
          Float f=v+(days*hig);
          System.out.printf("%.2f",f);
          break;
        case 1:
        case 2:
        case 3:
        case 5:
        case 7:
        case 8:
        case 9:
        case 10:
          //Float k=roomrnt*days;
          System.out.printf("%.2f",v);
          break;
        default:System.out.printf("Invalid Input" );
      }
          
            
      
	}
}