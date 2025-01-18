import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int low=0,high=arr.length-1,index=-1;
        System.out.println("Enter the element to be searched:");
        int target=sc.nextInt();
        while(low<=high) {
            int mid=low+(high-low)/2;
            if(arr[mid]==target) {
                index=mid;
                break;
            } else if(arr[mid]<target) {
                low=mid+1;
            } else {
                high=mid-1;
            }
        }
        if(index==-1) {
            System.out.println("Element not found");
        } else {
            System.out.println("index:"+index);
        }
        sc.close();
    }
}

