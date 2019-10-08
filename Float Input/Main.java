import java.io.*;
class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
        float num=Float.parseFloat(br.readLine());
          System.out.printf("%.2f",num);                                   
        
    }
}