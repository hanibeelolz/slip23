import java.lang.*;
import java.util.*;
class Vowels extends Thread
{
            String s1;
            Vowels(String s)
            {           s1=s;
                        start();
			
            }
            public void run()
            {
                        System.out.println("Vowels are  ");
					
                        for(int i=0;i<s1.length();i++)
                        {
                                    char ch=s1.charAt(i);
                        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
					{try{
					sleep(3000);
				}catch(Exception e){System.out.println(e);}
                                                System.out.println(" "+ch);
										
										
					}
                        }
            }
}
public class Demo1 {
    public static void main(String[] args)
    {

            Scanner sn=new Scanner(System.in);
            System.out.println("Enter a string");
            String str1=sn.next();
            Vowels v=new Vowels(str1);
   }
}

