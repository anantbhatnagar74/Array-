public class RotateMatrix  
{  
static void RotateBy90(int arr[][],int n)  
{    
for(int i=0;i<n;i++)  
{  
for(int j=i;j<n;j++)  
{  
int temp = arr[i][j];  
arr[i][j] = arr[j][i];  
arr[j][i] = temp;  
}  
}  
for(int i=0;i<n;i++)  
{      
int left = 0, right = n-1;  
while(left < right)  
{  
int temp = arr[i][left];  
arr[i][left] = arr[i][right];  
arr[i][right] = temp;  
left++;  
right--;  
}  
}  
System.out.println("The Rotated Matrix is: ");  
for(int i=0;i<4;i++)  
{  
for(int j=0;j<4;j++)  
{  
System.out.print(arr[i][j]+" " +"\t");  
}  
System.out.println();  
}  
}  
public static void main(String args[])  
{  
int n=4;  
int arr[][] = new int[][]{ {1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16} };
System.out.println("The Original Matrix is: ");  
for(int i=0;i<4;i++)  
{  
for(int j=0;j<4;j++)  
{  
System.out.print(arr[i][j]+" " +"\t");  
}  
System.out.println();  
}  
RotateBy90(arr, n);  
}  
}   