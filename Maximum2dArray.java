//find the maximum and minimum element in a 1d/2d arry


import java.util.*;
class Maximum2dArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number of row element:");
        int n = sc.nextInt();

        System.out.println("enter a number of column element:");
        int m = sc.nextInt();

        int arr[][] = new int[n][m];
      //nomal loop
        System.out.println("enter the values");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
         
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > max) {
                max = arr[i][j];
            } 
            }
           
        }

       int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] < min) {
                min = arr[i][j];
            } 
            }
           
        }
        System.out.println("Max value is :" + max);
        System.out.println("Min value is :" + min);
       

    }

}
