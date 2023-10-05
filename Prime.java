import java.util.*;
class Prime{
public static void main(String[]args)
{
System.out.println("enter the number");
int a;
Scanner s=new Scanner(System.in);
a=s.nextInt();

for(int i=1;i<=a;i++){
boolean flag=true;
	for(int j=2;j<i;j++)
		{
		 if(i%j==0)
                 {
		 flag=false;
		 }
}
if(flag)	
System.out.println(i);	
}
}
}


		  