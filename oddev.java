import java.util.*;
public class oddev
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("enter a no.");
        a=sc.nextInt();
        if(a % 2==0)
        {
            System.out.println("no. is even");
        }
        else
        {
            System.out.println("no. is odd");
        }
    }
}