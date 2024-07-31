public class Main {
    public static void main(String[] args) {
        // Using Math.sqrt to calculate the square root of a number
        double number = 25;
        double squareRoot = Math.sqrt(number);
        System.out.println("Square root of " + number + " is " + squareRoot);

        // Using Math.pow to calculate the power of a number
        double base = 2;
        double exponent = 3;
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is " + result);

        // Using Math.abs to get the absolute value of a number
         int num1= -10; 
         int absValue=Math.abs(num1); 
         System.out.println("Absolute value of "+num1+" is "+absValue);

       // Using Math.max and min functions to get max or min among two numbers.
       int x=10,y=20;
       int max=Math.max(x,y);
       int min=Math.min(x,y);
       System.out.println("Maximum value among two numbers: "+max );
       System.out.println("Minimum value among two numbers: "+min );  
    }
}