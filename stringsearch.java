import java.util.*;
class stringsearch
{
	public static void main(String args[])
    	{
		int i,n,flag=0;
        	Scanner obj=new Scanner(System.in);
        	System.out.println("enter string");
        	String s=obj.nextLine();
        	System.out.println("enter character to be searched");
        	String a=obj.nextLine();
        	n=s.length();
        	for(i=0;i<n;i++)
        	{
            		if(s.charAt(i)==a.charAt(0))
            		{
        			System.out.println("character is found");
                		flag=1;
               			break;
            		}
            		else 
            			continue;
       		}
        	if(flag==0)
        	System.out.println("character is not found");
    	}
}
