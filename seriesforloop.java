public class FindElementInArray {
public static void main(String[] args) {
int[] array = {5, 3, 8, 6, 2, 7};
int target = 6;
int index = -1;
for (int i = 0; i < array.length; i++) {
if (array[i] == target) {
index = i;
break;
}
}
System.out.println(index >= 0 ? "Element found at index: " + index : "Element not found");
}
}