import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RadixSort {

  public static void radixSort(int[] arr) {
    int maxVal = getMaxVal(arr)
    for (int digit = 1; maxVal / digit > 0; digit *= 10) {
      ArrayList<Integer>[] buckets = new ArrayList[10];
      for (int i = 0; i < buckets.length; i++) {
        buckets[i] = new ArrayList<Integer>();
      }
      for (int i = 0; i < arr.length; i++) {
        int index = (arr[i] / digit) % 10;
        buckets[index].add(arr[i]);
      }
      int index = 0;
      for (int i = 0; i < buckets.length; i++) {
        for (int j = 0; j < buckets[i].size(); j++) {
          arr[index++] = buckets[i].get(j);
        }
      }
    }
  }

  private static int getMaxVal(int[] arr) {
    int maxVal = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > maxVal) {
        maxVal = arr[i];
      }
    }
    return maxVal;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int size = scanner.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < size; i++) {
      arr[i] = scanner.nextInt();
    }
    radixSort(arr);
    System.out.println("Sorted array: " + Arrays.toString(arr));
  }
}
