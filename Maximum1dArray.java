//find the maximum and minimum element in a 1d/2d arry

import java.util.*;
class Maximum1dArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number of element:");
        int n = sc.nextInt();

        int arr[] = new int[n];
      //nomal loop
        System.out.println("enter the values");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

         int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Max value is :" + max);
        System.out.println("Min value is :" + min);
       

    }

}
