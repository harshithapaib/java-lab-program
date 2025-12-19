import java.util.*;
public class swap
{
    public static void main(String[]args)
    {
       Scanner sc=new Scanner(System.in);
       int a,b,temp;
       System.out.println("enter 2 no.");
       a=sc.nextInt();
       b=sc.nextInt();
       temp=a;
       a=b;
       b=temp;
       System.out.println("no. after swapping");
       System.out.println("a="+a+" and b="+b);
    }   
}