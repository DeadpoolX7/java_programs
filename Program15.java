

class Program15{
		static int[][] multiPlicationMatrix(int[][] matrix){
			for(int i = 0; i<10; i++){
				for(int j = 0; j < 10; j++){
					matrix[i][j] = (i+10)*(j+10);
				}
			}
			return matrix;
		}
	public static void main(String[] args){
		int[][] matrix = new int[10][10];

		int[][] res = multiPlicationMatrix(matrix);
		
		for(int i = 0; i<res.length; i++){
			for(int j = 0; j<res[0].length; j++){
				System.out.print(" "+res[i][j]+" ");
			}
			System.out.println();
		}
	}	

}