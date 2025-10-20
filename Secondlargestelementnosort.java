class Secondlargestelementnosort {
    public static int find(int[] arr) {
        int max = arr[0];
        int secondmax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < max && arr[i] > secondmax) {
                secondmax = arr[i];
            }
        }
        return secondmax;
    }

    public static void main(String args[]) {
        // int[] a = {45,3,4654,57,3,67,435,7,-24};
        // int[] a = { -4, -45, -3, -4654, -57, -67, -435, -7, -24 };
        int[] a = {3,3,3,3};
        System.out.println(find(a));
    }
}