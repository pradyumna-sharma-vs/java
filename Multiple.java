import java.util.Scanner;

public class Multiple 
{
    public static void multiple(int limit)
    {
        int count=limit+1;
        for(int j=2;j<count;j++)
        {
            for(int i=0;i<(count/j)+1;i++)
            {
                System.out.print(j*i+" ");
            }
            System.out.println("\n");
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit");
        int limit=sc.nextInt();
        multiple(limit);
        
    }
    
}