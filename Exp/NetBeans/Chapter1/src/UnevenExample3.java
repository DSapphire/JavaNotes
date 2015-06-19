class UnevenExample3
{
  public static void main( String[] arg )
  {
    // 声明并构造一个2维数组
    int[ ][ ] uneven =
        { { 1, 9, 4 },
          { 0, 2},
          { 0, 1, 2, 3, 4 } };
      // 数组的长度 (行数)
    System.out.println("Length of array is: " + uneven.length );

    // 数组每一行的长度（列数）
    System.out.println("Length of row[0] is: " + uneven[0].length );
    System.out.println("Length of row[1] is: " + uneven[1].length );
    System.out.println("Length of row[2] is: " + uneven[2].length );
  }
}

