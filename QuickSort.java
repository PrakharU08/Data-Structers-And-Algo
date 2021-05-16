class QuickSort {
    static int partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low + 1;
        int j = high;
        int temp;

        do {
            try {
                while (arr[i] <= pivot) { //
                    i++;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                // TODO: handle exception
            }
            while (arr[j] > pivot) {
                j--;
            }

            if (i < j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        } while (i < j);

        temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    static void quicksort(int arr[], int low, int high) {

        int partitionindex;
        if (low < high) {
            partitionindex = partition(arr, low, high);
            quicksort(arr, low, partitionindex - 1);
            quicksort(arr, partitionindex + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 3, 9, 1, 4, 8, 7};
        // 1 2 3 9 4 8 7 5 6
        int low = 0;
        int high = arr.length - 1;
        quicksort(arr, low, high);
        for (int pi = 0; pi < arr.length; pi++) {
            System.out.println(arr[pi]);
        }

    }
}