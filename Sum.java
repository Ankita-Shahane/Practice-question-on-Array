//3.Sum of all elements in a 1d/2d array.
import java.util.*;

class Sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.println("enter a row array:");
        int n = sc.nextInt();
        
        int arr[] = new int[n];

              
        
        //take value from users:
        System.out.println("enter a values from an array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
          int sum=0;
        for(int a:arr){
            sum+=a;
        }  
        System.out.println("sum is:"+sum);
    }

}
// import java.util.*;
// class SumArrayOd
// {
//     public static void main(String[]args)
//     {
//         Scanner sc =new Scanner(System.in);

//         System.out.println("enter no of elements:");
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         //take value from users:
//         System.out.println("enter a values from an array:");
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         //normal loop
        
        
//         int sum=0;
//         for(int a:arr){
//             sum+=a;
//         }  
//         System.out.println("sum is:"+sum);
// }
// }