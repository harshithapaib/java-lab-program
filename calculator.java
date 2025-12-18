import java.util.*;
class calculator
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,n;
        System.out.println("enter a and b");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("1=add /n 2=sub /n 3=mul");
        System.out.println("enter your choice");
        n=sc.nextInt();
        switch(n)
        {
            case 1:
             System.out.println("sum="+(a+b));
             break;
             case 2:System.out.println("diff="+(a-b));
             break;
             case 3:
             System.out.println("prod="+(a*b));
             break;
             default:
             System.out.println("invalid input");


        }
    }
    
}
