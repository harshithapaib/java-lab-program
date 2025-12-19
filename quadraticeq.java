import java.util.*;
public class quadraticeq
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        double a,b,c;
        System.out.println("enter value of a,b,c ");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        double disc=b*b-4*a*c;
        if(disc > 0)
        {
            double rt1=(-b+Math.sqrt(disc)/(2*a));
            double rt2=(-b-Math.sqrt(disc)/(2*a));
            System.out.println("real roots are "+rt1+"and"+rt2);
        }
        else if(disc==0)
        {
            double rt=(-b/(2*a));
            System.out.println("sol="+rt);
        }
        else
        {
             System.out.println("no real roots");
        }

    }
}