public class QuickSort {

  public static void main(String[] args) {
    int[] x = {2, 8, 7, 1, 3, 5, 6, 4};

    sort(x);
    for (int i : x) {
      System.out.print(i + " ");
    }
  }

  public static void sort(int[] x) {
    quickSort(x, 0, x.length-1);
  }

  private static void quickSort(int[] x, int start, int end) {
    if (start < end) {
      int pivot = partition(x, start, end);
      quickSort(x, start, pivot-1);
      quickSort(x, pivot+1, end);
    }
  }

  private static int partition(int[] x, int start, int end) {
    int pivot = x[end]; 
    int i = start -1;
    for (int j = start; j <= end-1; j++) {
      if (x[j] <= pivot) {
        i++;
        int tmp = x[j];
        x[j] = x[i];
        x[i] = tmp;
      }
    }
    int tmp = x[i+1];
    x[i+1] = x[end];
    x[end] = tmp;
    return i+1;
  }
}