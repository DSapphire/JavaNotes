public class EightQueensPuzzle{

	private int[][] table;
	private static final int cnt=8;
	private int queen;
	private static final int num=1;

	public EightQueensPuzzle(){
		table=new int[8][8];
		queen=0;
	}
	public void refreshTable(int k){
		for(int i=0;i<table.length;i++){
			for(int j=0;j<table[i].length;j++){
				table[i][j]=0;
			}
		}
		table[0][k]=num;
		queen=1;
	}
	public void printTable(){
		for(int i=0;i<table.length;i++){
			for(int j=0;j<table[i].length;j++){
				System.out.print(table[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public boolean checkValid(int i,int j){
		boolean right=true;
		int k;
		for(k=0;k<8;k++){
			if(table[i][k]==num){
				return false;
			}
		}
		if(right){
			for(k=0;k<8;k++){
				if(table[k][j]==num){
					return false;
				}
			}
		}
		if(right){
			for(k=1;k+i<8&&k+j<8;k++){
				if(table[i+k][j+k]==num){
					return false;
				}
			}
			for(k=1;i-k>-1&&j-k>-1;k++){
				if(table[i-k][j-k]==num){
					return false;
				}
			}
			for(k=1;k+i<8&&j-k>-1;k++){
				if(table[i+k][j-k]==num){
					return false;
				}
			}
			for(k=1;i-k>-1&&k+j<8;k++){
				if(table[i-k][j+k]==num){
					return false;
				}
			}
		}
		return right;
	}
	public void startQueen(){
		for(int i=0;i<table.length;i++){
			refreshTable(i);
			if(setQueen(1)){
				printTable();
			}
			System.out.println("\n\n");
		}
		
	}
	public boolean setQueen(int i){
		boolean setnext=false;
		int k=0;
		while(k<8&&i<8){
			if(checkValid(i,k)){
				table[i][k]=num;
				queen++;

				if(queen==8)
					return true;
				else{
					setnext=setQueen(i+1);
				}

				if(setnext){
					break;
				}else{
					table[i][k]=0;
					queen--;
				}
			}
			k++;
		}
		
		return setnext;
	}


	public static void main(String[] args) {
		EightQueensPuzzle eqp=new EightQueensPuzzle();
		eqp.startQueen();
	}
}