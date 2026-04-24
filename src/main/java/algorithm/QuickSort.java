package algorithm;

class QuickSort {
  // Test
  public static void main(String[] args) {
    int[] arr = {5, 67, 56, 57, 38, 75, 64, 2, 33, 47, 1, 36, 84, 73, 7, 4, 5, 66};

    quickSort(arr, 0, arr.length - 1);

    for (int num : arr) {
      System.out.print(num + " ");
    }
  }

  public static void quickSort(int[] arr, int low, int high) {
    if (low < high) {
      int pivotIndex = partition(arr, low, high);

      // Sort left part
      quickSort(arr, low, pivotIndex - 1);

      // Sort right part
      quickSort(arr, pivotIndex + 1, high);
    }
  }

  private static int partition(int[] arr, int low, int high) {
    int pivot = arr[high]; // choosing last element as pivot
    int i = low - 1; // pointer for smaller element

    for (int j = low; j < high; j++) {
      if (arr[j] <= pivot) {
        i++;

        // swap arr[i] and arr[j]
        swap(arr, i, j);
      }
    }

    // place pivot at correct position
    swap(arr, i + 1, high);

    return i + 1;
  }

  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
