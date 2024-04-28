public class SpiralSquareMatrix 
{
    public static void main(String[] args) 
    {
        int A = 5;
        int[][] result = SSM(A);
        for (int i = 0; i < A; i++) 
        {
            for (int j = 0; j < A; j++) 
            {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] SSM(int A) 
    {
        int[][] matrix = new int[A][A];
        int num = 1;
        int left = 0, right = A - 1, top = 0, bottom = A - 1;
        while (num <= A * A) 
        {
            for (int i = left; i <= right; i++) 
            {
                matrix[top][i] = num++;
            }
            top++;
            for (int i = top; i <= bottom; i++) 
            {
                matrix[i][right] = num++;
            }
            right--;
            for (int i = right; i >= left; i--) 
            {
                matrix[bottom][i] = num++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) 
            {
                matrix[i][left] = num++;
            }
            left++;
        }
        return matrix;
    }
}

Output : 1 2 3 4 5
	   16 17 18 19 6
         15 24 25 20 7
         14 23 22 21 8
         13 12 11 10 9