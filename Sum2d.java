//3.Sum of all elements in a 1d/2d array.
import java.util.*;

class Sum2d {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.println("enter a row array:");
        int n = sc.nextInt();
        System.out.println("enter a column array:");
        int k = sc.nextInt();

        int arr1[][] = new int[n][k];
        int arr2[][] = new int[n][k];
        int sum[][] = new int[n][k];

        System.out.println("enter values for array:");
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < k; j++) {
                arr1[i][j] = sc.nextInt();

            }
        }
            System.out.println("enter values for array:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < k; j++) {
                    arr2[i][j] = sc.nextInt();

                }
            }
                System.out.println("enter values for array:");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < k; j++) {
                        sum[i][j] = arr1[i][j] + arr2[i][j];

                    }
                }

                    //    System.out.println();
                

            
        
         for(int a[]:sum){
             for(int x:a){ 
                System.out.print(x+" ");
            }
            System.out.println();

        }
    }

}
