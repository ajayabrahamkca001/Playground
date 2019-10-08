import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
      String ch=sc.nextLine();
      float tuifee=sc.nextFloat();
      float busfee=sc.nextFloat();
      float hostlfee=sc.nextFloat();
      
     
      
      
        //float hostelfee=sc.nextFloat();
      if(ch.equals("MSDS"))
         {
        float msds=tuifee+busfee;
           System.out.printf("%.2f",msds);
         }
        else if(ch.equals("MSH"))
            {
           float msh=tuifee+hostlfee;
            System.out.printf("%.2f",msh);  
            }
                else if(ch.equals("MGSDS"))
                        {
                  float d=tuifee/2;
               float mgsds=d+busfee+tuifee;           
            System.out.printf("%.2f",mgsds);
                        }
                        else if(ch.equals("MGSH"))
                                {
                          float e=tuifee/2;
                          float mgsh=e+hostlfee+tuifee;
                                        System.out.printf("%.2f",mgsh);
                                }
      
    }
}