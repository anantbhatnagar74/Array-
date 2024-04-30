import java.util.*;
public class Search_In_Sorted
{
    public static void main(String args[])
    {
        int[] arr={9,11,14,15,20,22,25,2,3,5,7};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target for which the index is to be searched : ");
        int target = sc.nextInt();
        int minidx = findMin(arr);
        int ans=BinarySearch(arr, 0, minidx-1, target);
        if(ans==-1)
        {
            ans=BinarySearch(arr, minidx, arr.length-1, target);
        }
        System.out.println(ans);
    }
    public static int BinarySearch(int[] arr, int left, int right, int target)
    {
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]<target)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return -1;
    }
    public static int findMin(int[] arr)
    {
        int left=0, right=arr.length-1;
        while(left<right)
        {
            int mid=(left+right)/2;
            if(arr[mid]<arr[right])
            {
                right=mid;
            }
            else
            {
                left=mid+1;
            }
        }
        return arr[left];
    }
}

Output : Enter the target for which the index is to be searched : 20
		4