import java.util.*;
public class palindrom
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter a word or a no.");
        String str=sc.nextLine();
        str=str.toLowerCase();
        String reverse="";
        for(int i=str.length()-1;i>=0;i--)
        {
            reverse=reverse+str.charAt(i);
        }
        if(str.equals(reverse))
        {
            System.out.println("is a palindrom");
        }
        else
        {
            System.out.println("is not a palindrom");
        }

    }
}