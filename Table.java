class table
{
     int n;
    void mul()
    {
        n=11;

        for(byte i=1;i<=10;i++ )
        {
            System.out.println(i+" X "+n+" = "+(n*i));
        }
    }
    void mul(int x)
    {
        n=x;
        for(byte i=1;i<=10;i++)
        {
            System.out.println(i+"X"+n+" = "+(n*i));
        }
    }
}
class Bharath
{
    public static void main(String args[])
    {
        table obj=new table();
        obj.mul();
        System.out.println("_");
        obj.mul(33);
    }
}
