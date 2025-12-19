import java.util.*;
public class largestof
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter 3 no.");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println("largest="+a);
        }
        else if(b>a && b>c)
        {
            System.out.println("largest="+b);
        }
        else
        {
             System.out.println("largest="+c);
        }

    }
}