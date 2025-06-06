//4.check if a 1d array is sorted(ascending/descending)

 class Sort
 {
    public static void main(String[] args) {
        int[] arr = {9, 7, 5, 3, 1};  // Change values to test

        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isAscending = false;
            }
            if (arr[i] < arr[i + 1]) {
                isDescending = false;
            }
        }

        if (isAscending) {
            System.out.println("Array is sorted in ascending order.");
        } else if (isDescending) {
            System.out.println("Array is sorted in descending order.");
        } else {
            System.out.println("Array is not sorted.");
        }
    }
}
