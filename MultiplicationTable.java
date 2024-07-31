 
class Bharath
{
    static double  w,h,a;
    public static void area(double x,double y)
    {
        w=x;
        h=y;
        a=0.5*(w*h);
        System.out.println("Area of Traingle : "+a);
    }

}
class BharathM1
{
    public static void main(String args[])
    { 
      Bharath.area(10,10);
    }
}