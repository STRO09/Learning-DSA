public class QuickSort {
    public static void main(String[] args) {

        int[] arr = { 3, 8, 2, 4, 5, 1 };

        quicksort(arr, 0, arr.length - 1);

        for(int num : arr) {
            System.out.println(num);
        }
    }

    public static void quicksort(int[] arr, int low, int high) {

        if (low < high) {

            int pidx = partition(arr, low, high);

            quicksort(arr, low, pidx - 1);
            quicksort(arr, pidx + 1, high);

        }

    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;

        return i;
    }
}
