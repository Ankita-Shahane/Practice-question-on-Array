public class Dublicate {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        int n = arr.length;

        if (n == 0 || n == 1) {
            System.out.println("Array after removing duplicates:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            return;
        }

        // Temporary array to store unique elements
        int[] temp = new int[n];
        int j = 0;
 
        // Traverse the array
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }

        // Add the last element
        temp[j++] = arr[n - 1];

        // Copy the unique elements back to the original array
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
