import java.util.*;
class frequency
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a string");
        String s=obj.nextLine();
        System.out.println("enter the character");
        char c=obj.next().charAt(0);
        int i=0,f=0;
        int n=s.length();
        for(i=0;i<n;i++)
        {
            if(c==s.charAt(i))
            f=f+1;
        }
        System.out.println("frequency of " +c+ " is " +f);
    }
}
