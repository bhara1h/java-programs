import java.util.Formatter;

public class Main {
  public static void main(String[] args) {
    Formatter formatter = new Formatter();
    
    // Format strings
    String formattedString = formatter.format("Hello, %s! You are %d years old.", "John", 25).toString();
    
    System.out.println(formattedString);
    
    // Close the formatter
    formatter.close();
  }
}