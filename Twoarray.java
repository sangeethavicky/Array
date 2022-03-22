
public class Twoarray {
	public static void main(String[]args)
	{
		int row=2; int columns=3;
		int[][] firstmatrix = {{1,2,3},{3,6,7}};
		int[][] secondmatrix= {{4,5,6},{3,6,9}};
		//Adding
		int[][]sum=new int[row][columns];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<columns;j++)
			{
				sum[i][j] = firstmatrix[i][j] + secondmatrix[i][j];
				
			}
		}
		
			//Display
			System.out.println("Sum of the matrices: ");
			for(int[] rows:sum)
			{
				for(int column:rows)
				{
					System.out.print(column+" ");
					
				}
				System.out.println();
			
			}
			
		}
	}


