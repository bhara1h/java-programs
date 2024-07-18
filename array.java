import java.util.*;
class ArrayTest1
{
public static viod main(string arg[])
{
int a[]=new int [10];
scanner sc=new scanner(system.in);
system.out.println("enter the array values");
for(int i=0; i<a.length;i++)
{
a[i]=sc.nextInt();
}
system.out.println("the array values are");
for(int i=0;i<a.length;i++)
{
system.out.println(a[i]);
}
}
}