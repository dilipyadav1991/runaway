package Other;

public class ZigZagMatrix {
	public static void main(String[] args)
    {
 
        int r = 4, c = 5;
        int mat[][] = { {1, 2, 3, 4, 5},
                        {6, 7, 8, 9, 10},
                        {11, 12, 13, 14, 15},
                        {16, 17, 18, 19, 20}
                      };
             
 
        printZigZag(r , c , mat);
    }

	private static void printZigZag(int row, int column, int[][] mat) {
		int r = 0;
		int count = 0;
		do{
			//Print from column 0 when count is even
			if(count % 2 == 0){
				for(int i = 0; i < column; i++){
					System.out.print(mat[r][i] + " ");
				}
			}else if(count % 2 != 0){//Print from last column when count is odd
				for(int i = column - 1; i >= 0; i--){
					System.out.print(mat[r][i] + " ");
				}
			}
			count++;
			r++;
		}while(r < row);
	}
}
