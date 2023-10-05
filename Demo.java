import java.lang.number.*;
class Demo
{
public static void main(String[] args)
{
System.out.println("number of parameters="+args.length);
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
System.out.println("sum="+(a=b));
}
}