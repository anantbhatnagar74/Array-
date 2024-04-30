public class Min_In_Sorted
{
    public static void main(String args[])
    {
        int[] arr={14,15,20,22,3,5,7,9,11};
        System.out.println(findMin(arr));
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

Output : 3