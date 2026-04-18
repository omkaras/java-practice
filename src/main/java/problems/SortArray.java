package problems;

import java.util.Arrays;

public class SortArray {
  public static void main(String[] args) {
    int[] arr = {0, 1, 0, 0, 1, 2, 0, 1, 2, 0, 2, 0, 1, 2, 1, 0, 2, 1, 2, 0, 0, 2, 2, 0, 0, 2, 0, 1, 2, 0, 1, 2, 0};

    int[] sortedArray = sortArr(arr);
    Arrays.stream(sortedArray).forEach(System.out::print);
  }

  private static int[] sortArr(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    return arr;
  }
}
