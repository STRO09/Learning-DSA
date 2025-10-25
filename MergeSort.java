class MergeSort {
    public static void main(String argsp[]) {

        int[] arr = { 4, 5, 2, 6, 8, 1, 3, 2, 9, 7 };
        divide(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.println(num);
        }
    }

    public static void divide(int[] arr, int start, int end) {
        int mid = start + (end - start) / 2;

        if (end > start) {
            divide(arr, start, mid);
            divide(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void merge(int[] arr, int start, int mid, int end) {

        int[] merged = new int[end - start + 1];

        int idx1 = start;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= end) {
            if (arr[idx1] < arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid)
            merged[x++] = arr[idx1++];

        while (idx2 <= end)
            merged[x++] = arr[idx2++];

        int j = start;
        for (int i = 0; i < merged.length; i++) {
            arr[j++] = merged[i];
        }

    }
}