import java.util.*;
class SortAsc
{
    public static void main(String arg[])
    {
    int arr[] = {5, 2, 8, 7, 1,};
    int temp = 0;
    for(int i=0; i < arr.length; i++)
    {
        if(arr[i] > arr[j])
        {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
ystem.out.println("Element of array sorted in acending order:");
for (int i =0; i < arr.length; i++)
{
    System.out.prrintln(arr[i]);
}
}