public class ArrayTest2 {
public static void main(String[] args) {
int a[] = {21, 32, 45, 65, 67, 43};
int sum = 0;
for (int i = 0; i < a.length; i++) {
sum += a[i];
}
System.out.println("The sum of the array values is: " + sum);
}
}