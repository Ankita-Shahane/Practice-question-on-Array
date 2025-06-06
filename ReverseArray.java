//1.Reverse an array(in-place or uing extra space)

class ReverseArray{
  
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int left = 0, right = arr.length - 1;
        while (left < right) {
            // Swap elements for getting reverse array
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

       
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}


   
