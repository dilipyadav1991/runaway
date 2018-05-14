package Other;

public class ZigZagMAtrix {
    public static int R,C;

	public static void main(String[] args) {
        int arr[][] = { {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16},
                        {17, 18, 19, 20}, };
         
        R=arr.length;
        C=arr[0].length;
         
        diagonalOrder(arr);
  }

	private static void diagonalOrder(int[][] arr) {
		//First column
		for(int i = 0; i < R; i++){
			int row = i;
			int column = 0;
			while(row >= 0 && column < C){
				System.out.print(arr[row][column] + " ");
				row--;
				column++;
			}
			System.out.println();
		}
		//Last row
		for(int j = 1; j < C; j++){
			int row = R - 1;
			int column = j;
			while(row >= 0 && column < C){
				System.out.print(arr[row][column] + " ");
				row--;
				column++;
			}
			System.out.println();
		}
	}
}
