import java.util.*;
class coprime
{
public static void  main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter a= ");
int a=sc.nextInt();
System.out.println("Enter b= ");
int b=sc.nextInt();
int min,max,gcd=1;
min=a;
if(min>b)
{ 
max=a;
min=b;
}
else
{
max=b;
min=a;
}
while(max>min)
{
int r=max%min;
if(r==0)
{
gcd=min;
break;
}
else
{
max=min;
min=r;
}
}
if(gcd==1)
System.out.println("Co Prime numbers");
else
System.out.println("Not a Co Prime numbers");
}
}