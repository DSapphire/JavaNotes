import java.util.Scanner;
public class Shudu{

	public static int[] getNextIJ(int i,int j){
		int[] a={i,j};
		if(j==8){
			a[1]=0;
			a[0]++;
		}else{
			a[1]++;
		}
		return a;
	}
	public static int[] getLastIJ(int i,int j){
		int[] a={i,j};
		if(j==0){
			a[1]=8;
			a[0]--;
		}else{
			a[1]--;
		}
		return a;
	}

	public static void inputMatrix(int[][] matrix){
		Scanner console=new Scanner(System.in);
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				matrix[i][j]=console.nextInt();
			}
		}
	}

	public static void printMatrix(int[][] matrix){
		
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				System.out.print(matrix[i][j]+"   ");
				if((j+1)%3==0)
					System.out.print("\t");
			}
			if((i+1)%3==0)
				System.out.println();
			System.out.println();
		}
	}

	public static boolean checkValid(int[][] matrix,int i,int j,int num){
		boolean right=true;
		int k;
		for(k=0;k<9;k++){
			if(k!=j&&matrix[i][k]==num){
				return false;
			}
		}
		if(right){
			for(k=0;k<9;k++){
				if(k!=i&&matrix[k][j]==num){
					return false;
				}
			}
		}
		if(right){
			int a=(int)(i/3)*3;
			int b=(int)(j/3)*3;
			for(int s=a;s<a+3;s++){
				for(int t=b;t<b+3;t++){
					if(s!=i&&t!=j&&matrix[s][t]==num){
						return false;
					}
				}
			}
		}
		return right;
	}

	public static void shudu(int[][] matrix){
		if(setNext(matrix,0,0)){
			printMatrix(matrix);
		}
	}

	public static boolean setNext(int[][] matrix,int i,int j){
		boolean setTrue=false;
		int[] next=getNextIJ(i,j);
		if(matrix[i][j]>0){
			if(i+j<16)
				setTrue=setNext(matrix,next[0],next[1]);
			else
				return true;

		}else{
			setTrue=setNum(matrix,i,j);
		}
		return setTrue;
	}
	
	public static boolean setNum(int[][] matrix,int i,int j){
		int num=0;
		boolean setnext=false;
		while(num++<9){
			if(checkValid(matrix,i,j,num)){
				matrix[i][j]=num;
				if(i+j==16)
					return true;
				else{
					int[] next=getNextIJ(i,j);
					setnext=setNext(matrix,next[0],next[1]);
				}
				if(setnext){
					break;
				}else{
					matrix[i][j]=0;
				}
			}
		}
		return setnext;
	}
	public static void main(String[] args) {
		int[][] matrix=new int[9][9];
		inputMatrix(matrix);
		shudu(matrix);
		
	}
}