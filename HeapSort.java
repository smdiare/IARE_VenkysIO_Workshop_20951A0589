import java.util.Scanner;

class HeapSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l= sc.nextLine();
        String[] ele = l.split(" ");
        int[] arr = new int[ele.length];
        for (int i = 0; i < ele.length; i++) {
            arr[i] = Integer.parseInt(ele[i]);
        }
        heapSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void heapSort(int[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heap(arr, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heap(arr, i, 0);
        }
    }

    public static void heap(int[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heap(arr, n, largest);
        }
    }
}
