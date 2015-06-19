import java.util.Scanner;
public class FindMax{
	
	public static void findMax(int[][] matrix,int i,int j,int max){
		if(i==matrix.length-1&&j==matrix.length-1)
			System.out.println("The max of the matrix is "+max);
		else{
			if(j==matrix.length-1){
				j=0;
				i++;
			}else{
				j++;
			}
			max=max>matrix[i][j]?max:matrix[i][j];
			findMax(matrix,i,j,max);
		}
		
	}
	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		int a=console.nextInt();
		int b=console.nextInt();
		int[][] matrix=new int[a][b];
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				matrix[i][j]=console.nextInt();
			}
		}
		findMax(matrix,0,0,matrix[0][0]);
	}
}