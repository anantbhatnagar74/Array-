import java.util.*;
public class Search_In_Matrix
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int[][] arr={{1,4,6,8,10},
                     {2,7,9,12,15},
                     {3,11,20,22,24},
                     {5,16,25,30,40}};
        System.out.print("Enter the target: ");
        int target = sc.nextInt();
        System.out.println(SearchInMatrix(arr, target));
    }
    public static boolean SearchInMatrix(int[][] arr, int target)
    {
        int i=0, j=arr.length;
        while(i<arr.length && j>=0)
        {
            if(arr[i][j]==target)
            {
                return true;
            }
            else if(arr[i][j]<target)
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return false;
    }
}

Output : Enter the target: 11
	     true