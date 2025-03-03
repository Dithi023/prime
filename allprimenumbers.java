import java.util.*;
public class allprimenumbers 
{
    public static void main(String[] args)
    {
        int min,max;
        int a=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter min");
    min=sc.nextInt();
    System.out.println("exnter max");
    max=sc.nextInt();
    for(int n=min;n<=max;n++)
    {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                a=1;
                break;
            } 
        }
        if(a==0)
            {
                System.out.println(" "+n);
            }
            a=0;
    }
    
    }
}
