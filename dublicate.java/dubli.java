package dublicate.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class dubli {
    public static void main(String[] args) {
        System.out.println("Enter your number ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx]=sc.nextInt();
            
        }
        int []ans=removeDubicate(arr,n);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] removeDubicate(int []arr, int m) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        for(int i=0; i<m; i++){
            if(map)
        }
        
    }
 }

    

