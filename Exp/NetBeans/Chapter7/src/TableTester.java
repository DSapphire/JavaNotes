public class TableTester {
	public static void main(String args[]) { 
	  int myTable[][] = {{23, 45, 65, 34, 21, 67, 78}, 
	                     {46, 14, 18, 46, 98, 63, 88},
	                     {98, 81, 64, 90, 21, 14, 23}, 
	                     {54, 43, 55, 76, 22, 43, 33}}; 
       
      //显示二维表
      for (int row=0;row<4; row++) { 
        for (int col=0;col<7; col++) 
          System.out.print(myTable[row][col] + "  ");
        System.out.println(); 
      }
      //计算累加和最大的行号
      int sum, max, maxRow=0;
      max = 0; 
      for (int row=0; row<4; row++) { 
        sum = 0; 
        for (int col=0; col<7; col++)           
          sum += myTable[row][col];
        if (sum > max) { 
          max = sum;
          maxRow = row;
         } 
       } 
      System.out.println("Row " + maxRow + " has the highest sum of " + max); 
     }
 }
