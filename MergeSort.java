
public class MergeSort {
    static void merge1(int arr[], int mid, int low, int high) {
        int b[] = new int[arr.length];
        int j = mid + 1;
        int c = low;
        int k = low;
        while (k <= mid && j <= high) {
            if (arr[k] < arr[j]) {
                b[c] = arr[k];
                k++;
                c++;
            } else {
                b[c] = arr[j];
                j++;
                c++;
            }
        }
        while (k <= mid) {
            b[c] = arr[k];
            c++;
            k++;
        }
        while (j <= high) {
            b[c] = arr[j];
            j++;
            c++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = b[i];
        }

    }

    public static void mergesort1(int arr[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergesort1(arr, low, mid);
            mergesort1(arr, mid + 1, high);
            merge1(arr, mid, low, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 65, 12, 34, 77, 89, 22 };
        int low = 0;
        int high = arr.length - 1;
        mergesort1(arr, low, high);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}